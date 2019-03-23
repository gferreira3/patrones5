package ticketsdetransito;

import sensorvelocidad.VehiculoData;

public class VerificadorVelocidad {
    private GrabadorTicket grabadorTicket = null;

    public VerificadorVelocidad() {
    }
    public VerificadorVelocidad(GrabadorTicket grabadorTicket) {
        this.grabadorTicket = grabadorTicket;
    }
    public void verificarSiCorrespondeMulta(VehiculoData vehiculoData) {
        double supera10Porc = (10*vehiculoData.limiteVelocidad) / 100;
        int valorMulta;
        if (vehiculoData.velocidadMedida > vehiculoData.limiteVelocidad) {
            if ((vehiculoData.velocidadMedida - vehiculoData.limiteVelocidad) > supera10Porc) {
                valorMulta = 5000;
            }
            else {
                valorMulta = 1000;
            }
            Ticket ticket = new Ticket(java.util.UUID.randomUUID().toString(), vehiculoData, valorMulta);
            grabadorTicket.grabar(ticket);
        }
    }
}
