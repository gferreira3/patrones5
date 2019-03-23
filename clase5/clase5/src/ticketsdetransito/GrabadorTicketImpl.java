package ticketsdetransito;

import java.io.File;

public class GrabadorTicketImpl implements GrabadorTicket {
    private ConversorJSON conversorJSON;
    private String rutaGrabacion;

    public GrabadorTicketImpl(String rutaGrabacion, ConversorJSON conversorJSON) {
        this.conversorJSON = conversorJSON;
        this.rutaGrabacion = rutaGrabacion;
    }
    
    public void grabar(Ticket t) {
        String ticketString = conversorJSON.convertir(t);
        File ticket = new File(this.rutaGrabacion + t.idTicket);
        
        try {
            java.io.FileWriter escritorArchivo = new java.io.FileWriter(ticket);
            escritorArchivo.write(ticketString);
            escritorArchivo.flush();
            escritorArchivo.close();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
