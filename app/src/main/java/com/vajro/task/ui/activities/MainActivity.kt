package com.vajro.task.ui.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vajro.task.databinding.ActivityMainBinding
import com.vajro.task.network.ApiInterface
import com.vajro.task.network.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiInterface = RetrofitHelper.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch {
            val result = apiInterface.getProducts()
            if (result != null)
                Log.e("Results", result.toString());

        }
    }
}