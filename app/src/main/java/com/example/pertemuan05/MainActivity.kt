package com.example.pertemuan05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pertemuan05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ListViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("20102043", "Aulia", "085810390658", "link image : https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.jpg?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W3303q3aW9CiAWEvv9XrJQ3fTMU="),
            MyContact("20102044", "Romadloni", "085810390658", "link image : https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.jpg?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W3303q3aW9CiAWEvv9XrJQ3fTMU="),
            MyContact("20102045", "Nur", "085810390658", "link image : https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.jpg?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W3303q3aW9CiAWEvv9XrJQ3fTMU="),
            MyContact("20102046", "Indarti", "085810390658", "link image : https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.jpg?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W3303q3aW9CiAWEvv9XrJQ3fTMU="),
            MyContact("20102047", "Aulia Romadloni", "085810390658", "link image : https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.jpg?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W3303q3aW9CiAWEvv9XrJQ3fTMU="),
            MyContact("20102048", "Nur Indarti", "085810390658", "link image : https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.jpg?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W3303q3aW9CiAWEvv9XrJQ3fTMU="),
        )

        gridview(listStudent)

    }

    private fun listview(value:ArrayList<MyContact>){
        val adapter = ListViewAdapter(this, value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridview(value:ArrayList<MyContact>){
        val adapter = GridViewAdapter(this, value)

        val layoutManager = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardview(value:ArrayList<MyContact>){
        val adapter = CardViewAdapter(this, value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}