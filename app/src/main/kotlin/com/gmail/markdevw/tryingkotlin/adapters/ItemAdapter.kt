package com.gmail.markdevw.tryingkotlin.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.gmail.markdevw.tryingkotlin.R
import com.gmail.markdevw.tryingkotlin.adapters.models.PersonItem

/**
 * Created by Mark on 10/30/2015.
 */


class ItemAdapter(val context: Context) : RecyclerView.Adapter<ItemAdapter.ItemAdapterViewHolder>(){

    var people : List<PersonItem> = listOf(
            PersonItem("Person1", 30),
            PersonItem("Person2", 30),
            PersonItem("Person3", 30),
            PersonItem("Person4", 30),
            PersonItem("Person5", 30))

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemAdapterViewHolder? {
        val inflate = LayoutInflater.from(parent?.context).inflate(R.layout.person_item, parent, false);
        return ItemAdapterViewHolder(inflate);
    }

    override fun onBindViewHolder(holder: ItemAdapterViewHolder?, position: Int) {
        holder?.update(people.get(position))
    }

    override fun getItemCount(): Int {
        return people.size
    }

    inner class ItemAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener({
                Toast.makeText(context, "Toast", Toast.LENGTH_SHORT).show()
            })
        }

        var item : PersonItem? = null
        var tv_name : TextView = itemView.findViewById(R.id.item_name) as TextView

        public fun update(personItem: PersonItem){
            this.item = personItem
            tv_name.setText(personItem.name)
        }
    }
}