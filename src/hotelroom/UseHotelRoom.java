package hotelroom;

public class UseHotelRoom {

   public static void main(String[] args){ 
      Suite aSuiteRoom = new Suite(300);
      System.out.println("Suite Room Charge ");
      System.out.println("Room Number : R" + aSuiteRoom.getRoom());
      System.out.println("Charge      : R" + aSuiteRoom.getRentalRate());


      Suite anotherSuiteRoom = new Suite(100);
      System.out.println("Suite Room Charge ");
      System.out.println("Room Number : " + anotherSuiteRoom.getRoom());
      System.out.println("Charge      : R" + anotherSuiteRoom.getRentalRate());


      HotelRoom aRoom = new HotelRoom(300);
      System.out.println("Suite Room Charge ");
      System.out.println("Room Number : " + aRoom.getRoom());
      System.out.println("Charge      : R" + aRoom.getRentalRate());


      HotelRoom anotherRoom = new HotelRoom(100);
      System.out.println("Hote Room Charge ");
      System.out.println("Room Number : " + anotherRoom.getRoom());
      System.out.println("Charge      : R" + anotherRoom.getRentalRate());
    } 
} 
