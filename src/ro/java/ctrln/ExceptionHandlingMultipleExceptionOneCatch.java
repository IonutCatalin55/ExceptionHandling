package ro.java.ctrln;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class ExceptionHandlingMultipleExceptionOneCatch {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(2.73);
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            System.out.println(vector[9]);
            bigDecimal = null;
            System.out.println(bigDecimal.intValue());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException exception ) { //exceptii tratate intr un singur catch

            if(exception instanceof ArrayIndexOutOfBoundsException) {  //FOARTE IMPORTANT!!! Daca exception este instanta lui aioobe
                System.out.println("Nu exista acest index");           // printeaza lina 19
            }if(exception instanceof NullPointerException){            // //FOARTE IMPORTANT!!! Daca exception este instanta lui npe
                System.out.println("Obiectul referit este null");      // // printeaza lina 21
            }
        } finally { // blocul finally este optional SE RECOMANDA CAND VREI SA INCHIZI O RESURSA DIN CODUL TAU(UN FISIER,SCANNERUL ETC)
                    // PENTRU A EVITA MEMORY LEACKS
            System.out.println("Suntem in blocul finally");
            System.out.println("Acestas se executa de fiecare data");
        }
        /*catch (NullPointerException npe) {
            System.out.println("Obiectul referit este null");  // exceptii tratate  in catch uri separate
        }*/
    }
}
