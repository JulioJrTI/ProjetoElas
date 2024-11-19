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

class SaudeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saude)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Animações
        // Referências aos botões
        val btn_Farmacias = findViewById<View>(R.id.btn_Farmacias)
        val btn_Ginecologistas = findViewById<View>(R.id.btn_Gino)
        val btn_Psicologos = findViewById<View>(R.id.btn_Psico)
        val btn_PostosSaude = findViewById<View>(R.id.btn_PSVacinas)
        val btn_Hospitais = findViewById<View>(R.id.btn_Hospitais)


        // Executa as animações (Fade-In)
        animateButton(btn_Farmacias, 250) // Aparece 1s depois
        animateButton(btn_Ginecologistas, 500) // Aparece 1s depois
        animateButton(btn_Hospitais, 1000) // Aparece 1s depois
        animateButton(btn_Psicologos, 1250) // Aparece 1s depois
        animateButton(btn_PostosSaude, 1500) // Aparece 1s depois

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

    //Logica de programação da Activity "Saúde e Bem-Estar"

    // Botão "Inicio"
    fun Botao_Inicio(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Farmacias"
    fun Farmacias(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Farmacias+proximas")
        startActivity(intent)

    }

    // Botão "Ginecologistas"
    fun Ginecologistas(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Ginecologistas+proximos")
        startActivity(intent)

    }

    // Botão "Psicologos"
    fun Psicologos(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Psicologos+proximos")
        startActivity(intent)

    }

    // Botão "Postos de Saude/Vacinação"
    fun Postos_De_Saude(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Postos+de+Saude+proximos")
        startActivity(intent)

    }

    // Botão "Hospitais"
    fun Hospitais(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Hospitais+proximos")
        startActivity(intent)

    }

}