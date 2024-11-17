package com.example.projetoelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tecnologia_e_SuporteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tecnologia_esuporte)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Logica de programação da Activity "Tecnologia e Suporte"

    // Botão "Inicio"
    fun Botao_Inicio(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Mulheres na Tecnologia"
    fun Mentorias_Mulheres_Tecnologia(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=Mulheres na Tecnologia")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Consertos de Celulares ou Laptops"
    fun Concerto_Celulares(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=ConsertosdeCelularesouLaptops")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Tutorias Online para Mulheres"
    fun Tutoriais_Para_Mulheres(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=TutoriasOnlineparaMulheres")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }




}