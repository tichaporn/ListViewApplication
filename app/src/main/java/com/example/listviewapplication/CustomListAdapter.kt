package com.example.listviewapplication

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomListAdapter(val context: Activity, val name:Array<String>, val stdid:Array<String>, val img:Array<Int>)
    : ArrayAdapter<String>(context, R.layout.layout_custom_list, name){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.layout_custom_list, null, true)

        val imageView = rowView.findViewById<ImageView>(R.id.imageView)
        val textName = rowView.findViewById<TextView>(R.id.textViewName)
        val textID = rowView.findViewById<TextView>(R.id.textViewID)

        textName.text = name[position]
        textID.text = stdid[position]
        imageView.setImageResource(img[position])

        return rowView
    }
}