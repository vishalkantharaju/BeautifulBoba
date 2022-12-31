import java.util.ArrayList;

public class Boba {

    //parameters
    private String name;
    private double medianPrice;
    private double distance;
    private double rating;
    private boolean dairyFree;
    private boolean noCaffeine;
    private boolean hot;
    private int calories;

    public Boba(String name, double medianPrice, double distance, double rating, boolean dairyFree, boolean noCaffeine, boolean hot, int calories) {
        this.name = name;
        this.medianPrice = medianPrice;
        this.distance = distance;
        this.rating = rating;
        this.dairyFree = dairyFree;
        this.noCaffeine = noCaffeine;
        this.hot = hot;
        this.calories = calories;
    }

    public double getMedianPrice() {
        return medianPrice;
    }

    public double getDistance() {
        return distance;
    }

    public double getRating() {
        return rating;
    }

    public boolean getDairyFree() {
        return dairyFree;
    }

    public boolean getNoCaffeine() {
        return noCaffeine;
    }

    public boolean getHot() {
        return hot;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name;
    }


}