
package com.example.toyotacodingtest

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.toyotacodingtest.data.DataProvider
import com.example.toyotacodingtest.data.model.Car
import com.example.toyotacodingtest.ui.theme.graySurface
import com.example.toyotacodingtest.ui.theme.typography
import com.example.toyotacodingtest.ui.theme.white

@Composable
fun CarListItem(car: Car, navigateToProfile: (Car) -> Unit,) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = white,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
    ) {
        Row(Modifier.clickable { navigateToProfile(car) }) {
            PuppyImage(car)
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = car.title, style = typography.h6)
                Text(text = car.type, style = typography.caption)
            }
        }
    }
}

@Composable
private fun PuppyImage(car: Car) {
    Image(
        painter = painterResource(id = car.carImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

@Preview
@Composable
fun PreviewPuppyItem() {
    val puppy = DataProvider.car
    CarListItem(car = puppy, navigateToProfile = {})
}
