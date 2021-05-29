package org.techtown.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.intentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            // var: 일반적인 변수, 변수 값이 언제든지 변경될 수 있음.
            // val: 지역에서는 final, 값이 변경되지 못하는 변수 한가지 값이 인풋이 되면 변경될 수 없음.
            // 즉, 차이점은 변수를 변경할 수 있느냐 없느냐에 있음

            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("msg", binding.tvSendMsg.text.toString())
            startActivity(intent)
        }
    }
}