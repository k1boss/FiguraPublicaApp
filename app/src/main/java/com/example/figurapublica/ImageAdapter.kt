package com.example.figurapublica

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter (var context: Context, var arrayList: ArrayList<ImageItem>) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = View.inflate(context, R.layout.grid_item_layout,null)

        var images:ImageView = view.findViewById(R.id.images)

        var imageItem:ImageItem = arrayList.get(position)

        images.setImageResource(imageItem.image!!)

        return view
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }
}