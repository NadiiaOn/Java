package PersonalHomeWork;

public class AccountHolder {

    private Integer personalIDHolder;
    private String accountHolderName;
    private Long accountHolderPhoneNumber;
    private Byte accountHolderAge;

    public AccountHolder(Integer personalID, String accountHolderName, Long accountHolderPhoneNumber, Byte accountHolderAge) {

        this.personalIDHolder = personalID;
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


    public static void accountHolderInformation (AccountHolder accountHolder) {
        System.out.println(accountHolder.getPersonalIDHolder());
        System.out.println(accountHolder.getAccountHolderName());
        System.out.println(accountHolder.getAccountHolderPhoneNumber());
        System.out.println(accountHolder.getAccountHolderAge());
    }

}

