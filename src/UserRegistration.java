import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    // Method to validate input based on regex
    public boolean validateFirstName(String firstName){
        String firstNameRegex= "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(firstNameRegex,firstName);
    }
    // Method to validate Last name
    public boolean validateLastName(String lastName){
        String lastNameRegex= "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(lastNameRegex,lastName);

    }
    //Method to validate email
    public boolean validateEmail(String email){
        String emailRegex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";
        return Pattern.matches(emailRegex,email);
    }




}
