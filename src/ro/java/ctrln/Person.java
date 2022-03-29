package ro.java.ctrln;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws CtrlNCheckedException { //se poate arunca exceptie in constructor
        if (name == null || name.equals("")) {
            throw new CtrlNCheckedException("Numele trebuie a aiba o valoare!");
        }
        if (age < 0) {
            throw new CtrlNCheckedException("Varsta trebuie sa fie un numar pozitiv!");
        }
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { //se poate arunca exceptie in setter
        throw new UnsupportedOperationException("Numele nu poate fi suprascris!");
    }

    public void setAge(int age) {
        throw new UnsupportedOperationException("Varsta nu poate fi suprascrisa!");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        try {
            Person person = new Person("a", 40);
            Person person1 = new Person("b", 4);
            System.out.println(person);
            //person.setName("Alex");
            //person1.setAge(55);
            System.out.println(person1.getAge());
            person1.setName("Diana");

        } catch (CtrlNCheckedException cnce) {
            System.out.println("Persoana nu a fost creata cum trebuie! " + cnce.getMessage()); //getMessage returneaza mesajul din constructor pt exceptia tratata
        } catch (UnsupportedOperationException uoe){
            System.out.println("Persoanele nu pot fi modificate! " + uoe.getMessage());
        }
    }
}