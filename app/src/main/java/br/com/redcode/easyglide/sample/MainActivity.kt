package br.com.redcode.easyglide.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.redcode.easyglide.library.load
import br.com.redcode.easyglide.library.loadWithCircleTransform
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val image = "http://pedrofsn.com.br/images/me.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        imageView1.load(image)

        imageView2.loadWithCircleTransform(
            url = image,
            roundingRadiusCorner = 30
        )

        imageView3.loadWithCircleTransform(url = image)
    }
}
