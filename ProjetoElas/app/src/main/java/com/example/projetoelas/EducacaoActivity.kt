package com.example.projetoelas

import android.animation.ObjectAnimator
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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

        // Animações
        // Referências aos botões
        val btn_Cursos = findViewById<View>(R.id.btn_Cursos)
        val btn_Defesa = findViewById<View>(R.id.btn_DefesaPessoal)
        val btn_Empregos = findViewById<View>(R.id.btn_Empregos)
        val btn_Apoio = findViewById<View>(R.id.btn_GrupoApoio)

        // Executa as animações (Fade-In)
        animateButton(btn_Apoio, 250) // Aparece 1s depois
        animateButton(btn_Defesa, 500) // Aparece 1s depois
        animateButton(btn_Cursos, 750) // Aparece 1s depois
        animateButton(btn_Empregos, 1000) // Aparece 1s depois

    }

    // Animações
    private fun animateButton(button: View, delay: Long) {
        // Define o botão como visível após o delay
        Handler(Looper.getMainLooper()).postDelayed({
            button.visibility = View.VISIBLE

            // Animação de "fade-in" usando ObjectAnimator
            ObjectAnimator.ofFloat(button, "alpha", 0f, 1f).apply {
                duration = 500 // Duração da animação (500ms)
                start()
            }
        }, delay)
    }

    //Logica de programação da Activity "Educação e Profissionalização"

    // Botão "Inicio"
    fun Botao_Inicio(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Cursos Profissionalizantes"
    fun Cursos(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Cursos+Profissionalizantes+para+Mulheres")
        startActivity(intent)

    }

    // Botão "Aulas de Defesa Pessoal"
    fun DefesaPessoal(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Aulasde+Defesa+Pessoal+feminina")
        startActivity(intent)

    }

    // Botão "Empresas com Emprego para Mulheres"
    fun Empregos(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Empresas+com+vagas+inclusivas")
        startActivity(intent)

    }

    // Botão "Grupos de Apoio Feminino"
    fun GruposApoio(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Grupos+de+Apoio+Feminino")
        startActivity(intent)

    }


}