package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressImpl implements Address {

    private static final Logger log = LoggerFactory.getLogger(App.class);
    private String street;
    private String postCode;

    public AddressImpl() {
    }

    public AddressImpl(String street, String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    @Override
    public void init() {
        log.info("in address.init()");
    }

    @Override
    public void destroy() {
        log.info("in address.destroy()");
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
