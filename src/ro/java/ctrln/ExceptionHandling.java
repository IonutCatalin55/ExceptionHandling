package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrie un input de la tastatura: ");
        int counter = 0;
        while (scanner.hasNext() && counter < 10){
            try {
                System.out.println("Numarul " + counter + " citit este " + scanner.nextDouble());
                System.out.println("Scrie un input de la tastatura: ");
                counter++; // counter incrementat in aeasta pozitie va numara 10 numere valide
            } catch (InputMismatchException ime){
                System.out.println("Inputul de la tastatura este invalid");
                scanner.next(); // oprest loop ul de mai sus si orteaza citirea de la tastatura a altui input
                System.out.println("Scrie alt input");
                
            }
            //counter++; Counter incrementa in pozitia acastava numara 10 numere indiferent daca sunt valide sau nu


        }
        System.out.println("Thred-ul main se incheie!");
    }
}

