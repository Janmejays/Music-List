package com.crownstack.demo.`interface`

import com.crownstack.demo.models.response.Result

interface OnItemClicked {
    fun onItemClick(pos: Int, result: Result){
    }
}