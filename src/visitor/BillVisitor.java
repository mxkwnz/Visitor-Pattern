package visitor;

import model.Car;
import model.Motorcycle;
import model.Truck;

public class BillVisitor implements VehicleVisitor {
    @Override
    public void visit(Car car){
        System.out.println("Total cost for car: 250$");
    }

    @Override
    public void visit(Motorcycle motorcycle){
        System.out.println("Total cost for motorcycle: 70$");
    }

    @Override
    public void visit(Truck truck){
        System.out.println("Total cost for truck: 300$");
    }
}
