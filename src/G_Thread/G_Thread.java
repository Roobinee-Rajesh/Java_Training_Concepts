package G_Thread;

public class G_Thread extends Thread{


    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.run();
    }
}

class A extends Thread{
    public void run(){
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(i);
//        }
        System.out.println(3);
    }

}

class B extends Thread{
    public void run(){
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(i);
//        }
        System.out.println(1);
    }

}

class C extends Thread{
    public void run(){
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(i);
//        }
        System.out.println(2);
    }

}

