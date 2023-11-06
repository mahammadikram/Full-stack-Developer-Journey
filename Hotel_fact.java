package HotelDao;

public class Hotel_fact {
    public Hotel_Interface createInstance(){
        return new Hotel_Kitchen();
    }
}
