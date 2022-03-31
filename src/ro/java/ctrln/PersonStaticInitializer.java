package ro.java.ctrln;

public class PersonStaticInitializer {

    private static int age;
    // un bloc de cod de initializare static este executat de JVM
    //indiferent daca creem obiecte noi sau nu din clasa corespunzatoare

    static {
        age = 10;
        // Putem sa aruncam exceptii unchecked  => adica exceptii aruncate la runtime de catre JVM
        if (age % 2 == 0) {
            throw new CtrlNUncheckedException("Age nu are o valoare valida!");
        }
        // Eroare de compilare CtrlNCheckedException= extinde Exception care este o eroare checked
        // daca vrem sa avem astel de exceptii trebuie sa le tratam in blocuri try-catch
        try {
            if (age == 10) {
                throw new CtrlNCheckedException("");
            }

        } catch (CtrlNCheckedException cnce) {
            System.out.println("Exceptie la initializarea age!");
        }
    }

    public static void main(String[] args) { // de evitat sa aruncam exceptii in blocurile de cod statice deoarece nu avem control asupra lor
        System.out.println("Rulare program!");
    }
}
