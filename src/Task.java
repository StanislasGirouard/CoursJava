import java.util.Objects;

public class Task {

    static {
        System.out.println("blabla static");
    }
    {this.id = (int)(Math.random()*100);}

    protected final Integer id;
    protected String title;
    protected String description;
    protected Boolean done = false;
    protected Integer userId;

    public Integer getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public Boolean isDone(){
        return done;
    }
    public Integer getUserId() {
        return userId;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDone(boolean b) {
        this.done = true;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
