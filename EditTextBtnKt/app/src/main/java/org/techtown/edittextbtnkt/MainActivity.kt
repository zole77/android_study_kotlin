package org.techtown.edittextbtnkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.edittextbtnkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetResult.setOnClickListener {
            // editText에 있는 값을 텍스트뷰로 옮기는 기능
            var resultText = binding.etId.text.toString()   // editText에 있는 아이디 값을 String으로
            binding.tvResult.setText(resultText)    // helloWorld 값을 editText 값으로 변경
        }
    }
}