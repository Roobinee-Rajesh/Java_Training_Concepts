package B_Class;

public class B_Class {
    void run(){
        System.out.println("RUnning");
    }

    public static void main(String[] args){
        B_Class b_Class=new B_Class();
        b_Class.run();

        Dancing dancing=new Dancing();
        dancing.dancing();
    }
}
