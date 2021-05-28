package org.techtown.viewbindingpracticecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.viewbindingpracticecode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 전역 변수로 바인딩 객체 선언
    private var mBinding: ActivityMainBinding? = null

    // 매번 null 체크를 하지 않고 편의성을 위해 바인딩 변수 재선언
    private val binding get() = mBinding !!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 뷰 액티비티에 표시
        setContentView(binding.root)
    }
}