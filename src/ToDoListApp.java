import java.util.Scanner;
import java.util.ArrayList;
import java.util.SortedMap;

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
                System.out.println("Удаление задачи");
            } else if (choice == 3) {
                System.out.println("Изменение задачи");
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