## Parking Lot RELEASE 1.0 (Reserve a slot 2.0, Remove Bike and make support for scooty and geared bike)

## Requirements

- Assign a ticket to a vehicle while parking
- Assign a parking spot for the vehicle
- Release the vehicle and also release the parking spot
- Security (Check if the vehicle is registered or not)
- Payment based on timings
- Different types of vehicles can be parked and charged
- A parking lot can have multiple floors
- A parking floor can have multiple parking spot


## Vehicle
CAR
BIKE
TRUCK

regNo
Ticket


## Ticket

Vehicle
entryTime 12 pm
exitTime   2 pm
parkingSlot


## Payment

makePayment(Ticket) -- Success, Fail

## ParkingLot (Main)
List<ParkingFloor> floors;

findAvailableSpot(Vehicle);
parkVehicle(Vehicle)
releaseVehicle(Vehicle)

## ParkingFloor
floorNo
List<ParkingSlot> slots;

findAvailbleSlot(Vehicle)
parkVehicle(Vehicle)
releaseVehicle(Vehicle)

-----
-----


## ParkingSlot
Vehicle = null;
Ticket

isAvailable()
allocateSlotForVehicle(Vehicle)
releaseSlot()


## BillCalculater

calculateBill(Ticket)







