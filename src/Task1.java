import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
 * падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Введено число %f", getNumber("Введите число типа float, например 6.09:"));
    }

public static float getNumber(String message) {

    float number = 0;
    while (true) {
        System.out.printf(message);
        try {
            number = Float.parseFloat(scanner.nextLine());
            break;
        } catch (NumberFormatException e){
            System.out.println("Введено не число. Попробуйте еще раз.");
        }
    }
    return number;
}


}
