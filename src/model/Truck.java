package model;

import visitor.VehicleVisitor;

public class Truck implements Vehicle {
    @Override
    public void accept(VehicleVisitor visitor){
        visitor.visit(this);
    }
}
