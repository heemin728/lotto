package com.example.lotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        // 코드에서 View 에 이벤트 리스너를 설정하는 방법
        // 버튼과 같은 View 가 클릭되었을 때 실행할 리스너를 등록하는 메소드
        findViewById<View>(R.id.button).setOnClickListener{
            // mainActivity 를 시작하는 Intent 생성
            val intent= Intent(this@TestActivity,MainActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.button2).setOnClickListener {
            val intent=Intent(this@TestActivity,ConstellationActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.button3).setOnClickListener {
            val intent=Intent(this@TestActivity,NameActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.button4).setOnClickListener {
            val intent=Intent(this@TestActivity,ResultActivity::class.java)
            startActivity(intent)
        }
    }
    fun callWeb(view :View){
        val intent=Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
        startActivity(intent)
    }

    /**
     * xml 에서 참조할 수 있게 메소드 정의
     */
    /*    fun goConstellation(view : View){
        val intent=Intent(this@TestActivity,ConstellationActivity::class.java)
        startActivity(intent)
    }*/

}