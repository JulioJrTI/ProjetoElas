package com.example.projetoelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BancosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bancos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Logica de programação referente a pagina do botão "Bancos"

    // Botão "Inicio"
    fun Botao_Inicio(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Banco do Brasil"
    fun BB(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=bancodobrasil")
        startActivity(intent)

    }

    // Botão "Caixa Economica Federal"
    fun CEF(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=caixaeconomicafederal")
        startActivity(intent)

    }

    // Botão "Bradesco"
    fun Bradesco(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=bradesco")
        startActivity(intent)

    }

    // Botão "Itau"
    fun Itau(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=itau")
        startActivity(intent)

    }

    // Botão "Santander"
    fun Santander(view: View){

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=santander")
        startActivity(intent)

    }

    //Caixa de Texto "Outro Banco"

    // TEST! FIX THIS!
    fun OutroBanco(view: View){

        val outroBanco = findViewById<TextView>(R.id.txtF_OutroBanco)

        val pesquisa = Uri.parse("https://www.google.com/search?q=$outroBanco")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }







}