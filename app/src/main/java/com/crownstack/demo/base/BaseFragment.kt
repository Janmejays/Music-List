package com.crownstack.demo.base

import androidx.fragment.app.Fragment
import com.crownstack.demo.webservice.RetrofitUtil
import com.crownstack.demo.webservice.ApiInterface

open class BaseFragment: Fragment() {

    val apiInterface: ApiInterface by lazy {
        RetrofitUtil.createBaseApiService()
    }

}