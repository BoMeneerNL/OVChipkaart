package ovchipkaart;
import java.util.Scanner;

public class vartable {
    public static Double saldo = 0.00;
    public static String effect = "NULL";
    static Scanner input = new Scanner(System.in);
    //Card number is a string because of card self creation ("self")
    public static String cardnumber = "0";
    public static int haltes = -1;
    public static double haltekosten = 0;
    public static double nieuwsaldo = 0;
    public static String go_on = "ja";
}
