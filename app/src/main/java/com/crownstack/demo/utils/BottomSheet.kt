package com.crownstack.demo.utils

import android.content.Context
import android.view.LayoutInflater
import com.crownstack.demo.R
import com.crownstack.demo.models.response.Result
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheet(
    var context: Context,
    var layoutInflater: LayoutInflater,
    val selectedSong: Result
) {
    val view = layoutInflater.inflate(R.layout.bottom_sheet_clicked, null)
    val dialog = BottomSheetDialog(context)

}