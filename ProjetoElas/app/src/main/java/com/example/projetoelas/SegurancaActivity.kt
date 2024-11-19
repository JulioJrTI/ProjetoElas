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

class SegurancaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seguranca)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Animações
        // Referências aos botões
        val btn_Delegacia = findViewById<View>(R.id.btn_Delegacia)
        val btn_Advogados = findViewById<View>(R.id.btn_Advogados)
        val btn_Emergencia = findViewById<View>(R.id.btn_Emergencia)
        val btn_Ongs = findViewById<View>(R.id.btn_ONG)


        // Executa as animações (Fade-In)
        animateButton(btn_Delegacia, 250) // Aparece 1s depois
        animateButton(btn_Advogados, 500) // Aparece 1s depois
        animateButton(btn_Emergencia, 750) // Aparece 1s depois
        animateButton(btn_Ongs, 1000) // Aparece 1s depois

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

    //Logica de programação da Activity "Segurança e Apoio"

    // Botão "Inicio"
    fun Botao_Inicio(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    // Botão "Delegacia Geral"
    fun Delegacia(view: View) {

        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "190")
        startActivity(dialIntent)

    }

    // Botão "Advogados da Familia"
    fun Advogados(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=Advogados+Da+Familia+proximo")
        startActivity(intent)

    }

    // Botão "Emergencia"
    fun Emergencia(view: View) {

        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "192")
        startActivity(dialIntent)

    }

    // Botão "ONGs e Abrigos"
    fun ONGs(view: View) {

        // Abre o navegador interno e pesquisa pelo resultado
        val intent = Intent(this, BrowserActivity::class.java)
        intent.putExtra("url", "https://www.google.com/search?q=ongs+e+abrigos+para+mulheres+proximos")
        startActivity(intent)

    }

}