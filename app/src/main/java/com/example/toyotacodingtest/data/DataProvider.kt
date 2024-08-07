package com.example.toyotacodingtest.data

import com.example.toyotacodingtest.data.model.Car
import com.example.toyotacodingtest.R

object DataProvider {

    val car =
        Car(
            id = 1,
            title = "Toyota Urban Cruiser",
            type = "SUV",
            year = 2017,
            description = "The Taisor takes inspiration from the already stylish Fronx, enhancing its crossover design with attractive design tweaks. With a roomy cabin, modern features, adequate performance, reasonable fuel efficiency, smooth ride quality, and improved warranty coverage, it's a compelling package.",
            carImageId = R.drawable.p1,
            rating = 3
        )

    val carLists = listOf(
        car,
        Car(
            id = 2,
            title = "Toyota Hycross",
            type = "SUV",
            year = 2018,
            description = "The Innova Hycross blends classic Innova DNA with modern SUV design. As a spacious and comfortable people mover, it offers good ride quality. Additionally, with the new petrol-hybrid powerplant, it promises higher fuel efficiency.",
            carImageId = R.drawable.p2,
            rating = 1
        ),
        Car(
            id = 3,
            title = "Toyota Crysta",
            type = "SUV",
            year = 2019,
            description = "The Innova Crysta is a modern-day multi-purpose vehicle with bulletproof reliability, strong chassis, and an efficient but powerful diesel engine. The Crysta also offers a large cabin, seating for up to eight people, and plenty of storage options.",
            carImageId = R.drawable.p3,
            rating = 5
        ),
        Car(
            id = 4,
            title = "Toyota Glanza",
            type = "SUV",
            year = 2020,
            description = "The Toyota Glanza is a practical, user-friendly hatchback ideal for daily use. It offers reasonable performance, efficiency, ample interior space, and modern features, making it a great family car for the typical Indian buyer.",
            carImageId = R.drawable.p4,
            rating = 4
        ),
        Car(
            id = 5,
            title = "Toyota Rumion",
            type = "XUV",
            year = 2021,
            description = "The price of Toyota Rumion, a 7 seater MUV, ranges from Rs. 10.44 - 13.73 Lakh. It is available in 7 variants, with an engine of 1462 cc and a choice of 2 transmissions: Manual and Automatic. Rumion comes with 4 airbags. Toyota Rumion is available in 5 colours. Users have reported a mileage of 20.11 to 26.11 kmpl for Rumion.",
            carImageId = R.drawable.p5,
            rating = 2
        ),
        Car(
            id = 6,
            title = "Toyota Fortuner",
            type = "XUV",
            year = 2021,
            description = "The Fortuner, known for Toyota's bulletproof reliability, commands the road with its imposing stance, true 4x4 capability, and powerful engines. Adequately equipped with features, it seats seven passengers comfortably and excels at covering long distances with ease and comfort.",
            carImageId = R.drawable.p6,
            rating = 1
        ),
        Car(
            id = 7,
            title = "Toyota Land cruiser",
            type = "XUV",
            year = 2022,
            description = "The Land Cruiser boasts tank-like build quality and a spacious cabin for five with comfortable seats and enormous boot space. With loads of V6 diesel power, excellent visibility, and a supreme ride, it feels tough enough for any terrain and truly special.",
            carImageId = R.drawable.p7,
            rating = 3
        ),
        Car(
            id = 8,
            title = "Toyota Hilux",
            type = "XUV",
            year = 2023,
            description =
                    "The Toyota Hilux excels with its pickup versatility and commanding road presence. Its strong pulling power and robust build ensure control while off-roading. Featuring a spacious five-seater cabin, it combines a reasonably feature-loaded interior with an indestructible build quality.",
            carImageId = R.drawable.p8,
            rating = 1
        ),
        Car(
            id = 9,
            title = "Toyota Vellfire",
            type = "XUV",
            year = 2023,
            description = "he price of Toyota Vellfire, a 7 seater MUV, ranges from Rs. 1.22 - 1.33 Crore. It is available in 2 variants, with an engine of 2487 cc and a choice of 1 transmission: Automatic. Vellfire comes with 6 airbags. Toyota Vellfire is available in 3 colours. Users have reported a mileage of 19.28 kmpl for Vellfire.",
            carImageId = R.drawable.p9,
            rating = 4
        ),
        Car(
            id = 10,
            title = "Toyota Camry",
            type = "XUV",
            year = 2024,
            description = "The Camry combines petrol hybrid efficiency with a spacious and comfortable cabin, boasting ample boot space. Renowned for its impressive reliability, it offers an array of comfort and safety features and ensures stability at highway speeds.",
            carImageId = R.drawable.p10,
            rating = 5
        )
    )
}
