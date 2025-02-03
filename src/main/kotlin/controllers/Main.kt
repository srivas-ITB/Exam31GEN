package org.example.controllers

import models.*

fun main() {

    //Crear els plats
    val p1 = Plat("Macarrons", 5.35)
    val p2 = Plat("Truita de patata", 4.25)
    val p3 = Plat("Mongeta verda", 3.52)
    val p4 = Plat("Pit arrebossat", 5.89)
    val p5 = Plat("Lluç al forn", 4.50)

    //Crear els restaurants
    val r1 = RestaurantBuffetLliure("La Menjadora", "Mollerussa", "Variada", arrayListOf(p1,p2,p3,p4),29.95)
    val e1 = Espectacle("Moulin Rouge", "31/12/2025")
    val r2 = RestaurantTematic("El Paral·lel", "Barcelona", "Mediterrània", arrayListOf(p1,p2,p5), "tematica", e1)
    val r3 = RestaurantCarta("Can Roka", "Girona", "Casolana", 2, arrayListOf(p2,p4,p5), true)

    //Crear la cadena de restaurants
    val cadena = Cadena("ITB-NYAM")
    cadena.afegirRestaurant(r1)
    cadena.afegirRestaurant(r2)
    cadena.afegirRestaurant(r3)

    //Crear els clients
    val c1 = Client("Santi","12345", r1)
    r3.ferReserva(c1)

    val c2 = Client("Dani","98765", r2)
    c2.demanarPlat(p1)
    c2.demanarPlat(p2)
    c2.demanarPlat(p3)

    println(c2.getRestaurant().imprimirTiquet(c2))

    println(cadena.toString())

}