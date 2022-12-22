package ru.aston.astonintensive2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.aston.astonintensive2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.task11Button.setOnClickListener {
            val intent = Intent(this, Task11Activity::class.java)
            startActivity(intent)
        }

        binding.task12Button.setOnClickListener {
            val intent = Intent(this, Task12Activity::class.java)
            startActivity(intent)
        }

        binding.task13Button.setOnClickListener {
            val intent = Intent(this, Task13Activity::class.java)
            startActivity(intent)
        }


        binding.task14Button.setOnClickListener {
            val intent = Intent(this, Task14Activity::class.java)
            startActivity(intent)
        }

        binding.task21Button.setOnClickListener {
            val intent = Intent(this, Task21Activity::class.java)
            startActivity(intent)
        }

        binding.task22Button.setOnClickListener {
            val intent = Intent(this, Task22Activity::class.java)
            startActivity(intent)
        }

        binding.task23Button.setOnClickListener {
            val intent = Intent(this, Task23Activity::class.java)
            startActivity(intent)
        }

    }
}