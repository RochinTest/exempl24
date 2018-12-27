//Для введённого пользователем с клавиатуры натурального числа посчитайте
// сумму всех его цифр (заранее не известно, сколько цифр будет в числе).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Введите любое число");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            for (; m != 0; m /= 10) {
                sum += (m % 10);
            }
            System.out.println(sum + " ");
        }
    }
}
