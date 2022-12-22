package ru.aston.astonintensive2.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import ru.aston.astonintensive2.databinding.ActivityTask22Binding

private const val KEY_COUNT = "count"

class Task22Activity:AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTask22Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Task 2.2"

        count = savedInstanceState?.getInt(KEY_COUNT, 0) ?:0
        binding.showCount.text = count.toString()

        binding.buttonCount.setOnClickListener {
            count++
            binding.showCount.text = count.toString()
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle){
        savedInstanceState.putInt(KEY_COUNT, count)
        super.onSaveInstanceState(savedInstanceState)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId ==android.R.id.home) finish()
        return true
    }
}