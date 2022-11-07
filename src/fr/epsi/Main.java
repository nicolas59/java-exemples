package fr.epsi;

import fr.epsi.car.Vehicule;
import fr.epsi.car.Voiture;
import fr.epsi.plane.AirPlane;

public class Main {

  public static void main(String[] args) {
    AirPlane b777 = new AirPlane("Boeing", "B777");
    b777.accelerate(10);
    b777.decelerate(30);
    b777.decelerate(1);
    
    AirPlane a310 = new AirPlane("Airbus", "A310");

    // polymorphisme
    Vehicule v1 = new Voiture(4, "Peugeot 308");
    Vehicule v2 = new Voiture(4, "Telsa");
    Vehicule[] vehicules = {v1, v2};
    v1.move();
    if(v1 instanceof Voiture) {
      System.out.println("Je suis bien une voiture");
    }
  }
}
