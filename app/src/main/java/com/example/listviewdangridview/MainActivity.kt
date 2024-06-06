package com.example.listviewdangridview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inisialisasi Recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        val itemList = listOf(
            ItemList("judul 1", "Deskripsi 1",
        "https://asset-a.grid.id/crop/0x0:0x0/x/photo/2023/05/16/resep-nasi-goreng-seafood-beras-20230516044801.jpg"),
        ItemList("judul 2", "Deskripsi 2",
        "https://asset-a.grid.id/crop/0x0:0x0/x/photo/2023/05/16/resep-nasi-goreng-seafood-beras-20230516044801.jpg"),
        ItemList("judul 3", "Deskripsi 3",
        "https://asset-a.grid.id/crop/0x0:0x0/x/photo/2023/05/16/resep-nasi-goreng-seafood-beras-20230516044801.jpg"),
        )

        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}