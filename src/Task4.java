import java.util.Scanner;

public class Task4 {
    /*
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.printf("Введено сообщение %s", getInputMessage("Введите сообщение:"));
    }

    public static String getInputMessage(String message){

        String mess;
        while (true) {
            System.out.printf(message);
            try {
                mess = scanner.nextLine();
                checkIfEmpty(mess);
                break;

            } catch (EmptyException e) {
                System.out.println(e.getMessage());

            }
        }
        return mess;
    }


    public static void checkIfEmpty(String message) throws EmptyException {
        if (message.trim().isEmpty())
            throw new EmptyException("Введена пустая строка. Попробуйте еще раз");
    }

}

class EmptyException extends Exception {
    public EmptyException(String message) {
        super(message);
    }
}

