package org.techtown.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.intentkt.databinding.ActivityMainBinding
import org.techtown.intentkt.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private var mBinding: ActivitySubBinding? = null

    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("msg")){
            binding.tvGetMsg.text = intent.getStringExtra("msg")
        }
    }
}