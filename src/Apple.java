/**
 * Created by keaton foster on 2/1/16.
 */
// Zach, this class describes Apples according to their color and amount of seeds, and verifies their tastiness.
public class Apple {
    public String color;
    public int seeds;
    public boolean isTasty;

    //below is the default constructor
    public Apple() {

    }

    //this is the constructor used to set specific values
    public Apple(String color, int seeds, boolean isTasty) {
        this.color = color;
        this.seeds = seeds;
        this.isTasty = isTasty;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return color;
    }

    /*this set method sets the number of seeds to a new number,
    unless that number is less than 4 (assume apples must have at least 4 seeds in this universe*/
    public void setSeeds(int newNumSeeds) {
        if(newNumSeeds >= 4) {
            this.seeds = newNumSeeds;
        }
    }

    //this get method returns the number of seeds, unless that number is less than 4
    public int getSeeds() {
        if(seeds >= 4) {
            return seeds;
        }
        else{
            return -1;
        }
    }

    public void setIsTasty(boolean newIsTasty){
        isTasty = newIsTasty;
    }

    public boolean getIsTasty() {
        return isTasty;
    }
}
