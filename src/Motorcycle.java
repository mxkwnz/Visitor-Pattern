public class Motorcycle implements Vehicle {
    @Override
    public void accept(VehicleVisitor visitor){
        visitor.visit(this);
    }
}
