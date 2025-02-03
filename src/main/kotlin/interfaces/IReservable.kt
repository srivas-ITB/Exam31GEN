package interfaces

import models.Client

interface IReservable {
    var reserves : ArrayList<Client>
    fun ferReserva(c:Client)
}