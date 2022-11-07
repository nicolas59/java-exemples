package fr.epsi;

public class Question1 {

  private String name;
  
  public Question1(String name) {
    this.name = "Test";
    System.out.println(name);
    System.out.print(this.name);
  }
  
  public static void main(String...args) {
    new Question1("Nouvelle valeur");
  }
  
}
