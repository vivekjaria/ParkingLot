public class Bike implements Vehicle {
    private String regNumber;
    private String vehicleType = "Bike";

    public Bike(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String regNumber() {
        return regNumber;
    }

    @Override
    public String vehicleType() {
        return vehicleType;
    }
}
