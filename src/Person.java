public class Person {

    public String name;
    public Short phoneNumber;
    public Short age;
    public Integer personalID;
    public String personalAddress;

    public Person(String name, Short phoneNumber, Short age, Integer personalID, String personalAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.personalID = personalID;
        this.personalAddress = personalAddress;

        personalAddress = "36876, Stockhoml, Villaväg, 32";
    }

    public void hälsaPerson(String name) {
        System.out.println("My name is " + this.name + ".");
    }

    public void personalAddress(String personalAddress) {
        System.out.println("My address is " + this.personalAddress + ".");
    }
}

