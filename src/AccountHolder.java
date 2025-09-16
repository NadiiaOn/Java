public class AccountHolder {

    public String accountHolder;
    public Long phoneNumber;
    public Byte age;
    public Integer personalIDHolder;
    public String personalAddressOfHolder;
    public String emailOfHolder;

    public AccountHolder(String name, Long phoneNumber, Byte age, Integer personalID, String personalAddress, String emailOfHolder) {
        this.accountHolder = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.personalIDHolder = personalID;
        this.personalAddressOfHolder = personalAddress;
        this.emailOfHolder = emailOfHolder;

    }

    public void personalAddress(String personalAddress) {
        System.out.println("You full address is " + this.personalAddressOfHolder + ".");


    }
}

