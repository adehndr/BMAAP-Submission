package com.example.comicdb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvComics : RecyclerView
    private var list : ArrayList<Comic> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvComics = findViewById(R.id.rv_comics)
        rvComics.setHasFixedSize(true)
        list.addAll(ComicsData.listdata)
        showRecyclerViewList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode : Int)
    {
        when (selectedMode)
        {
            R.id.ic_info ->
            {
                //Toast.makeText(applicationContext, "This is about me", Toast.LENGTH_SHORT).show()
                val moveIntentAbout = Intent(this,ActivityAbout::class.java)
                startActivity(moveIntentAbout)
            }

            R.id.ic_sort_ascending->
            {
                list.sortBy { it.tittle }
                showRecyclerViewList()
            }

            R.id.ic_sort_descending ->
            {
                list.sortByDescending { it.tittle }
                showRecyclerViewList()
            }
        }
    }

    private fun showSelectedComic(comic: Comic)
    {
        //Isi logic nya disini
        val goToDetailActivity = Intent(this,ActivityDetail::class.java).apply {
            putExtra(ActivityDetail.EXTRA_TITTLE, comic.tittle)
            putExtra(ActivityDetail.EXTRA_GENRE,comic.tag)
            putExtra(ActivityDetail.EXTRA_DETAIL,comic.detail)
            putExtra(ActivityDetail.EXTRA_PHOTO,comic.photo)
        }
        startActivity(goToDetailActivity)

    }
    private fun showRecyclerViewList()
    {
        rvComics.layoutManager = LinearLayoutManager(this)
        val listComicAdapter = ListComicAdapter(list)
        rvComics.adapter = listComicAdapter

        listComicAdapter.setOnItemClickCallback(object : ListComicAdapter.OnItemClickCallback
        {
            override fun onItemClicked(data: Comic) {
            showSelectedComic(data)
            }
        })
    }
}