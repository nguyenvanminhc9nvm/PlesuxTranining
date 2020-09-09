package com.miichisoft.plesuxtranining

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.miichisoft.plesuxtranining.adapter.FruitDetailsAdapter
import com.miichisoft.plesuxtranining.model.FruitDetails
import kotlinx.android.synthetic.main.activity_fruit_details.view.*
import java.util.*

class FruitDetailsActivity : AppCompatActivity() {
    private val details: MutableList<FruitDetails> = ArrayList()
    private var view: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)
        val fName = intent.getStringExtra("fName")
        view = findViewById(R.id.details_view)
        details.add(
            FruitDetails(
                R.drawable.oi,
                "Guava",
                "Green Fruit",
                "Guava is a common tropical fruit cultivated in many tropical and subtropical regions. Psidium guajava is a small tree in the myrtle family, native to Mexico, Central America, the Caribbean and northern South America."
            )
        )
        details.add(
            FruitDetails(
                R.drawable.bo,
                "Avocado",
                "Green Fruit",
                "The avocado, a tree likely originating from south-central Mexico, is classified as a member of the flowering plant family Lauraceae. The fruit of the plant, also called an avocado, is botanically a large berry containing a single large seed."
            )
        )
        details.add(
            FruitDetails(
                R.drawable.cachua,
                "Tomato",
                "Red Fruit",
                "The tomato is the edible, often red berry of the plant Solanum lycopersicum, commonly known as a tomato plant. The species originated in western South America and Central America. The Nahuatl word tomatl gave rise to the Spanish word tomate, from which the English word tomato derived."
            )
        )
        details.add(
            FruitDetails(
                R.drawable.cam,
                "Orange",
                "Yellow Fruit",
                "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus × sinensis, which is also called sweet orange, to distinguish it from the related Citrus × aurantium, referred to as bitter orange."
            )
        )
        details.add(
            FruitDetails(
                R.drawable.dau,
                "Strawberry",
                "Red Fruit",
                "The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries, which are cultivated worldwide for their fruit. The fruit is widely appreciated for its characteristic aroma, bright red color, juicy texture, and sweetness."
            )
        )
        details.add(
            FruitDetails(
                R.drawable.quaxoai,
                "Mango",
                "Yellow Fruit",
                "A mango is a stone fruit produced from numerous species of tropical trees belonging to the flowering plant genus Mangifera, cultivated mostly for their edible fruit. Most of these species are found in nature as wild mangoes. The genus belongs to the cashew family Anacardiaceae."
            )
        )
        details.add(
            FruitDetails(
                R.drawable.tao,
                "Apple",
                "Smartphone Company",
                "An apple is an edible fruit produced by an apple tree. Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today."
            )
        )

        val lastDetail: MutableList<FruitDetails> = ArrayList()
        for(d in details){
            if (d.name == fName) {
                lastDetail.add(d)
                break
            }
        }
        val detailsAdapter = FruitDetailsAdapter(lastDetail)
        view!!.setHasFixedSize(true)
        view!!.layoutManager = LinearLayoutManager(this)
        view!!.adapter = detailsAdapter
    }
}