import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    // Method to validate input based on regex
    public boolean validateFirstName(String firstName){
        String firstNameRegex= "^[A-Z][a-zA-Z]{2,}$";
        return Pattern.matches(firstNameRegex,firstName);
    }




}
