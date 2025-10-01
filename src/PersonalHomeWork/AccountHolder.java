package PersonalHomeWork;

public class AccountHolder {

    private long personalIDHolder;
    private String name;
    private long phoneNumber;
    private byte age;

    public AccountHolder(long personalIDHolder, String name, long phoneNumber, byte age) {

        this.personalIDHolder = personalIDHolder;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public byte getAge() {
        return age;
    }

    public long getPersonalIDHolder() {
        return personalIDHolder;
    }


    public void accountHolderInformation () {
        System.out.println( "Accountholder personal ID is " + getPersonalIDHolder() + ".");
        System.out.println("Accountholder name is " + getName() + ".");
        System.out.println("Accountholder Phone number is " + getPhoneNumber() + ".");
        System.out.println("Accountholder Age is " + getAge() + ".");
    }

}

