package com.compuletra.registradora.bancodedados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val key: Int,
    @ColumnInfo(name = "moeda_cinco") var cincoCents: Double? = null,
    @ColumnInfo(name = "moeda_dez") var dezCents: Double? = null,
    @ColumnInfo(name = "moeda_vintecinco") var vinteCincoCents: Double? = null,
    @ColumnInfo(name = "moeda_cinquenta") var cinquentaCents: Double? = null,
    @ColumnInfo(name = "moeda_um") var umReal: Double? = null
)