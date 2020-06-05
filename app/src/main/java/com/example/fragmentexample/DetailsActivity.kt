package com.example.fragmentexample

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity

class DetailsActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            /*
            If the screen is in landscape mode , we can show dialogue in-line
            with the list so we don't need this activity
             */
            finish()
            return;
        }

        if(savedInstanceState == null)
        {
            //During initial setup , plug in the DetailsFragment

            val details = DetailsFragment().apply {
                arguments = intent.extras
            }
            supportFragmentManager.beginTransaction()
                .add(android.R.id.content , details)
                .commit()
        }
    }
}