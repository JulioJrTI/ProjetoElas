package com.example.projetoelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegurancaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seguranca)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Logica de programação da Activity "Segurança e Apoio"

    // Botão "Delegacia Geral"
    fun Delegacia(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=Delegacia")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Advogados da Familia"
    fun Advogados(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=AdvogadosDaFamilia")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Emergencia" LOGICA SERÁ DIFERENCIADA PARA ESTE BOTÃO!
    fun Emergencia(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=Emergencia")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "ONGs e Abrigos"
    fun ONGs(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=ONGsEAbrigos")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }


}