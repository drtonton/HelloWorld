/**
 * Created by keaton foster on 2/1/16.
 */
// Zach, here I describe bathrooms by indicating male or female designation, # of toilets and verify their cleanliness.
public class Bathroom {
    public boolean isMale;
    public int toilets;
    public boolean isClean;
//the line below is the default constructor
    public Bathroom() {

    }

//the line below is the constructor with argument value types, but no set arguments
    public Bathroom(boolean isMale, int toilets, boolean isClean) {
        this.isMale = isMale;
        this.toilets = toilets;
        this.isClean = isClean;
    }

//the next two methods set a number of toilets, and return if number is at least 0, respectively
    public void setToilets(int newNumToilets) {
        if (newNumToilets >= 0) {
            this.toilets = newNumToilets;
        }
    }

    public int getToilets() {
        return toilets;
    }

    public void setIsMale(boolean newIsMale){
        isMale = newIsMale;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsClean(boolean newIsClean){
        isClean = newIsClean;
    }

    public boolean getIsClean() {
        return isClean;
    }
}