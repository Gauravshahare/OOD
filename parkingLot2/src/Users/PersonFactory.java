package Users;

public class PersonFactory {
    public static Person createPerson(String name,String lastName,String middleName,String email, String phoneNumber){
        return new Customer(name,lastName,middleName,email,phoneNumber);
    }
}
