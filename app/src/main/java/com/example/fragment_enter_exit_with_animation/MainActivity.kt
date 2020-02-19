package com.example.fragment_enter_exit_with_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_enter.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right)
                .addToBackStack("frag1")
                .add(R.id.fl1,BlankFragment.newInstance("Hello","wellcome to all"))
                .commit()
        }




    }
}
