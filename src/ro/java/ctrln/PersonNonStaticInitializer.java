package ro.java.ctrln;

public class PersonNonStaticInitializer {

    private int age;
    private String name;

    //bloc de initializare non static sau bloc de initializare de instanta { }
    // va incerca sa l execute de fiecare data cand se creaza un obiect al clasei
    {
        age = 10;
        name = "John";
        if (age < 0) {
            throw new CtrlNCheckedException("age nu este valid"); //Putem trata orice exceptie cu try =catch dar in cazul de fata pt ca este un bloc non
            // static putem sa l tratm cu throws in construtor
        }
    }

    // daca folosim costructorul implicit codul va genera eroare de compilare
    //trebuie folosit THROWS pentru a gestiona exceptia pt ambi costructori(cu si fara parametri)
    public PersonNonStaticInitializer(int age, String name) throws CtrlNCheckedException {
        this.age = age;
        this.name = name;
    }

    public PersonNonStaticInitializer() throws CtrlNCheckedException{

    }

    @Override
    public String toString() {
        return "PersonNonStaticInitializer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        try {
            PersonNonStaticInitializer personOne = new PersonNonStaticInitializer();// Unhandeld exception trebuie prins cu TRY
            PersonNonStaticInitializer personTwo = new PersonNonStaticInitializer(-40, "Mary");
            System.out.println(personOne);
            System.out.println(personTwo);
        }catch (CtrlNCheckedException cnue){
            System.out.println("Obiectul creat cu valori invalide");
        }
    }
}
