package models

class Cadena {
    private var nom : String
    private var restaurants : ArrayList<Restaurant>

    constructor(nom: String) {
        this.nom = nom
        this.restaurants = ArrayList()
    }

    fun afegirRestaurant(restaurant: Restaurant) {
        restaurants.add(restaurant)
    }

    override fun toString() : String {
        var str = "Cadena de restaurants: " + nom + "\n"
        for (restaurant in restaurants) {
            str += restaurant.toString() + "\n"
        }
        return str
    }
}