package ru.aston.astonintensive2.activity

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.aston.astonintensive2.databinding.ActivityTask12Binding

private const val KEY_COUNT = "count"

class Task12Activity: AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTask12Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Task 1.2"

        val pinkColor = Color.rgb(255,192,203)
        val defaultColor = Color.rgb(98, 0, 238)
        val greenColor = Color.rgb(0, 214, 120)
        val grayColor = Color.rgb(128,128,128)

        count = savedInstanceState?.getInt(KEY_COUNT, 0) ?:0

        binding.countTextview.text = count.toString()
        if(count > 0) binding.zeroButton.setBackgroundColor(pinkColor)
        var color = if (count % 2 == 0) defaultColor else greenColor
        binding.countButton.setBackgroundColor(color)

        binding.countButton.setOnClickListener {
            count++
            binding.countTextview.text = count.toString()
            color = if (count % 2 == 0) defaultColor else greenColor
            binding.countButton.setBackgroundColor(color)
            binding.zeroButton.setBackgroundColor(pinkColor)
        }

        binding.zeroButton.setOnClickListener {
            count = 0
            binding.countTextview.text = count.toString()
            binding.countButton.setBackgroundColor(defaultColor)
            binding.zeroButton.setBackgroundColor(grayColor)
        }

        binding.toastButton.setOnClickListener {
            val toast = Toast.makeText(this, "Вы нажали TOAST", Toast.LENGTH_SHORT)
            toast.show()
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