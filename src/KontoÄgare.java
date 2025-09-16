public class KontoÄgare {

    public String kontoÄgare;
    public Long phoneNumber;
    public Byte age;
    public Integer personalIDÄgare;
    public String personalAddressOfÄgare;
    public String emailOfÄgare;

    public KontoÄgare(String name, Long phoneNumber, Byte age, Integer personalID, String personalAddress, String emailOfÄgare) {
        this.kontoÄgare = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.personalIDÄgare = personalID;
        this.personalAddressOfÄgare = personalAddress;
        this.emailOfÄgare = emailOfÄgare;

    }

    public void personalAddress(String personalAddress) {
        System.out.println("You full address is " + this.personalAddressOfÄgare + ".");


    }
}

