//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
UserRegistration userRegistration= new UserRegistration();

        System.out.println("First Name Validation: "+ userRegistration.validateFirstName("Amritanshu"));
        System.out.println("Last Name Validation: "+userRegistration.validateLastName("kumar"));
    }
}