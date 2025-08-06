import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage(){
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehiclesByBrand(String brand) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.brand.equalsIgnoreCase(brand)) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public double getTotalValue() {
        double total = 0;
        for(Vehicle vehicle : vehicles) {
            total += vehicle.calculateValue();
        }
        return total;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder("Garage Inventory:\n");
        for (Vehicle vehicle : vehicles) {
            sb.append(vehicle.getInfo()).append("\n");
        }
        return sb.toString().trim();
    }
}
