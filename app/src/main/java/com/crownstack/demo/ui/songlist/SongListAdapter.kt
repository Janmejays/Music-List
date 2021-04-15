package com.crownstack.demo.ui.songlist

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.crownstack.demo.R
import com.crownstack.demo.`interface`.OnItemClicked
import com.crownstack.demo.models.response.Result
import kotlinx.android.synthetic.main.item_row_list_player.view.*

class SongListAdapter(
    var context: Context,
    var suggestedList: ArrayList<Result>,
    val onItemClicked: OnItemClicked
) : RecyclerView.Adapter<SongListAdapter.MyHolder>() {


    override fun getItemCount(): Int {
        return suggestedList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.onBind(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val mViewGuess = LayoutInflater.from(context).inflate(
            R.layout.item_row_list_player,
            parent, false
        )
        return MyHolder(mViewGuess)
    }


    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(position: Int) {
            itemView.tv_arstistt_name.text = suggestedList[position].artistName
            itemView.tv_track_name.text = suggestedList[position].trackName

            Glide.with(context)
                .load(suggestedList[position].artworkUrl60)
                .into(itemView.ivPlayerImg)

            itemView.setOnClickListener {
                onItemClicked.onItemClick(position, suggestedList[position])
            }
            
    }

        init {

        }


    }

}