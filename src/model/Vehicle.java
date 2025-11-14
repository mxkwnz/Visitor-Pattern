package model;

import visitor.VehicleVisitor;

public interface Vehicle {
    void accept(VehicleVisitor visitor);
}
