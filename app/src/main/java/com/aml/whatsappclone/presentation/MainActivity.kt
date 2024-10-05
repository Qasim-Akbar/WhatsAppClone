package com.aml.whatsappclone.presentation

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aml.whatsappclone.R
import com.aml.whatsappclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(checkAuthenticationStatus()){

        }else{
            binding.userAuthenticationLayout.visibility = View.VISIBLE
            binding.appLogo.visibility = View.VISIBLE
            binding.userNumberLayout.visibility = View.VISIBLE
            binding.textInputLayout1.visibility = View.VISIBLE
            binding.etNumber.visibility = View.VISIBLE
            binding.btProceed.visibility = View.VISIBLE
        }

    }

    private fun checkAuthenticationStatus(): Boolean {
        return false
    }

    fun ShowBottomSheet(verificationId: String) {
        TODO("Not yet implemented")
    }
}