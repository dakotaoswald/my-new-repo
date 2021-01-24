package package1;

public class Terraria extends Game{ // Terraria class inheriting from Game class
	   String name = "Terraria";
	   String dimension = "2-Dimensional";
	   private String rating;
	   public String getRating() {
		   return this.rating;
	   }
	   
	   public void setRating(String easy) {
		   this.rating = easy;
	   }
	   
	   public static void main(String args[]) {
		   Terraria obj = new Terraria(); // creating object Terraria & invoking constructor to initialize it
			System.out.println(obj.name);
			System.out.println(obj.platform);
			System.out.println(obj.gameType);
			System.out.println(obj.dimension);
			obj.execute();
			
			obj.setRating("10/10");
			String easy = obj.getRating();
			System.out.println(obj.getRating()); 
			
			Game obj2 = new Terraria();
			obj2.example();
	   }
	   
	   @Override
	   public void example() {
		   System.out.println("This is my project"); // Polymorphism in object example + overriding example
	   }

	}
