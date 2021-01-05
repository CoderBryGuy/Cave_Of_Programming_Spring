package programming.bryan;

public class AddressImpl implements Address {
    private String street;
    private String postCode;

    public AddressImpl(String street, String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
