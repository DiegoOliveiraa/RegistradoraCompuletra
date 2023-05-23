package com.compuletra.registradora.bancodedados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity(tableName = "users")
data class User(
    @PrimaryKey val key: Int,
    @ColumnInfo(name = "moeda_cinco") var cincoCents: BigDecimal? = null,
    @ColumnInfo(name = "moeda_dez") var dezCents: BigDecimal? = null,
    @ColumnInfo(name = "moeda_vintecinco") var vinteCincoCents: BigDecimal? = null,
    @ColumnInfo(name = "moeda_cinquenta") var cinquentaCents: BigDecimal? = null,
    @ColumnInfo(name = "moeda_um") var umReal: BigDecimal? = null
)


