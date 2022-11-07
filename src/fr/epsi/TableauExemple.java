package fr.epsi;

import java.util.Arrays;

public class TableauExemple {

    public static void main(String[] args) {

// Tableau de float
        float distances[] = new float[5];
        System.out.println(Arrays.toString(distances));

// Initialisation directe avec valeur
        double[] values = {1.0, 2, 3.0};
        System.out.println(Arrays.toString(values));

// tableau de chaines de caractéres
        String[] name;
        name = new String[5];

        int[] arrayOfInt = new int[5];
        arrayOfInt[0] = 10;
        arrayOfInt[1] = 20;
        arrayOfInt[3] = 40;
        arrayOfInt[4] = 50;
        arrayOfInt[2] = 30;
        System.out.format("Valeur à l'index 3 : %d\n", arrayOfInt[3]);
        System.out.println(Arrays.toString(arrayOfInt));

        int[][] table;
        table = new int[4][2];


        double[][] tab = new double[2][];
        tab[0] = new double[2];
        tab[1] = new double[4];
        tab[1][3] = 10;

        int[][] otherTab = {{1,2},{1,2,3,4,5}};
        System.out.format("Valeur à l'index 1,2 : %d\n",otherTab[1][2]);

    }
}
