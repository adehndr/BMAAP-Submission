package com.example.comicdb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListComicAdapter(private val listComic : ArrayList<Comic>) : RecyclerView.Adapter<ListComicAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvTittle : TextView = itemView.findViewById(R.id.tv_item_tittle)
        var imgPhotos : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvGenre : TextView = itemView.findViewById(R.id.tv_item_genre)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_row_comic,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listComic.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val comic = listComic[position]

        Glide.with(holder.itemView.context)
            .load(comic.photo)
            .apply(RequestOptions().override(110,136))
            .into(holder.imgPhotos)

        holder.tvTittle.text = comic.tittle
        holder.tvGenre.text = comic.tag
        holder.tvDetail.text = comic.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listComic[holder.adapterPosition])
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Comic)
    }


}