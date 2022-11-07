package fr.epsi.plane;

public class AirPlane {

  // 1 déclaration des attributs / propriété
  private String brand;
  private String model;
  private int capacity;
  private int speed;
  private int elevation;

  // 2 Création du contructeur
  public AirPlane(String brand, String model) {
    this(brand);
    this.model = model;
  }

  public AirPlane(String brand) {
    this.brand = brand;
  }

  public void decelerate(int deceleration) {
    if (this.speed != 0) {
      this.speed--;
    }
  }

  public void accelerate(int deceleration) {
    this.speed++;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSpeed() {
    return speed;
  }

  @Override
  public String toString() {
    return "AirPlane [brand=" + brand + ", model=" + model + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AirPlane other = (AirPlane) obj;
    if (brand == null) {
      if (other.brand != null)
        return false;
    } else if (!brand.equals(other.brand))
      return false;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    return true;
  }
  
  

}
