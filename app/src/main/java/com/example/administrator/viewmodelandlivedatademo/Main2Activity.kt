package com.example.administrator.viewmodelandlivedatademo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /** 初始化View, 將Fragment 添加到View中 */
        supportFragmentManager.beginTransaction().replace(R.id.topFragmentFrameLayout, TopFragment()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.bottomFragmentFrameLayout, BottomFragment()).commit()
    }
}
