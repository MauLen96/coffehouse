package coffeehouse.entities;

public class Users {
    int id ;
    String name ;
    String password;

    public Users(){}
    public Users(int id , String name ){
        setId(id);
        setName(name);
    }
    public Users(int id , String name , String pass){
        setId(id);
        setName(name);
        this.password = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
