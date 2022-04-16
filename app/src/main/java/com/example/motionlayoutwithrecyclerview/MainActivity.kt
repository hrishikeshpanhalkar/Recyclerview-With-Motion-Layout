package com.example.motionlayoutwithrecyclerview

import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var frameLayout: FrameLayout
    private lateinit var imageView: ImageView
    private lateinit var mainAdapter: MainAdapter
    private lateinit var arrayList: ArrayList<MainModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = Color.TRANSPARENT
        recyclerView = findViewById(R.id.recyclerview)
        frameLayout = findViewById(R.id.back)
        when (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_NO -> {
                recyclerView.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.recyclerview_light_bg)
            } // Night mode is not active, we're using the light theme
            Configuration.UI_MODE_NIGHT_YES -> {
                recyclerView.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.recyclerview_dark_bg)
            } // Night mode is active, we're using dark theme
        }

        arrayList = ArrayList()
        arrayList.add(MainModel("Maharashtra", "Mumbai"))
        arrayList.add(MainModel("Gujarat", "GandhiNagar"))
        arrayList.add(MainModel("Goa", "Panaji"))
        arrayList.add(MainModel("Karnataka", "Bangalore"))
        arrayList.add(MainModel("Tamil Nadu", "Chennai"))
        arrayList.add(MainModel("kerala", "Thiruvananthapuram"))
        arrayList.add(MainModel("Odisha", "Bhubaneswar"))
        arrayList.add(MainModel("UP", "Lucknow"))
        arrayList.add(MainModel("MP", "Bhopal"))
        arrayList.add(MainModel("Punjab", "Chandigarh"))
        arrayList.add(MainModel("Jammu & Kashmir", "ShriNagar"))
        arrayList.add(MainModel("Assam", "Dispur"))
        arrayList.add(MainModel("West Bengal", "Kolkata"))
        arrayList.add(MainModel("Arunachal Pradesh", "Itanagar"))
        arrayList.add(MainModel("Bihar", "Patna"))
        arrayList.add(MainModel("Chhattisgarh", "Raipur"))
        arrayList.add(MainModel("Haryana", "Chandigarh"))
        arrayList.add(MainModel("Himachal Pradesh", "Shimla"))
        arrayList.add(MainModel("Jharkhand", "Ranchi"))
        arrayList.add(MainModel("Manipur", "Imphal"))
        arrayList.add(MainModel("Meghalaya", "Shillong"))
        arrayList.add(MainModel("Mizoram", "Aizawl"))
        arrayList.add(MainModel("Nagaland", "Kohima"))
        arrayList.add(MainModel("Rajasthan", "Jaipur"))
        arrayList.add(MainModel("Sikkim", "Gangtok"))
        arrayList.add(MainModel("Telangana", "Hyderabad"))
        arrayList.add(MainModel("Tripura", "Agartala"))
        arrayList.add(MainModel("Uttarakhand", "Dehradun"))
        recyclerView.layoutManager = LinearLayoutManager(this)
        mainAdapter = MainAdapter(this@MainActivity, arrayList)
        recyclerView.adapter = mainAdapter
    }
}