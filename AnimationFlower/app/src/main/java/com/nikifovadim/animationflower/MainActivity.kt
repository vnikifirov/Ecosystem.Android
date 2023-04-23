package com.nikifovadim.animationflower

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var IsStarted : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad = AnimationDrawable()

        ad.addFrame(resources.getDrawable(R.drawable.one, null), 2000)
        ad.addFrame(resources.getDrawable(R.drawable.two, null),1000)
        ad.addFrame(resources.getDrawable(R.drawable.tree, null),2000)
        ad.addFrame(resources.getDrawable(R.drawable.four, null),3000)
        ad.addFrame(resources.getDrawable(R.drawable.five, null),4000)

        val imageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button_start)

        imageView.background = ad

        button.setOnClickListener {
            if (IsStarted)
            {
                ad.stop()
                this.IsStarted = false
                button.text = "Play ⏯️"
            }
            else
            {
                ad.start()
                this.IsStarted = true
                button.text = "Stop \uD83D\uDED1"
            }
        }
    }
}