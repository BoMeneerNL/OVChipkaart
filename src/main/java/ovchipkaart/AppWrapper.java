package ovchipkaart;
import static ovchipkaart.vartable.*;

public class AppWrapper {
    public static void main() {
        starter();
    }

    public static void starter() {
        while (go_on == "yes" || go_on == "Yes" || go_on == "YES") {
            while (effect.equals("NULL")) {
                System.out.println("What action is peformed?: 'ENTERING', 'EXITING', 'SALDOUP', 'SALDOCHECK'");
                effect = input.nextLine();
                switch (effect) {
                    case "NULL":
                    case "":
                    case " ":
                        System.out.println("Error could not recieve all or any data");
                        break;
                    case "ENTERING":
                        System.out.println("Loading: " + effect);
                        varchanger.getkaart();
                        poortjes_handler.entering();
                        cardnumber = "0";
                        break;
                    case "EXITING":
                        System.out.println("Loading: " + effect);
                        varchanger.getkaart();
                        poortjes_handler.exiting();
                        break;
                    case "SALDOUP":
                        System.out.println("Loading: " + effect);
                        varchanger.getkaart();
                        machines_handler.saldochange_up();
                        break;
                    case "SALDOCHECK":
                        System.out.println("Saldo aan het laden...");
                        System.out.println("je saldo is: " + saldo);
                    default:
                        System.out.println("Error could not resolve SYSTEM/input.act");
                        effect = "NULL";
                }
            }
            System.out.println("Do you want to continue(yes), or exit(no)");
            effect = "NULL";
            go_on = input.nextLine();
        }
    }
}
