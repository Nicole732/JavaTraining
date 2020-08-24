
/*
Lab* : create a base class *Bicycle* with fields : *int gear and int speed* 
the Bicycle class has one constructor to initialize gear and speed,
also the Bicycle class has two methods : *void applyBrake(int decrement)* to decrement speed 
and *speedUp(int increment)* to increment speed.
create a Bicycle derived/subclass class *MountainBike. t
*/
class Bicycle {
    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}

/* 
Create a class *Owner* with fields *String name and int age* and make sure the  MountainBike HAS-A owner.
*/


/* 
Write a *Test*  class where you will be creating a MountainBike object and print the properties of that object
*/
class Test {
    public static void main(String args[]){
        System.out.println("The main method");
    }
}