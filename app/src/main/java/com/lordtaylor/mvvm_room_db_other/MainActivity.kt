package com.lordtaylor.mvvm_room_db_other
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.lordtaylor.mvvm_room_db_other.view_model.MyAppViewModel
import com.lordtaylor.mvvm_room_db_other.views.LoginFragment

class MainActivity : AppCompatActivity() {

    lateinit var myViewModel: MyAppViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myViewModel = ViewModelProviders.of(this).get(MyAppViewModel::class.java)
        supportFragmentManager.beginTransaction().replace(R.id.base_container,LoginFragment()).commit()
    }
}
