import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {

        System.out.println("Список дел");
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Меню\n 1. Добавить задачу\n 2. Удалить задачу\n 3. Изменить задачу\n 4. Показать задачи\n 5. Выход");
            System.out.println("Сделай выбор");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Добавление задачи");
            } else if (choice == 2) {
                System.out.println("Удаление задачи");
            } else if (choice == 3) {
                System.out.println("Изменение задачи");
            } else if (choice == 4) {
                System.out.println("Задачи");
            } else if (choice == 5) {
                System.out.println("Выход");
                run = false;
            }
        }
    }
}