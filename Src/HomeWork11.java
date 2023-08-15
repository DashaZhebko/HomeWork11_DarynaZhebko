
import java.util.Random;

public class HomeWork11 {
    public static int MIN_BOUND = 11;
    public static int MAX_BOUND = 100000;
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(MAX_BOUND - MIN_BOUND + 1) + MIN_BOUND;
        System.out.println("Число: " + num);
        int sum = 0;
        while (num>0){
            int res = num%10;
            sum+=res;
            num = num/10;
        }

        System.out.println("Сума цифр: " + sum);
    }
}
