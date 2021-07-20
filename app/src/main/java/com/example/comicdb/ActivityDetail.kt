package com.example.comicdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ActivityDetail : AppCompatActivity() {
    private lateinit var imageDetail : ImageView
    private lateinit var tittleDetail : TextView
    private lateinit var genreDetail : TextView
    private lateinit var detailDetail : TextView
    companion object
    {
        const val EXTRA_TITTLE = "extra_tittle"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageDetail = findViewById(R.id.detail_image)
        genreDetail = findViewById(R.id.detail_genre)
        detailDetail = findViewById(R.id.detail_detail)
        tittleDetail = findViewById(R.id.detail_title)

        showComicDetail()
        val title : String? = intent.getStringExtra(EXTRA_TITTLE)
        if (title != null) {
            setActionBarTitle(title)
        }
    }

    private fun showComicDetail()
    {
        tittleDetail.text = intent.getStringExtra(EXTRA_TITTLE)
        genreDetail.text = intent.getStringExtra(EXTRA_GENRE)
        detailDetail.text = intent.getStringExtra(EXTRA_DETAIL)
        imageDetail.setImageResource(intent.getIntExtra(EXTRA_PHOTO,0))
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}