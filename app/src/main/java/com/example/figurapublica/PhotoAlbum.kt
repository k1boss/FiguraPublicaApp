package com.example.figurapublica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.annotation.IntegerRes
import androidx.core.view.isVisible

class PhotoAlbum : AppCompatActivity() , AdapterView.OnItemClickListener{
    private var gridView:GridView? = null
    private var arrayList:ArrayList<ImageItem>? = null
    private var imageAdapter:ImageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_album)

        gridView = findViewById(R.id.photoGridView)
        arrayList = ArrayList()
        arrayList = setDataList()
        imageAdapter = ImageAdapter(applicationContext, arrayList!!)
        gridView?.adapter = imageAdapter
        gridView?.onItemClickListener = this


        val backToBiography = findViewById<ImageButton>(R.id.backToBiography)
        val goToMusicList = findViewById<ImageButton>(R.id.goToMusicList)

        backToBiography.setOnClickListener {
            val intent = Intent(this, Biography::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
            finish()
        }

        goToMusicList.setOnClickListener{
            val intent = Intent(this, MusicList::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId)
        {
            R.id.howToMenu -> {
                val howToIntent = Intent(this, HowTo::class.java)
                startActivity(howToIntent)
                overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
                finish()
            }

            R.id.aboutMenu -> {
                val howToIntent = Intent(this, AboutPage::class.java)
                startActivity(howToIntent)
                overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setDataList() : ArrayList<ImageItem>{
        var arrayList: ArrayList<ImageItem> = ArrayList()

        arrayList.add(ImageItem(R.drawable.bbking))
        arrayList.add(ImageItem(R.drawable.image1))
        arrayList.add(ImageItem(R.drawable.image2))
        arrayList.add(ImageItem(R.drawable.image3))
        arrayList.add(ImageItem(R.drawable.image4))
        arrayList.add(ImageItem(R.drawable.image5))
        arrayList.add(ImageItem(R.drawable.image6))
        arrayList.add(ImageItem(R.drawable.image7))
        arrayList.add(ImageItem(R.drawable.image8))

        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val fullScreenView = findViewById<ImageView>(R.id.fullScreenView)
        var imageItem = arrayList?.get(position)

        if (imageItem != null) {
            fullScreenView.setImageResource(imageItem.image!!)
            fullScreenView.isVisible = true
        }

        fullScreenView.setOnClickListener {
            fullScreenView.isVisible = false
        }

    }
}