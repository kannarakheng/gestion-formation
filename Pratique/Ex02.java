package Pratique;

import java.util.Date;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Entrer votre nom :");
        Scanner scan = new Scanner(System.in);

        String snom = scan.nextLine();

        Date dateJour = new Date();

        //SimpleDateFormat formaterDate = new SimpleDateFormat("")

        System.out.println(dateJour + " Bienvenue " + snom);


    }
}
