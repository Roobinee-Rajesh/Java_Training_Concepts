package D_Override;

public class D_Override {
    public static void main(String[] args){
        Car car=new Car();
        Vehicle vehicle=new Vehicle();
        Bike bike=new Bike();
        //UpCasting - creating object for child
        Vehicle upCast=new Car();//can't assess specialised method
        Car downCast=(Car) new Vehicle();
        //DownCasting - creating object for parent
//        Car downCast=(Car) upCast;


        car.getColour();
        vehicle.getColour();
        car.wheels();
        bike.getColour();
        upCast.getColour();
        downCast.getColour();


    }
}
