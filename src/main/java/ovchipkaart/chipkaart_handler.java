package ovchipkaart;
import static ovchipkaart.vartable.*;

public class chipkaart_handler {
    public static void handler_down_20(){
        saldo = saldo - 20;
    }
    public static void routetracker(){


        switch (haltes){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            saldo = saldo + 20;
            haltekosten = haltes * 0.75;
            saldo = saldo - haltekosten;
            break;
            default:
             System.out.println("Error, 'haltes' to high (max = 15)");

        }
    }
}