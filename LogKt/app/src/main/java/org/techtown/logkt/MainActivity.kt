package org.techtown.logkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.techtown.logkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding:ActivityMainBinding? = null
    private val binding get() = mBinding!!

    var a : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        a = 2

        Log.d("var a의 현재 변수 값: ", a.toString())

    }
}