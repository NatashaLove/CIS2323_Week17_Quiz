public class Fiction extends Book{
	
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