package ro.java.ctrln;

public class MethodThrowingExceptions {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            System.out.println(appLogic(vector, 5, "23")); // daca index = 10 arunca Arrayindexoutofbounds
            System.out.println(appLogic(vector, 7, "45"));  // "45f" nu poate fi parsat(analizat) ca un numar ==> Numberformatexception
            System.out.println(appLogic(vector, 3, "13")); // sa testat nullPointerException apoi sa inlocuit cu 13
            System.out.println(appLogic(vector, 11, "ceva"));

        } catch (ArrayIndexOutOfBoundsException aioobe) {   // pentru index mai mare decat 9 throws ArrayIndexOutOfBoundsException
            System.out.println("Indexul specificat nu exista");
        } catch (NumberFormatException nfe) {
            System.out.println("Numarul transmis nu este un intreg");
        } catch (NullPointerException npe) {  // pot fi aruncate si exceptii care nu au fost prinse de la inceput in signatura metodei sau de care inca nu stim
            System.out.println("Este un null pe undeva");
        } catch (Throwable throwable) {
            System.out.println("A aparut o exceptie ce trebuie tratata!");
            System.out.println(throwable.getClass());
        }
    }

    public static int appLogic(int[] vector, int index, String number) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        if(index > 10){
            throw new IllegalArgumentException("Indexul nu poate fi mai mare decat 10"); // O noua exceptie in corpul metodei se instantiaza cu "new"
        }
        if(number.startsWith("0")) {
            System.out.println("Numarul nu poate incepe cu 0");
        }
        return vector[index] + Integer.parseInt(number); //"parses" parseInt analizeaza int ul primit ca String (number)
    }
}
