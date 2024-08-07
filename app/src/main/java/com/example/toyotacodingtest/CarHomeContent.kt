
package com.example.toyotacodingtest

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.toyotacodingtest.data.DataProvider
import com.example.toyotacodingtest.data.model.Car

@Composable
fun CarHomeContent(navigateToProfile: (Car) -> Unit) {
    val puppies = remember { DataProvider.carLists }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = puppies,
            itemContent = {
                CarListItem(car = it, navigateToProfile)
            }
        )
    }
}
