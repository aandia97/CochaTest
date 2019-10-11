package io.github.n0g4y0.cochatest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonVerdad = findViewById<Button>(R.id.verdad_button) as Button
        botonVerdad.setOnClickListener {
            val toast = Toast . makeText (this@MainActivity, "¡Correcto!", Toast.LENGTH_SHORT)
            toast.show()
            toast.setGravity(Gravity.TOP,0,500)

        }
        val botonFalso = findViewById<Button>(R.id.falso_button) as Button
        botonFalso.setOnClickListener {
            val toast1 = Toast.makeText(this@MainActivity,"¡Correcto!",Toast.LENGTH_SHORT)
            toast1.show()
            toast1.setGravity(Gravity.TOP,0,500)
        }
    }
}



private operator fun View.invoke(layout: View?) {

}
