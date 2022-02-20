package coffeehouse.entities;

import coffeehouse.MyApp;

public class Employee extends Users{
    public Employee(){
        super();
    }
    public Employee(int id , String name , String pass){
        super(id, name , pass);
    }


    public String Password(int password){
        MyApp menu = new MyApp();
        if(password == 1234){
            System.out.println(" ok , you'r in system");
            menu.Start();
            return "......";
        }
        else {
            System.out.println(" not , you't not emp");
            return "......";
        }
    }

}
