package testtickets;

import ticketsdetransito.*;
import java.io.File;

public class GrabadorTicketMock implements GrabadorTicket {
    
    private boolean huboTicket;
    
    public GrabadorTicketMock() {
        huboTicket = false;
    }
    public void grabar(Ticket t) {
        huboTicket = true;
    }

    public boolean isHuboTicket() {
        return huboTicket;
    }
    public void setHuboTicket(boolean huboTicket) {
        this.huboTicket = huboTicket;
    }
}
