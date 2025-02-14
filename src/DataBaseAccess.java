import java.util.ArrayList;
import java.util.List;

public class DataBaseAccess {
    private static DataBaseAccess instance;

    public static DataBaseAccess getInstance(){
        if(instance == null){
            instance = new DataBaseAccess();
        }
        return instance;
    }

    private List<User> users = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    private DataBaseAccess(){}

    public List<User>getUsers() {
        return users;
    }
    public List<Task> getTasks() {
        return tasks;
    }

    public void addUser(User user){
        users.add(user);
    }
    public void addTask(Task task){
        tasks.add(task);
    }

    public Task getTaskById(long id) throws ElementNotFoundExeption {
        for (Task task : tasks){
            if(task.getId() == id){
                return task;
            }
        }
        throw new ElementNotFoundExeption("ID introuvable");
    }

    public User getUserById(long id) throws ElementNotFoundExeption {
        for (User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        throw new ElementNotFoundExeption("USER introuvable");
    }

}
