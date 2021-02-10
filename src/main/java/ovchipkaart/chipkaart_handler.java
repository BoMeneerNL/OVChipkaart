package ovchipkaart;
import static ovchipkaart.vartable.*;

public class chipkaart_handler {
    public static void main() {

    }
    public static void handler_down_20(){
        saldo = saldo - 20;
    }
    public static void routetracker(){
        switch (haltes){
            case 0:
            saldo = saldo + 20;
            saldo = saldo - haltekosten;
        }
    }
}
