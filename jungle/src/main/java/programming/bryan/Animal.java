package programming.bryan;

public interface Animal extends LifeCycleMethods {

    void init();
    void destroy();
    String getName();
    void setName(String name);
    String getType();
    void setType(String type);

}
