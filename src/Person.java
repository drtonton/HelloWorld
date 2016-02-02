/**
 * Created by keaton foster on 2/1/16.
 */
// Zach, we created this one together so you know whats up.
public class Person {
    public String name;
    public int age;
    public boolean isAlive = true;
    public String address;

//this is a constructor
    public Person(){

    }
//this is a constructor that calls a constructor
    public Person(String name, int age) {
        this(name, age, true);
    }

//this is the constructor. the point of contructors is to force you to set fields.
    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;

    }


// these are just examples of get and set methods
    public String getName() {
        return name;
    }

//method inside method
    public void setName(String newName){
        if (isValidName(newName)) {
            name = newName;
        }
    }

    public int getAge(){
        return age;
    }
//this method prevents a negative age being entered and returned (will return with 0)
    public void setAge(int newAge){
        if (newAge >= 0){
            age = newAge;
        }
    }

    public boolean isAlive(){
        return isAlive;
    }

    public void setAlive(boolean newIsAlive){
        isAlive = newIsAlive;
    }

    public boolean isValidName(String name){
        return name.contains(" ");
    }
}
