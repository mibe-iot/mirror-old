package com.mibe.bm.cd.pairing.specs

import com.uchuhimo.konf.ConfigSpec

object HomeWifiSpec : ConfigSpec() {
    val ssid by required<String>()
    val password by required<String>()
}