package com.example.threadexchange

object FavoritosManager {
    private val favoritosList = mutableListOf<Ropa>()

    fun agregarAFavoritos(ropa: Ropa) {
        if (!favoritosList.contains(ropa)) {
            favoritosList.add(ropa)
        }
    }

    fun obtenerFavoritos(): List<Ropa> {
        return favoritosList
    }

}