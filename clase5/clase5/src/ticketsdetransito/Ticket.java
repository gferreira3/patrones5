package ticketsdetransito;

import sensorvelocidad.VehiculoData;

public class Ticket {
    public final VehiculoData vehiculoData;
    public final int multa;
    public final String idTicket;
    
    public Ticket(String idTicket, VehiculoData vehiculoData, int multa) {
        this.vehiculoData = vehiculoData;
        this.multa = multa;
        this.idTicket = idTicket;
    }
}
