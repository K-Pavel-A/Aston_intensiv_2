package ru.aston.astonintensive2.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import ru.aston.astonintensive2.databinding.ActivityTask21SecondBinding

private const val COUNT_KEY = "COUNT"

class Task21SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTask21SecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Task 2.1 - Second activity"

        binding.countTextview.text = intent.getIntExtra(COUNT_KEY, 0).toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId ==android.R.id.home) finish()
        return true
    }

}