import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateInput(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
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
    //Method to validate mobile number
    public boolean validateNumber(String mobileNumber){
        String mobileNumberRegex="^[0-9]{2}[5-9][0-9]{9}$";
        return Pattern.matches(mobileNumberRegex,mobileNumber);
    }

    // Method to validate password
    public boolean validatePassword(String passWord){
        String passwordRegex= "^(?=.*[!@#$%^&*]).{8,}$";
        return Pattern.matches(passwordRegex,passWord);
    }




}
