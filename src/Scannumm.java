import java.util.Scanner;

public class Scannumm {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        int number = scan.nextInt();
        int result = 0;
        for (int num=1; num<=number; num++){
            result = result + num;
            System.out.println(result);
        }
    }
}
