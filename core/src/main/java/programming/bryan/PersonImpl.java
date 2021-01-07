package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonImpl implements Person {

    private static final Logger log = LoggerFactory.getLogger(PersonImpl.class);

    private int id;
    private String name;
    private int taxId;
    private Address address;

    public PersonImpl() {
    }

    public PersonImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Person getInstance(int id, String name){
        log.info("inside PersonImpl.getInstance()");
        return new PersonImpl(id,name);
    }

    public void speak(){
        System.out.println("I'm a person");
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public void onCreate() {
        log.info("person created: " + this);
    }

    @Override
    public void onDestroy() {
        log.info("person destroyed: " + this);
    }

    @Override
    public String toString() {
        return "PersonImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
