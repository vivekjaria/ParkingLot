import java.time.LocalDateTime;


public class Ticket {
    Vehicle vehicle;
    LocalDateTime entryTime;
    LocalDateTime exitTime;
    ParkingSlot slot;

    public Ticket(Vehicle vehicle, LocalDateTime entryTime) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

}
