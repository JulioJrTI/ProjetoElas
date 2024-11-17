package com.example.projetoelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LazerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lazer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Logica de programação da Activity "Lazer e Bem-Estar"

    // Botão "Inicio"
    fun Botao_Inicio(view: View){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Salões de Beleza/Estética"
    fun Estetica(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=SaloesdeBelezaEstetica")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Yoga ou Academias Femininas"
    fun Academia(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=YogaouAcademiasFemininas")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Cafés para Trabalhar/Estudar"
    fun CyberCoffee(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=CafesparaTrabalharEstudar")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Parques e Áreas Seguras"
    fun Parques(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=Parqueseareasseguras")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }


}