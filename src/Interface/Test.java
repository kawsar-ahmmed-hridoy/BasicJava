package Interface;

public class Test implements I1{
    //compile error
//    void show(){
//        System.out.println("1");
//    }
    public void show(){
        System.out.println("1");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
    }
}