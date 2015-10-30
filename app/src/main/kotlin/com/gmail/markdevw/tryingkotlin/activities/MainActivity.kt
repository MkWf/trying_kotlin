package com.gmail.markdevw.tryingkotlin.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar

import com.gmail.markdevw.tryingkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mToolbar = findViewById(R.id.tb_activity_main) as Toolbar
        val mRecyclerView = findViewById(R.id.rv_activity_main) as RecyclerView
    }
}
