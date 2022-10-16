package vn.com.giangdev.testingdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vn.com.giangdev.testingdemo.databinding.ActivityCalculator2Binding

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculator2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculator2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnSum.setOnClickListener {
                val sumA = etNumA.text.toString().trim().toInt()
                val sumB = etNumB.text.toString().trim().toInt()
                tvResult.text = String.format("%d", (sumA+sumB))
            }
        }
    }
}