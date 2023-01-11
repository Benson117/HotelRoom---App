package hotelroom;

public class HotelRoom {
  final double MIN_RATE = 116.83;
    final double SPECIAL_RATE = 1436.14;
    final int ROOM_CRITERIA = 299;

    private int room;
    private double rentalRate;


    HotelRoom ( int intRoom) {
        room = intRoom;
      int roomNumber = 0;
        if (roomNumber <= ROOM_CRITERIA)
          rentalRate = MIN_RATE;
        else
          rentalRate = SPECIAL_RATE;
    } 
    public int getRoom(){ return room; }
    public double getRentalRate(){ return rentalRate; }
    public void setRoom(int intRoom){ room =  intRoom; }
    public void setRentalRate(double intRentalRate){ rentalRate = intRentalRate; }
} 


class Suite extends HotelRoom { 
    final double SURCHARGE = 638;
    Suite (int roomNumber){ 
        super(roomNumber);
        setRentalRate(getRentalRate() + SURCHARGE);
    } 
} 


