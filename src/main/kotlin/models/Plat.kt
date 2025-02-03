package models

class Plat {
    private var nom: String
    private var preu: Double

    constructor(nom: String, preu: Double) {
        this.nom = nom
        this.preu = preu
    }

    fun getNom(): String {
        return nom
    }

    fun getPreu(): Double {
        return preu
    }

}