import java.util.Scanner;
import java.util.regex.Pattern;

public class UserPatternMatching {

    static Scanner input = new Scanner(System.in);
    public void FirstName() {
        System.out.print("Enter first Name: ");
        String FirsName = input.nextLine();
        boolean firstname = Pattern.compile("^[A-Z][a-z]{3,20}").matcher(FirsName).matches();
        if (firstname) {
            System.out.println(FirsName + " is Valid ");
        } else {
            System.out.println(FirsName + " is Invalid ");
        }
    }

    public void Lastname() {
        System.out.print("Enter Last Name: ");
        String Lastname = input.nextLine();
        boolean lastname = Pattern.compile("^[A-Z][a-z]{3,20}").matcher(Lastname).matches();
        if (lastname) {
            System.out.println(Lastname + " is Valid ");
        } else {
            System.out.println(Lastname + " is Invalid ");
        }
    }
    public void Email() {
        System.out.print(" Enter Email: ");
        String email = input.nextLine();
        boolean Email = Pattern.compile("(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)").matcher(email).matches();
        if (Email) {
            System.out.println(email + " is Valid ");
        } else {
            System.out.println(email + " is invalid ");
        }
    }

    public static void main(String[] args) {
        UserPatternMatching user = new UserPatternMatching();
        user.FirstName();
        user.Lastname();
        user.Email();
    }
}

