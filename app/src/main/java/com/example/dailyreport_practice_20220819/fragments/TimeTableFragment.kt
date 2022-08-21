package com.example.dailyreport_practice_20220819.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.dailyreport_practice_20220819.R
import com.example.dailyreport_practice_20220819.databinding.FragmentHomeBinding
import com.example.dailyreport_practice_20220819.databinding.FragmentTimeTableBinding

class TimeTableFragment :  BaseFragment(){

    lateinit var binding: FragmentTimeTableBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_time_table, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {

    }
}