public class Car implements Vehicle {
    private String regNumber;
    private String vehicleType = "Car";
    private String color;
    private String carModel;
    private String carType;

    public Car(String regNumber, String color, String carModel, String carType) {
        this.regNumber = regNumber;
        this.color = color;
        this.carModel = carModel;
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
