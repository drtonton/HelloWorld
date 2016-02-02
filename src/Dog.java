/**
 * Created by keaton foster on 2/1/16.
 */
// Zach, in this class I describe the breed and age of dogs, and verify whether they are trained or not.
public class Dog {
    public String breed;
    public int age;
    public boolean isTrained;
    public String name;

    public Dog() {

    }

    public Dog(String breed, int age, boolean isTrained, String name){
        this.breed = breed;
        this.age = age;
        this.isTrained = isTrained;
        this.name = name;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public String getBreed(){
        return breed;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setIsTrained(boolean newIsTrained){
        isTrained = newIsTrained;
    }

    public boolean getIsTrained() {
        return isTrained;
    }

    /* doug showed me a much simpler way of creating this constraint, i just wanted to leave this for example */
    public boolean isOneWordName(String name){
        if (name.contains(" ")){
            return false;
        }
        return true;
    }

    public void setName(String newName){
        if (isOneWordName(newName)) {
            name = newName;
        }
    }

}
