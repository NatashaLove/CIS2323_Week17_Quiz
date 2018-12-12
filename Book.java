public abstract class Book {
	String title="";
	double price=0;
	
	//public Book() {}
	public Book(String title){
		this.title=title;
	}
	
	public abstract void setPrice(double price);
	
	public String getTitle(){
		return title;
	 }
	public double getPrice(){
		return price;
	 }
	
	
}