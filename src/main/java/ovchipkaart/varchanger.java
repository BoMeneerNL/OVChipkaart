package ovchipkaart;

import static ovchipkaart.vartable.*;

public class varchanger {
    public static void main(){

    }
    public static void getkaart(){
        while (cardnumber == "0") {
        if (cardnumber == "0") {
            System.out.println("Welcome to this module(" + effect + "), but before you can proceed we need to know if you want to make your own input or a pre-made card, if you want to make an input yourself choose 'self'");
            cardnumber = input.nextLine();
            }
        }
        if (cardnumber == "self" || cardnumber == "Self" || cardnumber == "SELF" ){
            System.out.println("What should the new 'saldo' be?");
            saldo = input.nextDouble();
            System.out.println("What should the new amount 'haltes' be?");
            haltes = input.nextInt();
        }
    }
}
