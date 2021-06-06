package org.techtown.webviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import org.techtown.webviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        // 웹뷰에서 새 창이 뜨지 않도록 방지함
        binding.webView.webViewClient = WebViewClient()
        binding.webView.webChromeClient = WebChromeClient()
        binding.webView.loadUrl("https://www.naver.com") // 링크 주소를 로드함
    }

    override fun onBackPressed() {
        if(binding.webView.canGoBack()){
            binding.webView.goBack() // 웹사이트 뒤로가기
        }
        else{
            super.onBackPressed() // 본래의 백버튼 기능 수행 (어플리케이션 종료)
        }
    }
}