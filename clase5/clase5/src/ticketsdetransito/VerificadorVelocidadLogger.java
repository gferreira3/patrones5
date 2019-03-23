package ticketsdetransito;

import sensorvelocidad.VehiculoData;

public class VerificadorVelocidadLogger extends VerificadorVelocidad {
    // La extension del VerificadorVelocidad es solo para engañar
    // A quien utiliza VerificadorVelocidad
    // Lo que importa es la composicion
    // Esto se denomina ASPECT
    private VerificadorVelocidad verificadorVelocidad;

    public VerificadorVelocidadLogger(VerificadorVelocidad verificadorVelocidad) {
        this.verificadorVelocidad = verificadorVelocidad;
    }
    public void verificarSiCorrespondeMulta(VehiculoData vehiculoData) {
        System.out.println("Antes de llamar a verificar velocidad");
        System.out.println(vehiculoData.patente);
        System.out.println(vehiculoData.limiteVelocidad);
        System.out.println(vehiculoData.tipoVehiculo);
        System.out.println(vehiculoData.velocidadMedida);
        System.out.println("--------------------------------");
        verificadorVelocidad.verificarSiCorrespondeMulta(vehiculoData);
        System.out.println("Despues de llamar a verificar velocidad");
    }
}
