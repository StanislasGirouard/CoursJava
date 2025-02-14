import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBaseAccess dba = DataBaseAccess.getInstance();
        User user1 = new User("Stanislas");
        System.out.println(user1.getId() + " " + user1.getFirstname());

        Task task1 = new Task();
        task1.setTitle("tache 1");
        task1.setDescription("premier tache");
        task1.setDone(true);
        task1.setUserId(user1.id);
        dba.addTask(task1);
//        System.out.println(task1);

        List<Task> tasks = dba.getTasks();
        for (Task t : tasks){
            System.out.println(t);
        }

        var scanner = new Scanner(System.in);
        System.out.println("What ID to get?");
        long id = scanner.nextLong();
        try {
            Task found = dba.getTaskById(id);
            System.out.println(found);
        } catch (ElementNotFoundExeption e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}
