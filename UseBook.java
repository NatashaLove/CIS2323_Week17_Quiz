import java.util.*;

abstract class Book {
	String title="";
	double price=0;
	
	//public Book() {}
	public Book(String title){
		this.title=title;
	}
	// public Book() {
		
	// }
	public abstract void setPrice(double price);
	
	public String getTitle(){
		return title;
	 }
	public double getPrice(){
		return price;
	 }
	
	
}


//!!! (super)?
class Fiction extends Book{
	
	Fiction(String title) {
		//public String title="";
		super(title);// You have to pass String value to super class
		setPrice(24.99);
		}
	@Override
		 public void setPrice(double pr){
			//pr=24.99;
			price=pr;
		}

}

class NonFiction extends Book{
	NonFiction(String title) {
		//public String title="";
		super(title);
		setPrice(37.99);
    
	}
	@Override
	 public void setPrice(double pr){
		//pr=37.99;
		price=pr;
	}

}



public class UseBook {
	public static void main(String[] args){
		
		
		Fiction fict = new Fiction("Alice in Wonderland");
		NonFiction nonfict = new NonFiction("English-Russian Dictionary");
		
		System.out.println("We have a fiction book "+ fict.getTitle() + " at the price "+ fict.getPrice()+ ".");
		System.out.println("We have a non-fiction book "+ nonfict.getTitle() + " at the price "+ nonfict.getPrice() + ".");
	}
	
}