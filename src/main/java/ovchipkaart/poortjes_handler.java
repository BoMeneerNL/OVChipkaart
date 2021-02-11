package ovchipkaart;
import static ovchipkaart.vartable.*;

public class poortjes_handler {
    public static void entering(){
        chipkaart_handler.handler_down_20();
    }
    public static void exiting(){
        chipkaart_handler.routetracker();
    }
}
