package ticketsdetransito;

import sensorvelocidad.Patentes;

public class Factory {
    private GrabadorTicketImpl obtenerImplementaionTicket() {
        return new GrabadorTicketImpl(
                "c:\\clase5\\tickets\\",
                new ConversorJSON()
            );
    }
    public VerificadorVelocidad obtenerVerificadorVelocidad() {
        return new VerificadorVelocidadLogger(
                new VerificadorVelocidad(
                    obtenerImplementaionTicket()
                )
        );
    }
    public Mediador obtenerMediador() {
        return new Mediador(
                obtenerVerificadorVelocidad(), 
                () -> Patentes.sensarVehiculo()
        );
    }
}
