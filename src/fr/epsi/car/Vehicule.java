package fr.epsi.car;

import java.io.Serializable;

public abstract class Vehicule implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = -3866571774834091166L;

  private transient int nbRoues;
  private String modele;


  public Vehicule(int nbRoues, String modele) {
    this.nbRoues = nbRoues;
    this.modele = modele;
  }

  public abstract void move();

  public int getNbRoues() {
    return nbRoues;
  }

  public void setNbRoues(int nbRoues) {
    this.nbRoues = nbRoues;
  }

  public String getModele() {
    return modele;
  }

  public void setModele(String modele) {
    this.modele = modele;
  }

}
