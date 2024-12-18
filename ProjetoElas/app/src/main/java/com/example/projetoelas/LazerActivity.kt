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

        // Animações
        // Referências aos botões
        val btn_SaloesBeleza = findViewById<View>(R.id.btn_Estetica)
        val btn_Academia = findViewById<View>(R.id.btn_Academia)
        val btn_CyberCoffee = findViewById<View>(R.id.btn_CyberCoffee)
        val btn_Parques = findViewById<View>(R.id.btn_Parques)

        // Executa as animações (Fade-In)
        animateButton(btn_Academia, 250) // Aparece 1s depois
        animateButton(btn_CyberCoffee, 500) // Aparece 1s depois
        animateButton(btn_SaloesBeleza, 750) // Aparece 1s depois
        animateButton(btn_Parques, 1000) // Aparece 1s depois

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

    //Logica de programação da Activity "Lazer e Bem-Estar"

    // Botão "Inicio"
    fun Botao_Inicio(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Salões de Beleza/Estética"
    fun Estetica(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Saloes+de+Beleza+e+Estetica+proximos")
        startActivity(intent)

    }

    // Botão "Yoga ou Academias Femininas"
    fun Academia(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Yoga+ou+Academias+Femininas+proximos")
        startActivity(intent)

    }

    // Botão "Cafés para Trabalhar/Estudar"
    fun CyberCoffee(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=starbucks+proximo+de+mim")
        startActivity(intent)

    }

    // Botão "Parques e Áreas Seguras"
    fun Parques(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=parques+proximos+de+mim")
        startActivity(intent)

    }

}