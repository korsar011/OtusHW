import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Тест по географии");
        boolean [] q = new boolean [4];

     Scanner scan = new Scanner(System.in);
        System.out.println("Вопрос 1. Назовите столицу Франции");
        System.out.println("1. Берлин");
        System.out.println("2. Лондон");
        System.out.println("3. Париж");
        System.out.println("4. Лиссабон");
        System.out.println("Пожалуйста, укажите номер верного ответа: ");
        int operator = scan.nextInt();
        if (operator == 3) {
            q [0]= true;
        } else {
            q [0]= false;
        }
        System.out.println();


        System.out.println("Вопрос 2. Назовите столицу Мадагаскара");
        System.out.println("1. Антананариву");
        System.out.println("2. Кейптаун");
        System.out.println("3. Каир");
        System.out.println("4. Аккра");
        System.out.println("Пожалуйста, укажите номер верного ответа: ");
        operator = scan.nextInt();
        if (operator == 1) {
            q [1]= true;
        } else {
            q [1]= false;
        }

        System.out.println();

        System.out.println("Вопрос 3. Назовите столицу Непала");
        System.out.println("1. Дели");
        System.out.println("2. Бангкок");
        System.out.println("3. Катманду");
        System.out.println("4. Покхара");
        System.out.println("Пожалуйста, укажите номер верного ответа: ");
        operator = scan.nextInt();
        if (operator == 3) {
            q [2]= true;
        } else {
            q [2]= false;
        }

        System.out.println();


        System.out.println("Вопрос 4. Назовите столицу Казахстана");
        System.out.println("1. Алма-Ата");
        System.out.println("2. Усть-Каменогорск");
        System.out.println("3. Бишкек");
        System.out.println("4. Астана");
        System.out.println("Пожалуйста, укажите номер верного ответа: ");
        operator = scan.nextInt();
        if (operator == 4) {
            q [3]= true;
        } else {
            q [3]= false;
        }
        System.out.println("Ваши результаты: ");
        System.out.println("1: "+ q[0]);
        System.out.println("2: "+ q[1]);
        System.out.println("3: "+ q[2]);
        System.out.println("4: "+ q[3]);

    }
}