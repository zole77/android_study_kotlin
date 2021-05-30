package org.techtown.imageviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.techtown.imageviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding !!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener {

            binding.ivProfile.setImageResource(R.drawable.ic_launcher_foreground)
            Toast.makeText(this, "토스트 메세지가 출력되었어요.", Toast.LENGTH_SHORT).show()
        }
    }
}