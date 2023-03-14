package Pratique;

public class ExString {
        public static void main(String[] args){
        String s = "15,16,20,15";

        System.out.println(s);

        System.out.println("longueur de la chaine :" + s.length());
        System.out.println("premier caractère :"+ s.charAt(0));
        System.out.println("premier nbre :"+ s.substring(0, 2));
        System.out.println("deuxième nbre :"+ s.substring(3, 5));
        System.out.println("troisième nbre :"+ s.substring(6, 8));
        System.out.println("quatrième nbre :"+ s.substring(9, 11));

        int[] tab2 = {0,0,0,0};
        tab2[0] = String.valueOf(s.substring(0,2));
        tab2[1] = String.valueOf(s.substring(3, 5));
        tab2[2] = String.valueOf(s.substring(6, 8));
        tab2[3] = String.valueOf(s.substring(9, 11));
     
        int somme;
        double moyenne;
        somme = 0;
        moyenne = 0.00;

        for (int i = 0; i < tab2.length; ++i) {
            somme = somme + tab2[i];
        }

        moyenne = somme / tab2.length;
        String moyenneString = String.valueOf(moyenne);

        System.out.println("La moyenne du tableau est égal à " + moyenneString);

        
    }

}
