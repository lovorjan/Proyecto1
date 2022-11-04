package com.example.proyecto
/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.content.Intent
import android.view.View
import android.widget.AdapterView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : ArrayAdapter<String>
    private var original = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvTratamientos: ListView = findViewById(R.id.evTratamientos)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)
        lvTratamientos.adapter = adapter

        val fabNuevoTratamiento: FloatingActionButton = findViewById(R.id.fabNuevoTratamiento)

        fabNuevoTratamiento.setOnClickListener {
            nuevoTratamiento()
        }


        lvTratamientos.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            val tratamiento = adapter.getItem(i)
            original = tratamiento.toString()

            val intent = Intent(this, VerTratamiento::class.java)

            intent.putExtra("tratamiento", tratamiento)
            startActivityForResult(intent, 2)
        }

    }

    private fun nuevoTratamiento() {

        val intent = Intent (this, NuevoTratamiento::class.java)

        startActivityForResult(intent, 1)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 1){
            if(resultCode == RESULT_OK){

                if(data != null) {
                    var categoria = data.getStringExtra("Categoria")

                    val tratamiento = data.getStringExtra("Tratamiento")

                    val fecha = data.getStringExtra("Fecha")

                    val allTratamiento = "$categoria > $tratamiento > $fecha"
                    adapter.add(allTratamiento)
                }
            }
        }
        if(requestCode == 2 && resultCode == RESULT_OK){
            if(data != null) {
                if(data.hasExtra("Borrar")){
                    adapter.remove(original)
                }

            }else {
                val intent = Intent (this, EditarTratamientoActivity::class.java)
                intent.putExtra("Tratamiento", original)
                startActivityForResult(intent, 3)
            }
        }
    }
}
 */
