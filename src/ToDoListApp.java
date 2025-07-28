import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {

        System.out.println("Список дел");
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Меню\n 1. Добавить задачу\n 2. Удалить задачу\n 3. Изменить задачу\n 4. Показать задачи\n 5. Выход");
        }
    }
}