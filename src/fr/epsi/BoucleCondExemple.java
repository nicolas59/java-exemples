package fr.epsi;

public class BoucleCondExemple {

    public static void calculate() {
        String operator = "+";
        double a = 6;
        double b = 10;
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Operateur non supporté");
        }
    }

    public static void calculatePgcd(int val1, int val2) {
        while (val2 != 0) {
            int swap = val2;
            val2 = val1 % val2;
            val1 = swap;
        }
        System.out.println("PGCD : " + val1);

    }

    public static void main(String[] args) {
        calculate();
        calculatePgcd(782, 221);

        for (int count = 0; count < 10; count++) {
            System.out.print(count + " ");
        }

        String[] names = {"Anakin", "Leia", "Luke",
                "Obi wan", "Han Solo", "Chewbaca"};
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        int index = 10;
        for (; ; ) {
            System.out.println(index);
            index--;
            if (index == 0) {
                break;
            }
        }

        //foreach
        for (int number = 0; number < 5; number++) {
            if (number % 2 != 0) {
                continue;
            }
            System.out.format("Le nombre %s est pair.\n", number);
        }


    }
}
