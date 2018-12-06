abstract class Book {
	private String title;
	private double price;
	
	public Book(String title){
		this.title=title;
	}
	String getTitle(){
		return title;
	}
	double getPrice(){
		return price;
	}
	abstract void setPrice();
}