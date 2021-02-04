package ovchipkaart;
import java.util.Scanner;
import static ovchipkaart.vartable.*;

public class AppWrapper {
    public static void main() {
        System.out.println("welk saldo ");
        starter();
    }
    public static void starter() {
        while (effect == "NULL") {
            System.out.println("What action is peformed?: 'ENTERING', 'EXITING', 'SALDOUP', 'SALDODOWN', 'SALDOCHECK'");
            effect = input.nextLine();
            switch (effect) {
                case "NULL":
                    System.out.println("Error could not recieve all or any data");
                    break;
                case "ENTERING":
                    System.out.println("Loading: " + effect);
                    poortjes_handler.entering();
                    break;
                case "EXITING":
                    System.out.println("Loading: " + effect);
                    break;
                case "SALDOUP":
                    System.out.println("Loading: " + effect);
                    break;
                case "SALDODOWN":
                    System.out.println("Loading: " + effect);
                default:
                    System.out.println("Error could not resolve SYSTEM/input.act");
                    effect = "NULL";
            }

        }
    }
}
