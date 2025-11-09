public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();

        VehicleVisitor repair = new RepairVisitor();
        VehicleVisitor bill = new BillVisitor();
        VehicleVisitor test = new TestVisitor();

        System.out.println("---Repairing---");
        car.accept(repair);
        truck.accept(repair);
        motorcycle.accept(repair);

        System.out.println("---Cost---");
        car.accept(bill);
        truck.accept(bill);
        motorcycle.accept(bill);

        System.out.println("---Testing---");
        car.accept(test);
        truck.accept(test);
        motorcycle.accept(test);
    }
}