// Write a program to create a parameterised constructor and initialised the variable using constructor

class demo{
    private String name ;
    private int age;

       demo(String name,int age){
        this.name = name;
        this.age= age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class que2 {
    public static void main(String[]args){
        demo obj = new demo("Jay",19);
        System.out.println(obj.getName() + " "+obj.getAge());

    }
}
