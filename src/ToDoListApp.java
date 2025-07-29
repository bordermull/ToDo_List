import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListApp {
    public static void main(String[] args) {

        ArrayList<NewTask> tasks = new ArrayList<>();
        System.out.println("Список дел");
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Меню\n 1. Добавить задачу\n 2. Удалить задачу\n 3. Изменить задачу\n 4. Показать задачи\n 5. Выход\n");
            System.out.println("Сделай выбор");
            int choice = scanner.nextInt();
            if (choice == 1) {
                scanner.nextLine();
                System.out.print("Введите описание задачи: ");
                String desc = scanner.nextLine();
                tasks.add(new NewTask(desc));
                System.out.println("Задача добавлена!");
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("Список задач пуст.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.println("Введите номер задачи для удаления");
                    int num = scanner.nextInt();
                    if (num >= 1 && num <= tasks.size()) {
                        tasks.remove(num - 1);
                        System.out.println("Задача удалена.");
                    } else {
                        System.out.println("Некорректный номер.");
                    }
                }
            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Список задач пуст.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }

                    System.out.print("Введите номер задачи для изменения: ");
                    int num = scanner.nextInt();
                    scanner.nextLine(); // поглощаем Enter

                    if (num >= 1 && num <= tasks.size()) {
                        System.out.print("Введите новое описание: ");
                        String newDesc = scanner.nextLine();

                        tasks.get(num - 1).description = newDesc;

                        System.out.println("Задача обновлена.");
                    } else {
                        System.out.println("Некорректный номер.");
                    }
                }
            } else if (choice == 4) {
                if (tasks.isEmpty()) {
                    System.out.println("Список задач пуст");
                } else {
                    System.out.println("Задачи:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 5) {
                System.out.println("Выход");
                run = false;
            }
        }
    }
}