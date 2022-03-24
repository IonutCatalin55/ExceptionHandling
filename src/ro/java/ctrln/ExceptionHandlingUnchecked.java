package ro.java.ctrln;

public class ExceptionHandlingUnchecked {

    public static void main(String[] args) {
        try {
            recover(3);
            recover(-6);
        }catch (CtrlNUncheckedException cnue){
            System.out.println("Valoarea transmisa trebuie sa fie mai >= decat 0!");
        }

    }

    private static void recover(int a) {  // nu este oligatoriu sa definim cu throws exceptia unchecked
        if(a < 0){
            throw new CtrlNUncheckedException("a trebuie sa fie mai mare sau egal decat 0!");
        }
        System.out.println("Valoarea este a!");
    }
}
