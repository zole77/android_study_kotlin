package org.techtown.sharedpreferenceskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.sharedpreferenceskt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO: 저장된 데이터를 로드
        loadData()  // editText 저장된 값 불러옴
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        binding.etHello.setText(pref.getString("name",""))
        // 첫번째 인자는 키, 두번쨰 인자는 키 값에 대응되는 데이터가 존재하지 않을 경우에 사용할 대체 값
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit()  // 수정모드
        edit.putString("name", binding.etHello.text.toString()) // 첫번째 인자는 키, 두번쨰 인자는 값
        edit.apply() // 값 저장 완료
    }

    override fun onDestroy() { // 액티비티가 종료되는 시점에 호출
        super.onDestroy()

        saveData() // editText 값 저장
    }



}