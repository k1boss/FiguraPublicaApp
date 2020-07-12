package com.example.figurapublica

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MusicList : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    lateinit var playSong1: ImageButton
    lateinit var playSong2: ImageButton
    lateinit var playSong3: ImageButton
    lateinit var playSong4: ImageButton
    lateinit var playSong5: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_list)

        val backtoAlbum = findViewById<ImageButton>(R.id.backToAlbum)

        backtoAlbum.setOnClickListener {
            val goBackToAlbum = Intent(this, PhotoAlbum::class.java)
            this.startActivity(goBackToAlbum)
            overridePendingTransition(R.anim.animation_enter,R.anim.animation_leave)
            finish()
        }

        playSong1 = findViewById<ImageButton>(R.id.playSong1)
        playSong2 = findViewById<ImageButton>(R.id.playSong2)
        playSong3 = findViewById<ImageButton>(R.id.playSong3)
        playSong4 = findViewById<ImageButton>(R.id.playSong4)
        playSong5 = findViewById<ImageButton>(R.id.playSong5)

        val youtubeSong1 = findViewById<ImageButton>(R.id.youtubeSong1)
        val youtubeSong2 = findViewById<ImageButton>(R.id.youtubeSong2)
        val youtubeSong3 = findViewById<ImageButton>(R.id.youtubeSong3)
        val youtubeSong4 = findViewById<ImageButton>(R.id.youtubeSong4)
        val youtubeSong5 = findViewById<ImageButton>(R.id.youtubeSong5)

        mediaPlayer = MediaPlayer.create(this, R.raw.the_thrill_is_gone)

        playSong1.setOnClickListener {
            setAllButtonsToPlay()
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer = MediaPlayer.create(this, R.raw.the_thrill_is_gone)
                mediaPlayer.start()
                playSong1.setImageResource(android.R.drawable.ic_media_pause)
            }
            else
            {
                mediaPlayer.stop()
                playSong1.setImageResource(android.R.drawable.ic_media_play)
            }
        }

        playSong2.setOnClickListener {
            setAllButtonsToPlay()
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer = MediaPlayer.create(this, R.raw.riding_with_the_king)
                mediaPlayer.start()
                playSong2.setImageResource(android.R.drawable.ic_media_pause)
            }
            else
            {
                mediaPlayer.stop()
                playSong2.setImageResource(android.R.drawable.ic_media_play)
            }
        }

        playSong3.setOnClickListener {
            setAllButtonsToPlay()
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer = MediaPlayer.create(this, R.raw.three_oclock_blues)
                mediaPlayer.start()
                playSong3.setImageResource(android.R.drawable.ic_media_pause)
            }
            else
            {
                mediaPlayer.stop()
                playSong3.setImageResource(android.R.drawable.ic_media_play)
            }
        }

        playSong4.setOnClickListener {
            setAllButtonsToPlay()
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer = MediaPlayer.create(this, R.raw.ten_long_years)
                mediaPlayer.start()
                playSong4.setImageResource(android.R.drawable.ic_media_pause)
            }
            else
            {
                mediaPlayer.stop()
                playSong4.setImageResource(android.R.drawable.ic_media_play)
            }
        }

        playSong5.setOnClickListener {
            setAllButtonsToPlay()
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer = MediaPlayer.create(this, R.raw.worried_life_blues)
                mediaPlayer.start()
                playSong5.setImageResource(android.R.drawable.ic_media_pause)
            }
            else
            {
                mediaPlayer.stop()
                playSong4.setImageResource(android.R.drawable.ic_media_play)
            }
        }

        youtubeSong1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kpC69qIe02E"))
            startActivity(intent)
        }

        youtubeSong2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Qi8iU-dgIL0"))
            startActivity(intent)
        }

        youtubeSong3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dPgo8IAPQDc"))
            startActivity(intent)
        }

        youtubeSong4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=DTGiqpor4aE"))
            startActivity(intent)
        }

        youtubeSong5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eJmyKIQktPk"))
            startActivity(intent)
        }
    }

    private fun setAllButtonsToPlay()
    {
        playSong1.setImageResource(android.R.drawable.ic_media_play)
        playSong2.setImageResource(android.R.drawable.ic_media_play)
        playSong3.setImageResource(android.R.drawable.ic_media_play)
        playSong4.setImageResource(android.R.drawable.ic_media_play)
        playSong5.setImageResource(android.R.drawable.ic_media_play)
    }
}