package coffeehouse;

import java.util.Scanner;

public class MyApp {

    public void Start(){
        int choice = -1 ;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Show menu : please enter 1 that choice this command ");
            System.out.println("Take order : please enter 2 that choice this command "); // тут будут дальше команды для оплаты заказа и номер заказа !!
            System.out.println("Close : please enter 2 that choice this command ");
            System.out.println(" staff only employeers : 00");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    ///
                case 2 :
                    ///
                case 3 :
                    ///
                case 4 :
                    ///
                case 5 :
                    ///
                case 6 :
                    ///
            }
        }
    }
}