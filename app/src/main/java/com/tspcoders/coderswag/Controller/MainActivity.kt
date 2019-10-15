package com.tspcoders.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.tspcoders.coderswag.Adapters.CategoryAdapter
import com.tspcoders.coderswag.Model.Category
import com.tspcoders.coderswag.R
import com.tspcoders.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        }

    }

