public class KontoÄgare {

    public String kontoÄgare;
    public Short phoneNumber;
    public Short age;
    public Integer personalIDÄgare;
    public String personalAddressOfÄgare;

    public KontoÄgare(String name, Short phoneNumber, Short age, Integer personalID, String personalAddress) {
        this.kontoÄgare = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.personalIDÄgare = personalID;
        this.personalAddressOfÄgare = personalAddress;

    }

    public void personalAddress(String personalAddress) {
        System.out.println("You full address is " + this.personalAddressOfÄgare + ".");
    }
}

