import java.util.Objects;

public class User {
    {this.id = (int)(Math.random()*100);}

    protected int id;
    private String firstname;

    public User (){}
    public User(String firstname) {
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }
   public String getFirstname() {
        return firstname;
   }
   public void setId(Integer id) {
        this.id = id;
   }
   public void setFirstname(String firstname) {
        this.firstname = firstname;
   }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                '}';
    }

}


