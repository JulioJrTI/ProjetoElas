package com.example.projetoelas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EducacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_educacao)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Logica de programação da Activity "Educação e Profissionalização"

    // Botão "Cursos Profissionalizantes"
    fun Cursos(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=CursosProfissionalizantes")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Aulas de Defesa Pessoal"
    fun DefesaPessoal(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=AulasdeDefesaPessoal")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Empresas com Emprego para Mulheres"
    fun Empregos(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=EmpresascomEmpregoparaMulheres")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }

    // Botão "Grupos de Apoio Feminino"
    fun GruposApoio(view: View){

        // Pesquisar no navegador o conteudo referente ao botão
        val pesquisa = Uri.parse("https://www.google.com/search?q=GruposdeApoioFeminino")
        val intent = Intent(Intent.ACTION_VIEW, pesquisa)
        startActivity(intent)

    }


}