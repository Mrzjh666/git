package hotel.com.jd.domain;

public class Hotel{
    private int hotel_id;
    private String hotel_loc;
    private double hotel_totalincome;
    private double hotel_roomincome;
    private double hotel_mealincome;

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_loc() {
        return hotel_loc;
    }

    public void setHotel_loc(String hotel_loc) {
        this.hotel_loc = hotel_loc;
    }

    public double getHotel_totalincome() {
        return hotel_totalincome;
    }

    public void setHotel_totalincome(double hotel_totalincome) {
        this.hotel_totalincome = hotel_totalincome;
    }

    public double getHotel_roomincome() {
        return hotel_roomincome;
    }

    public void setHotel_roomincome(double hotel_roomincome) {
        this.hotel_roomincome = hotel_roomincome;
    }

    public double getHotel_mealincome() {
        return hotel_mealincome;
    }

    public void setHotel_mealincome(double hotel_mealincome) {
        this.hotel_mealincome = hotel_mealincome;
    }

    @Override
    public java.lang.String toString() {
        return "Hotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_loc='" + hotel_loc + '\'' +
                ", hotel_totalincome=" + hotel_totalincome +
                ", hotel_roomincome=" + hotel_roomincome +
                ", hotel_mealincome=" + hotel_mealincome +
                '}';
    }
}