package PersonalHomeWork;

public class AccountHolder {

    private Integer personalIDHolder;
    private String accountHolderName;
    private Long accountHolderPhoneNumber;
    private Byte accountHolderAge;

    public AccountHolder(Integer personalIDHolder, String accountHolderName, Long accountHolderPhoneNumber, Byte accountHolderAge) {

        this.personalIDHolder = personalIDHolder;
        this.accountHolderName = accountHolderName;
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
        this.accountHolderAge = accountHolderAge;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public Long getAccountHolderPhoneNumber() {
        return accountHolderPhoneNumber;
    }

    public Byte getAccountHolderAge() {
        return accountHolderAge;
    }

    public Integer getPersonalIDHolder() {
        return personalIDHolder;
    }


    public void accountHolderInformation () {
        System.out.println( "Accountholder personal ID is " + getPersonalIDHolder() + ".");
        System.out.println("Accountholder name is " + getAccountHolderName() + ".");
        System.out.println("Accountholder Phone number is " + getAccountHolderPhoneNumber() + ".");
        System.out.println("Accountholder Age is " + getAccountHolderAge() + ".");
    }

}

