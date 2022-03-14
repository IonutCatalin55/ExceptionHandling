package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMultipleCatches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrie un input de la tastatura: ");
        int counter = 0;
        while (scanner.hasNext() && counter < 10) {  //est posibil sa introducem tot blocul while in try dar acesta poate contine
            try {                                    // alte lini de cod unde nu vrem sa prindem excptii

                if (counter == 5) {
                    scanner.close();  // testem counterul inainte sa citim input de la tastatura
                }
                System.out.println("Numarul " + counter + " citit este " + scanner.nextDouble());
                System.out.println("Scrie un input de la tastatura: ");
                counter++; // counter incrementat in aeasta pozitie va numara 10 numere valide
                /*if (counter == 5) {
                    scanner.close();    // testez counterul dupa ce introduc nr de la tastatura si nu prind exceptia
                }*/

            } catch (InputMismatchException ime) {
                System.out.println("Inputul de la tastatura este invalid");
                scanner.next(); // oprest loop ul de mai sus si orteaza citirea de la tastatura a altui input
                System.out.println("Scrie alt input");
            } catch (IllegalStateException ise) { // pride a doua exceptie ise
                System.out.println("Scanerul este inchis! Nu avem cum sa mai citim numere!");
                break; // inchide while si ne scoate din bucla
            }
            //counter++; Counter incrementa in pozitia acastava numara 10 numere indiferent daca sunt valide sau nu


        }
        System.out.println("Thred-ul main se incheie!");
    }
}

