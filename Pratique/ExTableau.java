package Pratique;

public class ExTableau {
    public static void main(String[] args) {
        //int[] tab = new int[3];
        /*
         * int[] tab1, tab2;
         * int[] tab1, tab2; == int[] tab1; int tab2;
         * int[] tab = new int[3];
         * int[] tab = {1, 2, 3};
         * int[] tab = new int[]{1, 2, 3}
         *  
         */
        int[] tab = {1, 2, 3};

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        for (int i = 0; i < tab.length; ++i) {
            System.out.println(tab[i]);
        }

        for(int number : tab)
            System.out.println(number);

        int[][] tab2 = {{1, 2, 3},{4, 5, 6}};
        //int[][] tab2 = new int[2][3]; declaration d'un tableau à 2 dimensions
        
        System.out.println(tab2[1][1]);

        for (int i = 0; i < tab2.length; ++i) {
            for (int j = 0; j < tab2[i].length; ++j) {
                System.out.println(tab2[i][j]);
            }
        }

        /* ce code fait exactement la même chose que précédemment
        for (int[] k : tab2)
            for (int number2 : k)
                System.out.println(number2);
        */


    }
}
