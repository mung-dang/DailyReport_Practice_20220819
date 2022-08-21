package com.example.dailyreport_practice_20220819

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.dailyreport_practice_20220819.adapters.MainPagerAdapter
import com.example.dailyreport_practice_20220819.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mPagerAdapter: MainPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvent()
        setValues()
    }

    override fun setupEvent() {
        binding.mainViewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    when (position){
                        0 -> binding.maidBottomNav.selectedItemId = R.id.feed
                        1 -> binding.maidBottomNav.selectedItemId = R.id.statics
                        2 -> binding.maidBottomNav.selectedItemId = R.id.home
                        3 -> binding.maidBottomNav.selectedItemId = R.id.table
                        4 -> binding.maidBottomNav.selectedItemId = R.id.setting
                    }
                }
            }
        )

        binding.maidBottomNav.setOnItemSelectedListener {
            when (it.itemId){
                R.id.feed -> binding.mainViewPager.currentItem = 0
                R.id.statics -> binding.mainViewPager.currentItem = 1
                R.id.home -> binding.mainViewPager.currentItem = 2
                R.id.table -> binding.mainViewPager.currentItem = 3
                R.id.setting -> binding.mainViewPager.currentItem = 4
            }
            return@setOnItemSelectedListener true
        }
    }

    override fun setValues() {
        mPagerAdapter = MainPagerAdapter(this)
        binding.mainViewPager.adapter = mPagerAdapter

        binding.mainViewPager.currentItem = 2
        binding.maidBottomNav.selectedItemId = R.id.home
    }
}