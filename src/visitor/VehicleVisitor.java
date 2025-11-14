package visitor;

import model.Car;
import model.Motorcycle;
import model.Truck;

public interface VehicleVisitor {
    void visit(Car car);
    void visit(Motorcycle motorcycle);
    void visit(Truck truck);
}
