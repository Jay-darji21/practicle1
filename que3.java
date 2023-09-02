// Use the private keyword for variable and use setter and getter method to initialised and print the value

class student{
    private String name;
    private int num;
    student(){
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}

public class que3 {
    public static void main(String[]args){
        student st = new student();
        st.setName("Jay");
        st.setNum(22013);
        System.out.println(st.getName() + " " + st.getNum());
        
    }

}
