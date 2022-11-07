package fr.epsi;

public class AutreClass {

  private String val;
  
  public AutreClass(Question2 question2){
    this.val = question2.val;
    System.out.println(this.val);
  }
  
  public static void main(String... args) {
    Question2 question2 = new Question2();
    AutreClass autreClass = new AutreClass(question2);
  }
}
