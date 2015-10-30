package com.gmail.markdevw.tryingkotlin.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

import com.gmail.markdevw.tryingkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mToolbar = findViewById(R.id.tb_activity_main) as Toolbar
        setSupportActionBar(mToolbar)

        val mRecyclerView = findViewById(R.id.rv_activity_main) as RecyclerView
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_add -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.action_remove -> Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}

