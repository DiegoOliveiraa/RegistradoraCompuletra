package bancodedados

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val key: Int,
    @ColumnInfo(name = "moeda_cinco") val cincoCents: String?,
    @ColumnInfo(name = "moeda_dez") val dezCents: String?,
    @ColumnInfo(name = "moeda_vintecinco") val vinteCincoCents: String?,
    @ColumnInfo(name = "moeda_cinquenta") val cinquentaCents: String?,
    @ColumnInfo(name = "moeda_um") val umReal: String?
)