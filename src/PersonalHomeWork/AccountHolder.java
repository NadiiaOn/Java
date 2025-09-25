package PersonalHomeWork;

public class AccountHolder {

    private Integer personalIDHolder;
    private String accountHolderName;
    private Long phoneNumber;
    private Byte accountHolderAge;

    public AccountHolder(String name, Long phoneNumber, Byte accountHolderAge, Integer personalID) {

        this.personalIDHolder = personalID;
        this.accountHolderName = name;
        this.phoneNumber = phoneNumber;
        this.accountHolderAge = accountHolderAge;
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

}

