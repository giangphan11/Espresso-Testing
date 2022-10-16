package vn.com.giangdev.testingdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import vn.com.giangdev.testingdemo.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            binding.btnActionLogin.setOnClickListener {
                tvLoginSuccess.visibility = View.GONE
                val userName = etUserName.text.toString().trim()
                val passWord = etPassword.text.toString().trim()
                if (userName.isNotEmpty() &&
                    passWord.isNotEmpty() &&
                    userName.contentEquals("admin") &&
                    passWord.contentEquals("123")
                ) {
                    tvLoginSuccess.visibility = View.VISIBLE
                }
            }
        }
    }
}