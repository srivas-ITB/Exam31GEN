package models;

import interfaces.IReservable

public class RestaurantCarta : Restaurant, IReservable {
    private var numSalons: Int
    private var admetEvents : Boolean
    override var reserves: ArrayList<Client>

    constructor(nom: String, poblacio: String, tipusCuina: String, numSalons:Int, plats:ArrayList<Plat>, admetEvents:Boolean) : super(nom, poblacio, tipusCuina, plats) {
        this.numSalons = numSalons
        this.admetEvents = admetEvents
        this.reserves = ArrayList()
    }

    override fun imprimirTiquet(c:Client): String {
        TODO("Not yet implemented")
    }

    override fun demanarCompte(c: Client): Double {
        TODO("Not yet implemented")
    }

    override fun ferReserva(c: Client) {
        reserves.add(c)
    }

}