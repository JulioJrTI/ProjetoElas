package com.example.projetoelas

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper

// Bibliotecas referentes a logica de pesquisa do navegador
import android.content.Intent
import android.net.Uri

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

        // Animações
        // Referências aos botões para com as animações
        val btnBancos = findViewById<View>(R.id.btn_Bancos)
        val btnSaude = findViewById<View>(R.id.btn_Saude)
        val btnSeguranca = findViewById<View>(R.id.btn_Seguranca)
        val btnLazer = findViewById<View>(R.id.btn_Lazer)
        val btnTecnologia = findViewById<View>(R.id.btn_TecnologiaSuporte)
        val btnFamilia = findViewById<View>(R.id.btn_Familia)
        val btnEducacao = findViewById<View>(R.id.btn_Educacao)
        val btnEmergencia = findViewById<View>(R.id.btn_EMERGENCIA)
        val btnPolicia = findViewById<View>(R.id.btn_POLICIA)


        // Executa as animações (Fade-In)
        animateButton(btnSaude, 500) // Aparece 1s depois
        animateButton(btnSeguranca, 750) // Aparece 1s depois
        animateButton(btnBancos, 1000) // Aparece 1s depois
        animateButton(btnLazer, 1250) // Aparece 1s depois
        animateButton(btnEducacao, 1500) // Aparece 1s depois
        animateButton(btnFamilia, 1750) // Aparece 1s depois
        animateButton(btnTecnologia, 2000) // Aparece 1s depois
        animateButton(btnEmergencia, 0) // Aparece 1s depois
        animateButton(btnPolicia, 0) // Aparece 1s depois

    }

    // Logica da animação
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

    // Logica do aplicativo

    // Botão Categoria Bancos
    fun Bancos(view: View) {

        val intent = Intent(this, BancosActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Saude e Bem Estar
    fun Saude(view: View) {

        val intent = Intent(this, SaudeActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Segurança e Apoio
    fun Segurança(view: View) {

        val intent = Intent(this, SegurancaActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Educação e Empoderamento
    fun Educacao(view: View) {

        val intent = Intent(this, EducacaoActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Lazer e Bem-Estar
    fun Lazer_e_bemEstar(view: View) {

        val intent = Intent(this, LazerActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Família e Necessidades Cotidianas
    fun Familia(view: View) {

        val intent = Intent(this, Familia_e_NecessidadesActivity::class.java)
        startActivity(intent)

    }

    // Botão Categoria Tecnologia e Suporte
    fun Tecnologia(view: View) {

        val intent = Intent(this, Tecnologia_e_SuporteActivity::class.java)
        startActivity(intent)

    }

    // Botão Emergencia
    fun Emergencia(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "192")
        startActivity(dialIntent)
    }

    // Botão Policia
    fun Policia(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "190")
        startActivity(dialIntent)
    }

}