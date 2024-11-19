package com.example.projetoelas

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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

        // Animações
        // Referências aos botões
        val btn_MulheresTecnologia = findViewById<View>(R.id.btn_Tecnologia)
        val btn_ConsertoPhone = findViewById<View>(R.id.btn_Conserto)
        val btn_TutoriaisMulheres = findViewById<View>(R.id.btn_Tutoriais)


        // Executa as animações (Fade-In)
        animateButton(btn_MulheresTecnologia, 250) // Aparece 1s depois
        animateButton(btn_ConsertoPhone, 500) // Aparece 1s depois
        animateButton(btn_TutoriaisMulheres, 750) // Aparece 1s depois

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

    //Logica de programação da Activity "Tecnologia e Suporte"

    // Botão "Inicio"
    fun Botao_Inicio(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Mulheres na Tecnologia"
    fun Mentorias_Mulheres_Tecnologia(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.youtube.com/results?search_query=cursos+de+inform%C3%A1tica+gratuitos+")
        startActivity(intent)

    }

    // Botão "Consertos de Celulares ou Laptops"
    fun Concerto_Celulares(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Consertos+de+Celulares+e+Laptops+proximos")
        startActivity(intent)

    }

    // Botão "Tutorias Online para Mulheres"
    fun Tutoriais_Para_Mulheres(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.youtube.com/results?search_query=tutoriais+basicos+para+mulheres")
        startActivity(intent)

    }

}