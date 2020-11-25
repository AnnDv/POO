package lab6;
import java.util.ArrayList;

abstract class Person {
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private FullName name;
    private Date birthDate;
    private Gender gender;
    private Address homeAddress;
    private Phone phone;
    ArrayList<Hospital>Hospitals;

    public class FullName{
        void name(){
            System.out.println(givenName + " " + middleName + " " + familyName);
        }
    }

    public class Date{}

    enum Gender{
        Male,
        Female,
        Other
    }

    public class Address{}

    public class Phone{}

}
