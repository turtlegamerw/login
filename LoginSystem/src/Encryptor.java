import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Encryptor {
    public String encryptString(String input) throws NoSuchAlgorithmException {

        //does some stupid math
        MessageDigest md = MessageDigest.getInstance("md5");

        byte[] messageDigest = md.digest(input.getBytes());

        BigInteger bigInt = new BigInteger(1, messageDigest);
        return bigInt.toString(16);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Encryptor encryptor = new Encryptor();
        
        //String password = "turtle";
        //System.out.println(encryptor.encryptString(password));
        String hashedpass = "d4705b9f42c96eeb0b9fb53266013516";

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter your password:");

        String userinput = scanner.nextLine();

        if (encryptor.encryptString(userinput).equals(hashedpass)) {
            System.out.println("correct password your in!");
        }
        else {
            System.out.println("L you got it wrong bozo fr kill yourself");
        }
    }

}