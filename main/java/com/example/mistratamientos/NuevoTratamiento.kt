package com.example.mistratamientos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NuevoTratamiento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tratamiento_nuevo)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_nuevo_tratamiento, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.opcion_nueva_guardar){
            Guardar()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun Guardar() {

        val sCategoria : Spinner = findViewById(R.id.elEditarCategoria)
        val PreCategoria: String = sCategoria.selectedItem as String


        var categoria = ""
        if (PreCategoria == "Pediatria (P)"){
            categoria="(P)"}
        if (PreCategoria == "Dentista (D)"){
            categoria="(D)"}
        if (PreCategoria == "Medicina General (M)"){
            categoria="(M)"}
        if (PreCategoria == "Laboratorio (L)"){
            categoria="(L)"}
        if (PreCategoria == "Donación de sangre (S)"){
            categoria="(S)"}
        if (PreCategoria == "Oftalmologia (O)"){
            categoria="(O)"}
        if (PreCategoria == "Aplicación de Inyección (A)"){
            categoria="(A)"}

        val etTratamiento : EditText = findViewById(R.id.esEditarTratamiento)
        val tratamiento : String = etTratamiento.text.toString()

        val etFecha : EditText = findViewById(R.id.esEditarFecha)
        val fecha : String = etFecha.text.toString()

        if (PreCategoria.isNotEmpty() && tratamiento.isNotEmpty() && (fecha.isNotEmpty() || fecha.isNotBlank())){
            val intent = Intent()
            intent.putExtra("Categoria", categoria)
            intent.putExtra("Tratamiento", tratamiento)
            intent.putExtra("Fecha", fecha)

            setResult(RESULT_OK, intent)
            finish()
        }else{
            Toast.makeText(this, "hocurrio un herror", Toast.LENGTH_SHORT).show()
        }
    }
}