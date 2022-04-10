package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise {


    public static void suma(int a1, double a2) {
        System.out.println("Suma numerelor este " + (a1 + a2));
    }

    public static void main(String[] args) {
        Scanner b1 = new Scanner(System.in);
        Scanner b2 = new Scanner(System.in);

        try {
            System.out.println("Introdu un numar intreg: " + b1);

            while (!b1.hasNextInt()) {
                System.out.println("Reintrodu numarul intreg: " + b1.nextInt());
            }

            System.out.println("Introdu un numar double: ");

            while (!b2.hasNextDouble()) {
                System.out.println("Reintrodu numarul double: " + b2.nextDouble());
            }

            suma(b1.nextInt(), b2.nextDouble());
        } catch (InputMismatchException ime) {
            System.out.println("Se introduc date eronate");
            System.out.println("Reintrodu intregul" + b1.nextInt());
            System.out.println("Reintrodu double " +b2.nextDouble());
        }

//            while (!b1.hasNextInt()) throw new IllegalStateException("Introdu un numar intreg");

//            System.out.println("Introdu un numar double: ");
//
//            while (!b2.hasNextDouble()) throw new IllegalStateException("Introdu un numar double");
//
//            if(b1.hasNextInt() && b2.hasNextDouble()){
//                suma(b1.nextInt(), b2.nextDouble());
//            }


//        catch (InputMismatchException ime){
//            System.out.println("Verifica inputul cerut!");
//            System.out.println("Reintrodu inputul");
//        }

//        try {
//            System.out.println("Introdu un numar intreg: ");
//            if (b1.hasNextInt()) {
//                while (b1.hasNextInt()) {
//                    System.out.println("Introdu un numar: ");
//                }
//            }
//            else {
//                System.out.println("Reintrodu un numar intreg: ");
//            }
//            if (b2.hasNextDouble()) {
//                suma(b1.nextInt(), b2.nextDouble());
//            } else {
//                System.out.println("Reintrodu un numar ");
//            }
//
//
//        } catch (InputMismatchException ime) {
//            System.out.println("Introdu un numar valid");
//        }
    }

}
