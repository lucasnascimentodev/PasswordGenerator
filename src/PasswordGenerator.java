import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        Random generated = new Random();

        int i = 0;
        while (i < 6) {
           int number = generated.nextInt(60);
           System.out.println(number);
           i++;
        }
    }

}
