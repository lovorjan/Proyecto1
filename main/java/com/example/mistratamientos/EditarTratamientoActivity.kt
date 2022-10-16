package com.example.mistratamientos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import java.util.regex.Pattern

class EditarTratamientoActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_tratamiento)

        configUI()
    }

    private fun configUI() {
        if (intent != null) {
            val fullTratamiento = intent.getStringExtra("Tratamiento")
            val sep = ">"
            var array = Pattern.compile(sep).split(fullTratamiento)

            val evTratamiento: TextView = findViewById(R.id.avTratamiento)
            evTratamiento.setText(array[1])
            val avFecha: TextView = findViewById(R.id.ovFecha)
            avFecha.setText(array[2])
            val cat: String = array[0]
            val ivCategoria: ImageView = findViewById(R.id.uvCategoria)


            when (cat) {
                "(P) " -> {
                    ivCategoria.setImageResource(R.drawable.pediatria)
                }
                "(D) "-> {
                    ivCategoria.setImageResource(R.drawable.dentista)
                }
                "(M) " -> {
                    ivCategoria.setImageResource(R.drawable.medicina_general)
                }
                "(L)" ->{
                    ivCategoria.setImageResource(R.drawable.laboratorio)
                }
                "(S)" ->{
                    ivCategoria.setImageResource(R.drawable.donacion)
                }
                "(O)" ->{
                    ivCategoria.setImageResource(R.drawable.oculista)
                }
                "(A)" ->{
                    ivCategoria.setImageResource(R.drawable.inyeccion)
                }
            }
        }
    }


    override fun onCreateOptionsMenu(menu1: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_modificar_tratamiento, menu1)
        return super.onCreateOptionsMenu(menu1)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.opcion_guardar -> {
                Guardar()

            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun Guardar() {
        val intent = Intent()
        intent.putExtra("Tratamiento",true)

        setResult(RESULT_OK, intent)
        finish()
    }


}