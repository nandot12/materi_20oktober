package com.example.myapplication

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class WisataAdapter(val name : Array<String>,val gambar : Array<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return name.size
    }

    override fun getItem(p0: Int): Any {
        return  0
    }

    override fun getItemId(p0: Int): Long {
        return  0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layout = LayoutInflater.from(p2?.context).inflate(R.layout.item_wisata,p2,false)

        val img = layout.findViewById<ImageView>(R.id.imageView)
        val textview = layout.findViewById<TextView>(R.id.textView)
        textview.setText(name[p0])
        img.setImageResource(gambar[p0])

        return layout
    }
}