package ro.java.ctrln;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in);// nu este necesar si blocul catch pt try with resources // try (){}
            Scanner scannerone = new Scanner(System.in)){   // se pot folosi mai multe resurse si la final ele vor fi inchise in ordine inversa
            if (scanner.hasNext()){                         // dupa care se executa blocul de cod din catch sau catch uri sau blocul de cod din FINALLY
                System.out.println("Numaul citit este " + scanner.nextDouble()); // pt 34d care nu este un doubl se arunca exceptia inputmismatchexception
                                                                                 // si trebuie prinsa cu catch
            }
        }catch (InputMismatchException ime ){
            System.out.println("Imputul citit nu este valid");
            //scanner.close();      ==> scanner nu exista decat in interiorul blocului try scopul resusei scanner este doar in interiorul blocului try
            // asemanator indexului in  FOR exista dor in interiorul lui For
            // scaner ese inchis de JAVA dupa folosirea in try pt a preveni MemoryLeacks
        }
    }
}
