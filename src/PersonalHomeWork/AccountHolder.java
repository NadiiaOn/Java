package PersonalHomeWork;

public class AccountHolder {

    private Integer personalIDHolder;
    private String accountHolderName;
    private Long phoneNumber;
    private Byte accountHolderAge;
    private String personalAddressOfHolder;
    private String emailOfHolder;

    public AccountHolder(String name, Long phoneNumber, Byte accountHolderAge, Integer personalID, String personalAddress, String emailOfHolder) {

        this.personalIDHolder = personalID;
        this.accountHolderName = name;
        this.phoneNumber = phoneNumber;
        this.accountHolderAge = accountHolderAge;
        this.personalAddressOfHolder = personalAddress;
        this.emailOfHolder = emailOfHolder;

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Byte getAccountHolderAge() {
        return accountHolderAge;
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


    @Override
    public String toString() {
        return "AccountHolder{" +
                "personalIDHolder=" + personalIDHolder +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", accountHolderAge=" + accountHolderAge +
                ", personalAddressOfHolder='" + personalAddressOfHolder + '\'' +
                ", emailOfHolder='" + emailOfHolder + '\'' +
                '}';
    }
}

