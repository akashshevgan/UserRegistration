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
            System.out.println(email + " is Invalid ");
        }
    }

    public void MobileNumber() {
        System.out.print(" Enter Mobile Number With Country code: ");
        String Phone = input.nextLine();
        boolean phone = Pattern.compile("^[0-9]{2}\\s[0-9]{10}").matcher(Phone).matches();
        if (phone) {
            System.out.println(Phone + " is Valid ");
        } else {
            System.out.println(Phone + " is Invalid ");
        }
    }

    public static void ValPassword () {
        System.out.print ("Enter Your Password : ");
        String Password = input.nextLine();
        boolean password = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,32}.*$").matcher(Password).matches();
        if (password) {
            System.out.println (Password + " is Valid ");
        } else {
            System.out.println (Password + " is Invalid ");
        }
    }

    public static void main(String[] args) {
        UserPatternMatching user = new UserPatternMatching();
        user.FirstName();
        user.Lastname();
        user.Email();
        user.MobileNumber();
        user.ValPassword();
    }
}

