/**
 * Created by keatonfoster on 2/2/16.
 */
public class Car {
    public int year;
    public double mileage;
    public String make;
    public String [] colorsAvailable;

    public Car (int year, double mileage, String make, String[] colorsAvailable){
        this.year = year;
        this.mileage = mileage;
        this.make = make;
        this.colorsAvailable = colorsAvailable;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2017) {
            this.year = year;
        }
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String[] getColorsAvailable() {
        return colorsAvailable;
    }

    public void setColorsAvailable(String[] colorsAvailable) {
        this.colorsAvailable = colorsAvailable;
    }
}
