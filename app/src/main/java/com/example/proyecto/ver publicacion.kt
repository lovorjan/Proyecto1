package com.example.proyecto
/*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import java.util.regex.Pattern

class VerTratamiento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_tratamiento)

        configUI()
    }

    private fun configUI() {
        if (intent != null) {
            val fullTratamiento = intent.getStringExtra("Tratamiento")
            val sep = ">"
            var array = Pattern.compile(sep).split(fullTratamiento)

            val tvTratamiento: TextView = findViewById(R.id.avTratamiento)
            tvTratamiento.setText(array[1])
            val tvFecha: TextView = findViewById(R.id.ovFecha)
            tvFecha.setText(array[2])
            val cat: String = array[0]
            val ivCategoria: ImageView = findViewById(R.id.uvCategoria)

            when (cat) {
                "(P) " -> {
                    ivCategoria.setImageResource(R.drawable.pediatria)
                }
                "(D) " -> {
                    ivCategoria.setImageResource(R.drawable.dentista)
                }
                "(M) " -> {
                    ivCategoria.setImageResource(R.drawable.medicina_general)
                }
                "(L)" -> {
                    ivCategoria.setImageResource(R.drawable.laboratorio)
                }
                "(S)" -> {
                    ivCategoria.setImageResource(R.drawable.donacion)
                }
                "(O)" -> {
                    ivCategoria.setImageResource(R.drawable.oculista)
                }
                "(A)" -> {
                    ivCategoria.setImageResource(R.drawable.inyeccion)
                }
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_ver_tratamiento, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.opcion_editar -> {
                editar()
            }
            R.id.opcion_borrar -> {
                borrar()
            }
        }


        return super.onOptionsItemSelected(item)
    }

    private fun borrar() {
        val intent = Intent()
        intent.putExtra("Borrar",true)

        setResult(RESULT_OK, intent)
        finish()
    }

    private fun editar() {
        val intent = Intent()
        intent.putExtra("Editar",true)

        setResult(RESULT_OK, intent)
        finish()
    }

}

 */