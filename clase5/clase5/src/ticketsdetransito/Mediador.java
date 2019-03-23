package ticketsdetransito;

import java.util.function.Supplier;
import sensorvelocidad.Patentes;
import sensorvelocidad.VehiculoData;

public class Mediador {
    private VerificadorVelocidad verificadorVelocidad;
    private Supplier<VehiculoData> produceVD; 

    public Mediador(VerificadorVelocidad verificadorVelocidad, Supplier<VehiculoData> produceVD) {
        this.verificadorVelocidad = verificadorVelocidad;
        this.produceVD = produceVD;
    }
    
    public void init() {
        for (;;) {
            sensorvelocidad.VehiculoData vd = produceVD.get();
            verificadorVelocidad.verificarSiCorrespondeMulta(vd);
        }
    }
}
