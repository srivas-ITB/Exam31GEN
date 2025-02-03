package models;

import interfaces.IReservable

public class RestaurantBuffetLliure : Restaurant {
    private var preu: Double

    constructor(nom: String, poblacio: String, tipusCuina: String, plats:ArrayList<Plat>, preu:Double) : super(nom, poblacio, tipusCuina, plats) {
        this.preu = preu
    }

    override fun imprimirTiquet(c:Client): String {
        TODO("Not yet implemented")
    }

    override fun demanarCompte(c: Client): Double {
        return preu
    }


}