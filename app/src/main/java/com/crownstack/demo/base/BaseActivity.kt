package com.crownstack.demo.base

import androidx.appcompat.app.AppCompatActivity
import com.crownstack.demo.webservice.RetrofitUtil
import com.crownstack.demo.webservice.ApiInterface

open class BaseActivity : AppCompatActivity() {

    val apiInterface: ApiInterface by lazy {
        RetrofitUtil.createBaseApiService()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }
}