package org.techtown.fragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import org.techtown.fragmentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding !!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFrag(0)

        binding.btnFragment1.setOnClickListener {
            setFrag(0)
        }
        binding.btnFragment2.setOnClickListener {
            setFrag(1)
        }
        binding.btnFragment3.setOnClickListener {
            setFrag(2)
        }
    }

    private fun setFrag(fragNum: Int) {
        val fm = supportFragmentManager.beginTransaction()

        when(fragNum){
            0 -> {
                fm.replace(R.id.main_frame, Fragment1()).commit()
            }
            1 -> {
                fm.replace(R.id.main_frame, Fragment2()).commit()
            }
            2 -> {
                fm.replace(R.id.main_frame, Fragment3()).commit()
            }
        }
    }
}