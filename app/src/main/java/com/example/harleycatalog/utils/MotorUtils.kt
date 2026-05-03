package com.example.harleycatalog.utils
import com.example.harleycatalog.model.Motor
import com.example.harleycatalog.R

object MotorUtils {

    fun getMotorList(): ArrayList<Motor> {
        val list = ArrayList<Motor>()

        list.add(
            Motor(
                name = "WLA 750",
                type = "Classic Military",
                year = 1942,
                price = 450000000,
                engineCC = 740,
                description = "Harley era perang dunia dengan desain militer klasik dan karakter mesin vintage.",
                imageResId = R.drawable.wla750
            )
        )

        list.add(
            Motor(
                name = "EL Knucklehead",
                type = "Classic",
                year = 1936,
                price = 850000000,
                engineCC = 1000,
                description = "Salah satu Harley legendaris dengan mesin Knucklehead yang sangat ikonik.",
                imageResId = R.drawable.elknucklehead
            )
        )

        list.add(
            Motor(
                name = "FL Panhead",
                type = "Cruiser",
                year = 1948,
                price = 780000000,
                engineCC = 1200,
                description = "Model klasik dengan mesin Panhead, terkenal nyaman untuk touring jarak jauh.",
                imageResId = R.drawable.flpanhead
            )
        )

        list.add(
            Motor(
                name = "Hydra-Glide",
                type = "Touring Classic",
                year = 1955,
                price = 700000000,
                engineCC = 1200,
                description = "Harley klasik dengan suspensi depan hydraulic yang menjadi ciri khas masanya.",
                imageResId = R.drawable.hydraglide
            )
        )

        list.add(
            Motor(
                name = "Road Glide",
                type = "Touring",
                year = 2022,
                price = 900000000,
                engineCC = 1746,
                description = "Motor touring jarak jauh dengan kenyamanan maksimal.",
                imageResId = R.drawable.roadglide
            )
        )

        list.add(
            Motor(
                name = "Sportster XLH",
                type = "Sportster",
                year = 1965,
                price = 420000000,
                engineCC = 900,
                description = "Sportster klasik dengan bobot lebih ringan dan karakter mesin yang responsif.",
                imageResId = R.drawable.sportsterxlh
            )
        )

        list.add(
            Motor(
                name = "Electra Glide FLH",
                type = "Touring",
                year = 1969,
                price = 650000000,
                engineCC = 1200,
                description = "Harley touring klasik dengan gaya besar, nyaman, dan tampilan elegan.",
                imageResId = R.drawable.electraglide
            )
        )

        list.add(
            Motor(
                name = "Super Glide FX",
                type = "Cruiser",
                year = 1971,
                price = 520000000,
                engineCC = 1200,
                description = "Model awal Super Glide dengan gaya custom factory yang sporty untuk zamannya.",
                imageResId = R.drawable.superglidefx
            )
        )

        list.add(
            Motor(
                name = "Sportster XLCH",
                type = "Sportster",
                year = 1974,
                price = 380000000,
                engineCC = 1000,
                description = "Sportster lawas dengan karakter agresif, cocok untuk penggemar Harley klasik ringan.",
                imageResId = R.drawable.sportsterxlch
            )
        )

        list.add(
            Motor(
                name = "Low Rider FXS",
                type = "Cruiser",
                year = 1977,
                price = 560000000,
                engineCC = 1200,
                description = "Cruiser klasik dengan posisi berkendara rendah dan gaya custom khas era 70-an.",
                imageResId = R.drawable.lowriderfxs
            )
        )

        return list
    }
}