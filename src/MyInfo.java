
public class MyInfo {
   public void Details() {
      String name = "Tania Hossain";
      String profession = "Graphic Designer";
      String location = "Tejgaon";
      int experience = 0;
      experience = experience + 9;
      String text = " Years' Experience on Graphic Design.";
      System.out.println(" Detail Information : ");
      System.out.println("This is " + name);
      System.out.println("She is a " + profession);
      System.out.println("Her Office Located at " + location);
      System.out.println("She have " + experience + text);
   }
   public static void main(String args[]) {
      MyInfo details = new MyInfo();
      details.Details();
   }
}