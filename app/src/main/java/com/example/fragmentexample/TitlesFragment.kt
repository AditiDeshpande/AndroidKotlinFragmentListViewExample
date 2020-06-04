package com.example.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment


/**
 * A simple [Fragment] subclass.
 * Use the [TitlesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitlesFragment : ListFragment() {


    private var dualPane: Boolean = false
    private var curCheckPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_titles, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val context = context as FragmentLayoutActivity

        // Populate list with our static array of titles.
        listAdapter = ArrayAdapter<String>(
            context,
            android.R.layout.simple_list_item_activated_1,
            Shakespeare.TITLES
        )



    }

}