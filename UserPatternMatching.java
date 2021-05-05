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

    public static void main(String[] args) {
        UserPatternMatching user = new UserPatternMatching();
        user.FirstName();
    }
}

