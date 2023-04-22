package com.nikifovadim.animationflower

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad = AnimationDrawable()

        ad.addFrame(resources.getDrawable(R.drawable.one, null), 1000)
        ad.addFrame(resources.getDrawable(R.drawable.two, null),1000)
        ad.addFrame(resources.getDrawable(R.drawable.tree, null),1000)
        ad.addFrame(resources.getDrawable(R.drawable.four, null),1000)
        ad.addFrame(resources.getDrawable(R.drawable.five, null),1000)

        val imageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button_start)

        imageView.setImageResource((resources.getDrawable(R.drawable.one, null))
        imageView.background = ad

        button.setOnClickListener {
            ad.start()
        }

        //ad.start()
    }
}