package PersonalHomeWork;

public class AccountHolder {

    private String accountHolder;
    private Long phoneNumber;
    private Byte age;
    private Integer personalIDHolder;
    private String personalAddressOfHolder;
    private String emailOfHolder;

    public AccountHolder(String name, Long phoneNumber, Byte age, Integer personalID, String personalAddress, String emailOfHolder) {
        this.accountHolder = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.personalIDHolder = personalID;
        this.personalAddressOfHolder = personalAddress;
        this.emailOfHolder = emailOfHolder;

    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Byte getAge() {
        return age;
    }

    public Integer getPersonalIDHolder() {
        return personalIDHolder;
    }

    public String getPersonalAddressOfHolder() {
        return personalAddressOfHolder;
    }

    public String getEmailOfHolder() {
        return emailOfHolder;
    }

    public void personalAddress() {
        System.out.println("You full address is " + this.personalAddressOfHolder + ".");
    }
}

