package com.example.subscription

import android.R
import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.subscription.databinding.ActivityMainBinding
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var imageUrl: ArrayList<String>
    lateinit var titles: ArrayList<String>
    lateinit var descs: ArrayList<String>
    lateinit var sliderView: SliderView
    lateinit var sliderAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        sliderView = binding.slider
        imageUrl = ArrayList()
        titles = ArrayList()
        descs = ArrayList()

        titles.add("Pay Once")
        titles.add("Pay Twice")
        titles.add("Pay Three Times")

        descs.add("Pay Once")
        descs.add("Pay Once")
        descs.add("Pay Once")


        imageUrl =
            (imageUrl + "https://practice.geeksforgeeks.org/_next/image?url=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fimg-practice%2Fbanner%2Fdsa-self-paced-thumbnail.png&w=1920&q=75") as ArrayList<String>
        imageUrl =
            (imageUrl + "https://practice.geeksforgeeks.org/_next/image?url=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fimg-practice%2Fbanner%2Fdata-science-live-thumbnail.png&w=1920&q=75") as ArrayList<String>
        imageUrl =
            (imageUrl + "https://practice.geeksforgeeks.org/_next/image?url=https%3A%2F%2Fmedia.geeksforgeeks.org%2Fimg-practice%2Fbanner%2Ffull-stack-node-thumbnail.png&w=1920&q=75") as ArrayList<String>

        sliderAdapter = SliderAdapter( imageUrl, titles, descs)
        sliderView.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH

        sliderView.setIndicatorMargins(0,30,0,0)

        sliderView.indicatorRadius = 4
        sliderView.indicatorSelectedColor = parseColor("#2688E9")

        sliderView.indicatorUnselectedColor = parseColor("#F2F5FA")

        sliderView.setIndicatorAnimation(IndicatorAnimationType.THIN_WORM)


        sliderView.setSliderAdapter(sliderAdapter)
        sliderView.scrollTimeInSec = 3
        sliderView.isAutoCycle = true
        sliderView.startAutoCycle()



    }
}