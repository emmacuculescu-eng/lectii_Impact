package Lectia15;

public class Vehicul {

    abstract public void move ();

    public void FuelUp(){
        System.out.println("Fuelling up this vehicule");
    }

}
class Car extends Vehicul{
    @Overrided
    public void move(){
        System.out.println("This car drives on the road");

    }
}
class Airplane extends Vehicul{}
