import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижний предел");
        int minimum = scanner.nextInt(); //считываем нижний предел
        System.out.println("Введите вехний предел");
        int maximum = scanner.nextInt(); // считываем верхних предел
        int ZagadannoeChislo = rand.nextInt(minimum, maximum) + 1;
        System.out.println("Введите количество ходов для угадывания");
        int KolIter = scanner.nextInt(); // вводим количество итераций
        for (int i = 0; i<KolIter; i++) {
        System.out.println("Введите число");
        int chislo = scanner.nextInt();
        if (chislo==ZagadannoeChislo) {
            System.out.println("Поздавляю, Вы угадали!");

            break;
            } else if (chislo<ZagadannoeChislo) {
            System.out.println("Ваше число меньше загаданного");
            }
            else {System.out.println("Введенное число болше загаданного");}
        }

    }
}

