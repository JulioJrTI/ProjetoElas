package com.example.projetoelas

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Bibliotecas referentes a logica de pesquisa do navegador
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Logica do aplicativo

    // Teste, ao pressionarmos um botão, o conteudo string de um componente de texto será mudado
    fun MudarTexto(view:View){
        val textoTeste = findViewById<TextView>(R.id.txt_Teste)
        textoTeste.setText("Vc clicou no botao!")
    }

    // Botão Hospital
    fun Hospital(view: View){

        // Teste
        val textoTeste = findViewById<TextView>(R.id.txt_Teste)
        textoTeste.setText("Vc clicou no botao do hospital!")

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=hospitais")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)
    }

    // Botão Delegacia da Mulher
    fun DelegaciaMulher(view: View){

        // Teste
        val textoTeste = findViewById<TextView>(R.id.txt_Teste)
        textoTeste.setText("Vc clicou no botao do hospital!")

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=delegaciadamulher")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)


    }

    // Botão Bancos
    fun Bancos(view: View){
        val intent = Intent(this, BancosActivity::class.java)
        startActivity(intent)

    }




}