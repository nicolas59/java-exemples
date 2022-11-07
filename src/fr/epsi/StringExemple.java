package fr.epsi;

import java.util.Objects;

public class StringExemple {

    public static int MAX_ITERATION = 100000;

    public static void testEqualite() {
        String a = "hello";
        String b = "hello";
        boolean result = a == b;
        System.out.println("[A ne jamais faire] a==b :\t\t\t " + result);
        System.out.println("[Ce qu'il faut faire] a.equals(b) :\t " + a.equals(b));

        a = "hello";
        b = new String("hello");
        result = a == b;
        System.out.println("[A ne jamais faire] a==b :\t\t\t " + result);
        System.out.println("[Ce qu'il faut faire] a.equals(b) :\t " + a.equals(b));

        a = "hello";
        b = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println("[A ne jamais faire] a==b :\t\t\t " + (a == b));
        System.out.println("[Ce qu'il faut faire] a.equals(b) :\t " + a.equals(b));

        //et egalement --> avantage evite de tester le cas ou a est null !
        System.out.println("[Ce qu'il faut faire aussi] Objects.equals(a,b) :\t " + Objects.equals(a, b));
    }


    public static void testStringVsStringBuilder() {
        long start = System.currentTimeMillis();
        String r = "";
        for (int i = 0; i < MAX_ITERATION; i++) {
            r += i;
        }

        System.out.println("Duree concatenation :  " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < MAX_ITERATION; i++) {
            builder.append(i);
        }

        System.out.println("Duree concatenation avec StringBuilder :  " + (System.currentTimeMillis() - start));

    }

    public static void main(String[] args) {
        System.out.println("----------------------------");
        testEqualite();

        System.out.println("----------------------------");
        // concatenation avec +
        String hello = "Hello";
        String name = "Nicolas !";
        String message = hello + " " + name;
        System.out.println(message);

        //decoupage string
        String string = "Java c'est plutôt sympa";
        System.out.println(string.length());
        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        //substring
        String extractWord = string.substring(18);
        System.out.println(extractWord);

        //replace
        String replaceWord = string.replace("Java", "JavaScript");
        System.out.println(replaceWord);


        //stringbuilder
        String otherMessage = new StringBuilder().append(hello)
                .append(" ")
                .append(name)
                .toString();
        System.out.println(otherMessage);

        System.out.println("----------------------------");
        testStringVsStringBuilder();
    }
}
