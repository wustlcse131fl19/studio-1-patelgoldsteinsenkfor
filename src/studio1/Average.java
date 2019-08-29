package studio1;

import support.cse131.ArgsProcessor;

public class Average {


    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        int n1 = ap.nextInt("Value for n1? (first of the 2 ints to be averaged)");
        int n2 = ap.nextInt("Value for n2? (second of the 2 ints to be averaged)");

        double average = ((double) n1 + (double) n2)/2;

        System.out.println ("The average of the two numbers is " + average + ".");
    }









}
