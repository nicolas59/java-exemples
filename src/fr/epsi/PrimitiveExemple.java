package fr.epsi;

public class PrimitiveExemple {

    public static void main(String[] args) {
        int index = 17;

        char letterA = 'A';
        char letter = 0x041; // Le caractére A en hexa

// Un char est un numerique dont possibilité de mettre directement une valeur
        char letterNumA = 65;
        System.out.println(letterA == letterNumA); //true
        System.out.println(letterNumA);     //Affiche A

        short letterAn = (short) letterA;
        System.out.println(letterAn);  //Affiche 65

        long largeValue = 789999;

// Avec separateur _ pour une meilleur visibilité
        long precision = 34_000_000;

        float variation = -145.78f;

        double degree = 27.8;
        double scientificNotation = 1.56e2;


// suffixé par un d
        double price = 139.99d;

        boolean status = false;


        //Explicit
        int value = 56;
        short castValue = (short) value; 


//Implicit
        short valueS = 56;
        int valueI = valueS;
        System.out.printf("valueS : %s\n", valueS);
        System.out.printf("valueI : %s\n", valueI);

//Perte de precision
        int number = (int) 34.78; // number = 34
        System.out.printf("Value : %s\n", 34.78);
        System.out.printf("Number : %s\n", number);

    }
}
