package models

class Client {
    private var nom : String
    private var telefon : String
    private var restaurant : Restaurant
    private var demanats : ArrayList<Plat>

    constructor(nom: String, telefon:String, restaurant: Restaurant) {
        this.nom = nom
        this.telefon = telefon
        this.restaurant = restaurant
        this.demanats = ArrayList()
    }


    fun demanarCompte() : Double {
        //TODO
        throw NotImplementedError()
    }

    fun demanarPlat(plat: Plat) {
        if(restaurant.demanarPlat(plat)) {
            demanats.add(plat)
        }
    }

    fun getRestaurant() : Restaurant {
        return restaurant
    }

    fun getPlats() : String {
        var llistaPlats : String = ""
        for (plat in demanats) {
            llistaPlats += plat.getNom() + "   " +  plat.getPreu() + "\n"
        }
        return llistaPlats
    }

    fun getDemanats() : ArrayList<Plat> {
        return demanats
    }
}