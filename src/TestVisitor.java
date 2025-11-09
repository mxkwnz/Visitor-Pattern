public class TestVisitor implements VehicleVisitor{
    @Override
    public void visit(Car car){
        System.out.println("Your car is ready!");
    }
    @Override
    public void visit(Motorcycle motorcycle){
        System.out.println("The motorcycle is in great condition!");
    }
    @Override
    public void visit(Truck truck){
        System.out.println("The new brakes installed!");
    }
}
