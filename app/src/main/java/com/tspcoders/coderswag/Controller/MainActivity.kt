package com.tspcoders.coderswag.Controller


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tspcoders.coderswag.Adapters.CategoryAdapter
import com.tspcoders.coderswag.Adapters.CategoryRecycleAdapter
import com.tspcoders.coderswag.R
import com.tspcoders.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = this.adapter

        val layoutManager = LinearLayoutManager( this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        }


}

