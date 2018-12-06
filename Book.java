public abstract class Book {
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