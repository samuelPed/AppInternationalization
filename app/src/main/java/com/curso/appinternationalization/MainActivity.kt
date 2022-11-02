package com.curso.appinternationalization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import com.curso.appinternationalization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Events
        binding.buttonSave.setOnClickListener(this)


        binding.textResulName.isGone = true
        binding.textResulNumber.isGone = true
        binding.textResulLanguage.isGone = true

    }

    override fun onClick(v: View) {
        if(v.id == R.id.button_save){
            val name = binding.inputName.text.toString()
            val number = binding.inputNumber.text.toString()

            binding.textResulName.text = name
            binding.textResulNumber.text = number

            binding.textResulName.isGone = false
            binding.textResulNumber.isGone = false
            binding.textResulLanguage.isGone = false
        }
    }
}