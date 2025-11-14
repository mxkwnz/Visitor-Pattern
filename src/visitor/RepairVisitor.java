package visitor;

import model.Car;
import model.Motorcycle;
import model.Truck;

public class RepairVisitor implements VehicleVisitor{
    @Override
    public void visit(Car car){
        System.out.println("Applying vinyl wrap to a car.");
    }
    @Override
    public void visit(Motorcycle motorcycle){
        System.out.println("Checking the engine and lights.");
    }
    @Override
    public void visit(Truck truck){
        System.out.println("The brakes are being repaired.");
    }
}
