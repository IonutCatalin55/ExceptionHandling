package ro.java.ctrln;

public class ThrowException {

    private static void doSomething(Integer a) {
        System.out.println("Do something with " + a + "!");
        if (a > 5) {
            throw new IllegalArgumentException("a este mai mare decat 5");
        }
    }

    public static void main(String[] args) {
        try {
            doSomething(3);
            doSomething(10);
        } catch (IllegalArgumentException iae){
            //throw new IllegalArgumentException("Trebuie sa tratezi aceasta exceptie")
            // nu este recomandatsa arunci o exceptie in alta exceptie - se paseaza rezolvarea altcuiva
            System.out.println("Numarul transmis nu este ok!");
        }
    }
/////   TREBUI NEAPARAT TRATATA EXCEPTIA ARUNCATA DE NOI(INCONJUAM CU TRY SICATCH BLOCUL DE COD UNDE NE ASTEPTAM LA PROBLEME)

}
