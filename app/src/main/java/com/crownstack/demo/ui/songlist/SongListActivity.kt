package com.crownstack.demo.ui.list

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.crownstack.demo.R
import com.crownstack.demo.`interface`.OnItemClicked
import com.crownstack.demo.models.response.ResponseSongsList
import com.crownstack.demo.models.response.Result
import com.crownstack.demo.ui.songlist.SongListAdapter
import com.crownstack.demo.utils.HelperClass
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_player_list.*


class SongListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_list)
        getjsondata()
    }


    private fun getjsondata() {
        val jsonFileString =
            HelperClass().getJsonDataForPlayers(this, R.raw.michal_jackson_song_list)
        Log.e("data", jsonFileString!!)

        val gson = Gson()
        val lists = object : TypeToken<ResponseSongsList>() {}.type

        val songList: ResponseSongsList = gson.fromJson(jsonFileString, lists)


        rvPlayerList.adapter = SongListAdapter(this, songList.results, object : OnItemClicked {
            override fun onItemClick(pos: Int, result: Result) {

            }

        })
    }


}