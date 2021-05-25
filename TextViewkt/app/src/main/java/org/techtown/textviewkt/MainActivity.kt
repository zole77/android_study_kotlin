package org.techtown.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.techtown.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null   // 전역 변수 바인딩 객체
    private val binding get() = mBinding!!  // 매번 null 체크 안하고 바인딩 변수 재 선언


    override fun onCreate(savedInstanceState: Bundle?) { // 앱 최초 실행
        super.onCreate(savedInstanceState)

        // 액티비티에서 사용할 바인딩 클래스의 인스턴스
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰
        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시
        setContentView(binding.root)

        // 뷰 id는 파스칼케이스 + 카멜케이스의 네이밍규칙 적용
        // tv_message -> tvMessage
        binding.tvMessage.setText("반가워 코틀린 !")
        binding.BtnHi.setOnClickListener {
            binding.tvMessage.setText("잘가 코틀린 !!")
        }
    }

    // 액티비티 종료 시
    // 인스턴스 참조 정리
    override fun onDestroy() {

        mBinding = null
        super.onDestroy()
    }
}