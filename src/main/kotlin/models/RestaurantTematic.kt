package models;

import interfaces.IReservable

public class RestaurantTematic : Restaurant, IReservable {
    private var tematica: String
    private var espectacle : Espectacle

    constructor(nom: String, poblacio: String, tipusCuina: String, plats: ArrayList<Plat>, tematica:String, espectacle:Espectacle) : super(nom, poblacio, tipusCuina, plats) {
        this.tematica = tematica
        this.espectacle = espectacle
    }

    override fun imprimirTiquet(c:Client): String {
        return """
            ** Tiquet del restaurant temàtic **
            ${nom}
            |Espectacle: ${espectacle.nom}  fins el ${espectacle.acabament.toString()}
            Plats demanats: 
            ${c.getPlats()}  
            Preu total: ${demanarCompte(c)}
        """.trimIndent()
    }

    override fun demanarCompte(c: Client): Double {
        var preuTotal : Double = 0.0
        for (plat in c.getDemanats()) {
            preuTotal += plat.getPreu()
        }
        return  preuTotal
    }

    override var reserves: ArrayList<Client>
        get() = reserves
        set(value) {}

    override fun ferReserva(c: Client) {
        reserves.add(c)
    }

}