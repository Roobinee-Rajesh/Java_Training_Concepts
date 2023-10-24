package I_Exception;

public class I_Exception {
    public static void main(String[] args) {
//Try catch and instanceof
        try {
            int i = 12 / 0;
            System.out.println("Pass");
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("ArithmeticException");
            } else {
                System.out.println(e);
            }
        }

        //
        try {
            new Error().add();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}

class Error {
    void add() throws Exception{
        throw new Exception("Error");
    }

}
