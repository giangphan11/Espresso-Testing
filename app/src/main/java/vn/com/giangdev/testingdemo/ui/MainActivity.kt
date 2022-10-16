package vn.com.giangdev.testingdemo.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import vn.com.giangdev.testingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnLogin.setOnClickListener {
                val loginIntent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(loginIntent)
            }

            btnCal.setOnClickListener {
                val loginIntent = Intent(this@MainActivity, CalculatorActivity::class.java)
                startActivity(loginIntent)
            }
        }
    }

}