package C_Method;

public class MainMethod {
    public static void main(String[] args){
        C_Method cMethod=new C_Method();
        cMethod.method();
        cMethod.method("Over Loading");
        int sum=C_Method.add();
        System.out.println("The Sum is "+sum);
        System.out.println(cMethod);
    }
}
