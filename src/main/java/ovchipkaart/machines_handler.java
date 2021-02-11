package ovchipkaart;
import static ovchipkaart.vartable.*;

public class machines_handler {
    public static void main() {

    }
    public static void saldochange_up(){
        System.out.println("Welkom bij Saldo opvoeren, hoeveel saldo gaat er op de kaart?");
        nieuwsaldo = input.nextDouble();
        saldo = saldo + nieuwsaldo;
    }
}
