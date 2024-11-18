package com.example.projetoelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Familia_e_NecessidadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_familia_enecessidades)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Logica de programação da Activity "Família e Necessidades Cotidianas"

    // Botão "Inicio"
    fun Botao_Inicio(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Creches Próximas"
    fun Creches(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=CrechesProximas")
        startActivity(intent)

    }

    // Botão "Supermercados 24h"
    fun Supermercados(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Supermercados24h")
        startActivity(intent)

    }

    // Botão "Costureiras/Consertos de Roupas"
    fun Costura(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=CostureirasConsertosdeRoupas")
        startActivity(intent)

    }

}