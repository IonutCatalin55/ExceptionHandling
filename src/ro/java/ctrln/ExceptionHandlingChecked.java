package ro.java.ctrln;

public class ExceptionHandlingChecked {

    public static void main(String[] args) {
        //cand folosesc checked esceptions sunt obligat(de catre compilator) sa tratez codul meu de exceptii
        try {
            recover(1); // aceasta este o exceptie checked pe care compilatorul o vede si trebuie rezolvata cu try / catch
            recover(-200, "Verifica inputul!");
        }catch (CtrlNCheckedException cnce) {
            System.out.println("Trebuie o valoare mai amre sau egala decat zero!");
        }

    }
    public static void recover(int a, String message) throws CtrlNCheckedException {
        System.out.println("Verifica imputul!");
        recover(200); //ne anunta ca avem o exceptie netratata = o putem prinde cu try catch sau o aruncam mai departe cu throws in signatura metodei
    }

    public static void recover(int a) throws CtrlNCheckedException {  // throws face ca ctrlncheckedexception sa fie checked exception
        if (a < 0) {
            throw new CtrlNCheckedException("a trebuie sa fie >= 0 !");
        }
        System.out.println("a este valid: " + a);

    }
}
