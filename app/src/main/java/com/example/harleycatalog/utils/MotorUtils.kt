package com.example.harleycatalog.utils
import com.example.harleycatalog.model.Motor

object MotorUtils {

    fun getMotorList(): ArrayList<Motor> {
        val list = ArrayList<Motor>()

        list.add(
            Motor(
                name = "Iron 883",
                type = "Cruiser",
                year = 2021,
                price = 350000000,
                engineCC = 883,
                description = "Motor klasik dengan desain minimalis dan tenaga besar."
            )
        )

        list.add(
            Motor(
                name = "Street 750",
                type = "Street",
                year = 2020,
                price = 300000000,
                engineCC = 750,
                description = "Motor entry-level Harley dengan handling ringan."
            )
        )

        list.add(
            Motor(
                name = "Fat Bob",
                type = "Cruiser",
                year = 2022,
                price = 600000000,
                engineCC = 1868,
                description = "Motor agresif dengan tampilan modern dan performa tinggi."
            )
        )

        list.add(
            Motor(
                name = "Sportster S",
                type = "Sport",
                year = 2023,
                price = 700000000,
                engineCC = 1250,
                description = "Motor sport modern dengan teknologi terbaru Harley."
            )
        )

        list.add(
            Motor(
                name = "Road Glide",
                type = "Touring",
                year = 2022,
                price = 900000000,
                engineCC = 1746,
                description = "Motor touring jarak jauh dengan kenyamanan maksimal."
            )
        )

        list.add(
            Motor(
                name = "Pan America 1250",
                type = "Adventure",
                year = 2023,
                price = 800000000,
                engineCC = 1250,
                description = "Motor adventure Harley untuk berbagai medan."
            )
        )

        return list
    }
}