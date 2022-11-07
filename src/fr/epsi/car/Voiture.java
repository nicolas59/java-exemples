package fr.epsi.car;

import java.io.Serializable;

public class Voiture extends Vehicule implements AutoRoute, Serializable {
  private static final int VEHICULE_LEGER = 1;
  
  private Proprietaire proprietaire;

  public Voiture(int nbRoues, String modele) {
    super(nbRoues, modele);
    this.proprietaire = new Proprietaire();
    
  }

  public Proprietaire getProprietaire() {
    return proprietaire;
  }

  public void setProprietaire(Proprietaire proprietaire) {
    this.proprietaire = proprietaire;
  }

  @Override
  public void move() {
    System.out.println("Je suis en deplacement");
  }

  @Override
  public int getCategorie() {
    return VEHICULE_LEGER;
  }
  /*
  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    this.setModele( ois.readUTF());
    this.setNbRoues(ois.readInt());
   
  }

  private void writeObject(ObjectOutputStream oos) throws IOException {
    oos.writeUTF(this.getModele());
    oos.writeInt(this.getNbRoues());
  }*/
}
