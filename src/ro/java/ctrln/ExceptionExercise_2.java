package ro.java.ctrln;

import java.util.Scanner;

public class ExceptionExercise_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) { // try with resources


            String firstLine = "";
            String secondLine = "";

            firstLine = readNextLine(scanner, firstLine);
            secondLine = readNextLine(scanner, secondLine);
//        if (scanner.hasNext()){
//            secondLine = scanner.nextLine();         //REFACTORIZAM DOUA POTIUNI DE COD IDENTICE DAR CU O VARIABILA DIFERITA
//            while(secondLine.trim().equals("")){     // refactor > extract method >ai dam un nume si inlocuim cu acesta metoda toate celelalte
//                if (scanner.hasNext()) {             //aparitii "ocurencies"
//                    secondLine = scanner.nextLine();
//                }
//            }
//        }
            System.out.println("FirstLine:" + firstLine);
            System.out.println("SecondLine:" + secondLine);
            int firstNumber = Integer.parseInt(firstLine.trim());
            double secondNumber = Double.parseDouble(secondLine.trim());  // TRIM ELIMINA SPATIILE ALBE DIN STRING
            System.out.println("Suma celor doua numere " + sum(firstNumber, secondNumber));
        } catch (NumberFormatException nfe) {
            System.out.println("Inputul de la tastatura nu este valid " + nfe.getMessage());
            nfe.printStackTrace(); // printeaza exact locatia exceptiei ,utila in caz ca nu suntem familiarizati codul
        } catch (Throwable throwable) {
            System.out.println("A Aparut aceasta exceptie " + throwable.getMessage());
        }
    }

    public static double sum(Integer firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static String readNextLine(Scanner scanner, String secondLine) {
        if (scanner.hasNext()) {
            secondLine = scanner.nextLine();
            while (secondLine.trim().equals("")) {
                if (scanner.hasNext()) {
                    secondLine = scanner.nextLine();
                }
            }
        }
        return secondLine;
    }


}
