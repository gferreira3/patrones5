package ticketsdetransito;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Init {
    public static void log() {
        String s = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(s);
    }
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.obtenerMediador().init();
    }
}
