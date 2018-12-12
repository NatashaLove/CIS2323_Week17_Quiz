public class NonFiction extends Book{
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