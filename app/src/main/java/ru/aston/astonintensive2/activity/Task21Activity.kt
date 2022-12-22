package ru.aston.astonintensive2.activity

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import ru.aston.astonintensive2.databinding.ActivityTask21Binding

private const val COUNT_KEY = "COUNT"

class Task21Activity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTask21Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Task 2.1"


        count = savedInstanceState?.getInt(COUNT_KEY) ?: 0
        binding.showCount.text = count.toString()

        binding.buttonCount.setOnClickListener {
            count++
            binding.showCount.text = count.toString()
        }

        binding.buttonToast.setOnClickListener {
            val intent = Intent(this, Task21SecondActivity::class.java)
            intent.putExtra(COUNT_KEY, count)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNT_KEY, count)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId ==android.R.id.home) finish()
        return true
    }

}
