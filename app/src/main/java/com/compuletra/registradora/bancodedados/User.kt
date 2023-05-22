package com.compuletra.registradora.bancodedados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val key: Int,
    @ColumnInfo(name = "moeda_cinco") val cincoCents: Double? = null,
    @ColumnInfo(name = "moeda_dez") val dezCents: Double? = null,
    @ColumnInfo(name = "moeda_vintecinco") val vinteCincoCents: Double? = null,
    @ColumnInfo(name = "moeda_cinquenta") val cinquentaCents: Double? = null,
    @ColumnInfo(name = "moeda_um") val umReal: Double? = null
)