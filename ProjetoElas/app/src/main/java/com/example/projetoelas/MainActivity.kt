package com.example.projetoelas

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Bibliotecas referentes a logica de pesquisa do navegador
import android.content.Intent


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

    // Botão Categoria Bancos
    fun Bancos(view: View){

        val intent = Intent(this, BancosActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Saude e Bem Estar
    fun Saude(view: View){

        val intent = Intent(this, SaudeActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Segurança e Apoio
    fun Segurança(view: View){

        val intent = Intent(this, SegurancaActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Educação e Empoderamento
    fun Educacao(view: View){

        val intent = Intent(this, EducacaoActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Lazer e Bem-Estar
    fun Lazer_e_bemEstar(view: View){

        val intent = Intent(this, LazerActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Família e Necessidades Cotidianas
    fun Familia(view: View){

        val intent = Intent(this, Familia_e_NecessidadesActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Tecnologia e Suporte
    fun Tecnologia(view: View){

        val intent = Intent(this, Tecnologia_e_SuporteActivity::class.java)
        startActivity(intent)

    }




}