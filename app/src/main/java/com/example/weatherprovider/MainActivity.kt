package com.example.weatherprovider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.example.weatherprovider.model.Location


class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager
    private lateinit var wordViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)

        val model = ViewModelProviders.of(this)[MainViewModel::class.java]
        model.allLocations.observe(this, Observer<List<Location>> { locations ->
            println(locations)
        })
    }
}
 