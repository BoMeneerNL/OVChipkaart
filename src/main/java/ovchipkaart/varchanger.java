package ovchipkaart;

import static ovchipkaart.vartable.*;

public class varchanger {
    public static void getkaart(){
        while (cardnumber.equals("0")) {
        if (cardnumber.equals("0")) {
            System.out.println("Welcome to this module(" + effect + "), but before you can proceed we need to know if you want to make your own input or a pre-made card, if you want to make an input yourself choose 'self'");

            }
            cardnumber = input.nextLine();
        }
        if (cardnumber.equals("self") || cardnumber.equals("Self") || cardnumber.equals("SELF")){
            System.out.println("What should the 'saldo' be?");
            saldo = input.nextDouble();
            System.out.println("What should the new amount 'haltes' be? (just say 0 if not using EXITING)");
            haltes = input.nextInt();
        }
        else if (cardnumber == "35289921214821113842" || cardnumber == "35288324327821942231" ){
                switch (cardnumber){
                    case "35289921214821113842":
                        saldo = 35.20;
                        haltes = 2;
                    case "35288324327821942231":
                        saldo = -10.00;
                        haltes = 12;
                    case"":
                }
            }
        }
    }

