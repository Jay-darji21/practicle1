// Write a program which has static block and constructor overloading, initialise variables using constructor and print it

class demo{
     String name;
     int num;
    public char[] getNum;

     demo(){
        System.out.println("No args in constructor");
     }
     demo(String name){
        this.name = name;
     }
     demo(int num){
        this.num = num;
     }
     public void setName(String name){
        this.name = name;
     }
     public void setNum(int num){
        this.num = num;
     }
     public String getName(){
        return name;
     }
     public int getNum(){
        return num;
     }

     static{
        System.out.println("Static block");
     }
    
}


public class que5 {
    public static void main(String[]args){

        demo d1 = new demo(12);
        demo d2 = new demo("Jay");

        System.out.println(d1.getNum() + " "+ d2.getName());

    }    
}
