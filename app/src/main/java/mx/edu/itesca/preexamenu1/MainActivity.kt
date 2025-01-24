package mx.edu.itesca.preexamenu1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var etC: EditText
    private lateinit var etF: EditText
    private lateinit var btnGC: Button
    private lateinit var btnGF: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etC = findViewById(R.id.etC)
        etF = findViewById(R.id.etF)
        btnGC = findViewById(R.id.btnGC)
        btnGF = findViewById(R.id.btnGF)


        btnGC.setOnClickListener {
            try {
                val fahrenheit = etF.text.toString().toDouble()
                val celsius = (fahrenheit - 32) * 5/9
                etC.setText(celsius.toString())
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Por favor, ingresa un valor válido", Toast.LENGTH_SHORT).show()
            }

        }


        btnGF.setOnClickListener {
            try {
                val celsius = etC.text.toString().toDouble()
                val fahrenheit = (celsius * 9/5) + 32
                etF.setText(fahrenheit.toString())
            } catch (e: NumberFormatException) {

                Toast.makeText(this, "Por favor, ingresa un valor válido", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
