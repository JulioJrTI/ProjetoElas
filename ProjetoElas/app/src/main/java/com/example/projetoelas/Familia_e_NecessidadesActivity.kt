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

class Familia_e_NecessidadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_familia_enecessidades)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Animações
        // Referências aos botões
        val btn_Creches = findViewById<View>(R.id.btn_Creches)
        val btn_Mercado = findViewById<View>(R.id.btn_Supermercados)
        val btn_Costura = findViewById<View>(R.id.btn_CosturaRoupas)


        // Executa as animações (Fade-In)
        animateButton(btn_Creches, 250) // Aparece 1s depois
        animateButton(btn_Mercado, 500) // Aparece 1s depois
        animateButton(btn_Costura, 750) // Aparece 1s depois

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

    //Logica de programação da Activity "Família e Necessidades Cotidianas"

    // Botão "Inicio"
    fun Botao_Inicio(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Creches Próximas"
    fun Creches(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Creches+proximas")
        startActivity(intent)

    }

    // Botão "Supermercados 24h"
    fun Supermercados(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Supermercados24h+proximos")
        startActivity(intent)

    }

    // Botão "Costureiras/Consertos de Roupas"
    fun Costura(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Costureiras+e+Consertos+de+Roupas+proximo")
        startActivity(intent)

    }

}