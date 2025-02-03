package models;

public abstract class Restaurant {
    protected var nom: String
    private var poblacio : String
    private var tipusCuina : String
    private var plats : ArrayList<Plat>

    constructor(nom: String, poblacio: String, tipusCuina: String, plats: ArrayList<Plat>) {
        this.nom = nom
        this.poblacio = poblacio
        this.tipusCuina = tipusCuina
        this.plats = plats
    }

    abstract fun imprimirTiquet(c:Client):String
    abstract fun demanarCompte(c:Client) : Double


    fun demanarPlat(plat: Plat) :Boolean {
        return plats.contains(plat)
    }

    protected fun getPlats(): String {
        var str = ""
        for (plat in plats) {
            str += plat.getNom() + "   " +  plat.getPreu() + "\n"
        }
        return str
    }

    override fun toString(): String {
        return """
            Nom: ${nom}
            Població: ${poblacio}
            Tipus de cuina: ${tipusCuina}
            Plats: 
            ${getPlats()}
        """.trimIndent()
    }
}