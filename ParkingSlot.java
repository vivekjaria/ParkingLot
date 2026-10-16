public class ParkingSlot {
    Vehicle vehicle;
    Ticket ticket;

    public Boolean isAvailable() {
        return null;
    }

    public void allocateSlotForVehicle(Vehicle vehicle, Ticket ticket) {
       this.vehicle = vehicle;
       this.ticket = ticket;
       this.ticket.setEntryTime(java.time.LocalDateTime.now());
    }

    public void releaseSlot() {
       
    }
}
