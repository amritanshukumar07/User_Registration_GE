//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
UserRegistration userRegistration= new UserRegistration();

        System.out.println("First Name Validation: "+ userRegistration.validateFirstName("Amritanshu"));
        System.out.println("Last Name Validation: "+userRegistration.validateLastName("kumar"));
        System.out.println("Email Validation: "+ userRegistration.validateEmail("amritanshu4532@gmail.com"));
        System.out.println("Mobile Number Validation: "+userRegistration.validateNumber("789624568956"));
        System.out.println("Password validation: "+ userRegistration.validatePassword("iefnienf23_+@%$;045"));
        // UC3: Regex for validating email
        String emailRegex = "^[a-zA-Z0-9+-]+([._][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

        // Email samples to validate
        String[] emailSamples = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
                // Invalid samples
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("Validating email samples:");
        for (String email : emailSamples) {
            if (UserRegistration.validateInput(email, emailRegex)) {
                System.out.println(email + " => Valid");
            } else {
                System.out.println(email + " => Invalid");
            }
        }
    }
}