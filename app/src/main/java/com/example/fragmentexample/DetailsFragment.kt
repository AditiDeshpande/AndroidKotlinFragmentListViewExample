package com.example.fragmentexample

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.TextView



/**
 * A simple [Fragment] subclass.
 * Use the [DetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailsFragment : Fragment() {

    val shownIndex: Int by lazy {
        arguments?.getInt("index", 0) ?: 0
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        if(container == null)
        {
            /*
            We have different layouts . and in one of them this fragment's containing frame
            doesn't exist. The Fragment may still be created from it's saved state,
            but there is no reason to try to create it's view hierarchy because it doesn't
            displayed. Note this isn't needed -- we could just run the code below , where
            we would create and return the view hierarchy; it would just never be used
             */
            return null;
        }

        val text = TextView(activity).apply {
            val padding: Int = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP ,
                4f ,
                activity?.resources?.displayMetrics).toInt()

            setPadding(padding , padding , padding , padding)
            text = Shakespeare.DIALOGUE[shownIndex]

        }

        return ScrollView(activity).apply {
            addView(text)
        }
    }

    companion object {
        /*
        Create a new instance of DetailsFragment , initialized to show the text at 'index'
         */

        fun newInstance(index : Int) : DetailsFragment
        {

            val f = DetailsFragment()

            //supply index input as an argument

            val args = Bundle()
            args.putInt("index" , index)
            f.arguments = args

            return f
        }
    }

}
