
package com.example.toyotacodingtest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.toyotacodingtest.data.model.Car
import com.example.toyotacodingtest.ui.theme.MyTheme

class ProfileActivity : AppCompatActivity() {

    private val car: Car by lazy {
        intent?.getSerializableExtra(CAR_ID) as Car
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                ProfileScreen(car)
            }
        }
    }

    companion object {
        private const val CAR_ID = "car_id"
        fun newIntent(context: Context, car: Car) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(CAR_ID, car)
            }
    }
}
