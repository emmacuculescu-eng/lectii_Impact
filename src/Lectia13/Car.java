package Lectia13;

public class Car {
    String brand;
    String model;
    int an;
    String tipCombustibil;
    String culoare;
    float pretPerZi;
    private boolean available = true;

    public void rent(){

        available = false;
    }

    public void showCarInfo(){
        if(available)
            System.out.println("Acesta este un " + brand + " " + model + " din anul " + an + "\n de culoare " + culoare + " la pretul de " + pretPerZi + "$ pe zi");
        else{
            System.out.println("Din pacate aceasta masina nu este disponibila la moment                                                                                                    ");
        }
    }
}
