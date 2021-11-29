package Users;

public class Customer extends Person {
    public Customer(String name, String lastName, String middleName, String email, String phoneNumber){
        super(name,lastName,middleName,email,phoneNumber);
    }

    @Override
    public String toString() {
        return this.getName()+this.getMiddleName()+this.getLastName();
    }
}
