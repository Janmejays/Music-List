package com.crownstack.demo.base

import androidx.lifecycle.ViewModel
import com.crownstack.demo.webservice.RetrofitUtil
import com.crownstack.demo.webservice.ApiInterface

abstract class BaseViewModel: ViewModel() {

    val apiInterface: ApiInterface by lazy {
        RetrofitUtil.createBaseApiService()
    }


}