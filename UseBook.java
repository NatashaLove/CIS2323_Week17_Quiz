import java.util.*;

abstract class Book {
	private String title="";
	private double price=0;
	
	public Book(String title){
		this.title=title;
	}
	// public Book() {
		
	// }
	
	 String getTitle(){
		return title;
	 }
	 double getPrice(){
		return price;
	 }
	
	public abstract void setPrice(double price);
}


//РАЗОБРАТЬСЯ С КОНСТРУКТОРАМИ!!! (super)?
class Fiction extends Book{
	
	Fiction() {
		//public String title="";
		super(" ");// You have to pass String value to super class
		}
	
		 public void setPrice(double price){
			price=24.99;
		}
}

class NonFiction extends Book{
	NonFiction() {
		//public String title="";
		super(" ");
    
	}
	 public void setPrice(double price){
		price=37.99;
	}

}



public class UseBook {
	public static void main(String[] args){
		
		Fiction fict = new Fiction("Alice in WonderLand.");
		NonFiction nonfict = new NonFiction("English-Russian Dictionary");
		
		System.out.println("We have a fiction book "+ fict.getTitle + " at the price "+ fict.getPrice+ ".");
		System.out.println("We have a non-fiction book "+ nonfict.getTitle + " at the price "+ nonfict.getPrice+ ".");
	}
	
}