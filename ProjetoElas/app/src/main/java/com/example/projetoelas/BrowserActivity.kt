package com.example.projetoelas

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BrowserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_browser)

        // Ajuste para o layout principal
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configuração do WebView
        val webView: WebView = findViewById(R.id.web_view) // Certifique-se de que o ID no XML está correto
        webView.settings.javaScriptEnabled = true // Habilitar JavaScript
        webView.settings.cacheMode = WebSettings.LOAD_NO_CACHE // Evitar cache
        webView.webViewClient = WebViewClient() // Manter navegação interna

        // Receber a URL da Intent
        val url = intent.getStringExtra("url") ?: "https://www.google.com"
        webView.loadUrl(url) // Carregar URL no WebView
    }

    // Comportamento do botão "Voltar"
    override fun onBackPressed() {
        val webView: WebView = findViewById(R.id.web_view)
        if (webView.canGoBack()) {
            webView.goBack() // Voltar dentro do WebView
        } else {
            super.onBackPressed() // Fechar a Activity
        }
    }
}
