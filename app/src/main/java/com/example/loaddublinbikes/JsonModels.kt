package com.example.loaddublinbikes

import java.util.*

class BikeStation {

    data class BikeStationInfo
    (
            val number: Int,
            val name: String,
            val available_bikes: Int,
            val position: Position
    )

    data class Position(
            val lat: Float,
            val lng: Float)
}

class Stations(val stations: List<BikeStation.BikeStationInfo>)