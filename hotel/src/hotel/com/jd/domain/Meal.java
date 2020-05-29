package hotel.com.jd.domain;

public class Meal{
    private int meal_id;
    private String meal_type;
    private String meal_name;
    private String meal_explain;
    private int emp_id;
    private String meal_picpath;
    private int hotel_id;

    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public String getMeal_explain() {
        return meal_explain;
    }

    public void setMeal_explain(String meal_explain) {
        this.meal_explain = meal_explain;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getMeal_picpath() {
        return meal_picpath;
    }

    public void setMeal_picpath(String meal_picpath) {
        this.meal_picpath = meal_picpath;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public java.lang.String toString() {
        return "Meal{" +
                "meal_id=" + meal_id +
                ", meal_type='" + meal_type + '\'' +
                ", meal_name='" + meal_name + '\'' +
                ", meal_explain='" + meal_explain + '\'' +
                ", emp_id=" + emp_id +
                ", meal_picpath='" + meal_picpath + '\'' +
                ", hotel_id=" + hotel_id +
                '}';
    }
}