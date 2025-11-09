public interface VehicleVisitor {
    void visit(Car car);
    void visit(Motorcycle motorcycle);
    void visit(Truck truck);
}
