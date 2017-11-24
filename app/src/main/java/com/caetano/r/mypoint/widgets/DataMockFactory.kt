package com.caetano.r.mypoint.widgets

import com.caetano.r.mypoint.api.Device
import com.caetano.r.mypoint.api.TimeCard


class DataMockFactory {

    companion object {

        private val lng = -46.694538
        private val lat = -23.6015042
        private val address = "Av. das Nações Unidas, 11541 - Cidade Monções, São Paulo - SP, Brasil"

        fun timeCard() = TimeCard(lat, lng, address, null, lat, lng, address,
                false, 30)

        fun device() = Device("4.1.0", "unknown", "Chrome",
                "browser", null, "61.0.3163.79")

    }

}