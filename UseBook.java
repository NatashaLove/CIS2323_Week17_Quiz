import java.util.*;

public class UseBook {
	public static void main(String[] args){
		
		
		Fiction fict = new Fiction("Alice in Wonderland");
		NonFiction nonfict = new NonFiction("English-Russian Dictionary");
		
		System.out.println("");
		System.out.println("We have a fiction book "+ fict.getTitle() + " at the price "+ fict.getPrice()+ "$.");
		System.out.println("");
		System.out.println("We have a non-fiction book "+ nonfict.getTitle() + " at the price "+ nonfict.getPrice() + "$.");
	}
	
}