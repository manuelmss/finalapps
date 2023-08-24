package com.manuel.evafinal.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    val strAlbum: String,
    @SerializedName("created_on")
    val intYearReleased: String
) : Parcelable {
}

fun getData(): List<Note> {
    return listOf(
        Note(
            "Nota 1",
            "13/07/2023"
        ),
        Note(
            "Nota 2",
            "13/07/2023"
        ),
        Note(
            "Nota 3",
            "13/07/2023"
        ),
        Note(
            "Nota 4",

            "13/07/2023"
        ),
        Note(
            "Nota 5",
            "13/07/2023"
        ),
        Note(
            "Nota 6",
            "13/07/2023"
        ),
        Note(
            "Nota 7",
            "13/07/2023"
        ),
        Note(
            "Nota 8",
            "13/07/2023"
        ),
        Note(
            "Nota 9",
            "13/07/2023"
        ),
    )
}