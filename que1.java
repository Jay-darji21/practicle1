// Create a that keeps the track of the number of instance created . Implement a static variable and method the acomplish this.

class demo{
    private int num = 0;

    public int getNum(){
        num++;
        return num;
    }
}

public class que1{
    public static void main(String []args){
        demo obj1 = new demo();
        int a = obj1.getNum();
        System.out.println(a);

    }
}