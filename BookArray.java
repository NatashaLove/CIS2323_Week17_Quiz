public class BookArray {


public static void main(String[] args) {

  

    Book[] BookArr;
	BookArr = new Book[10]; 
    
	double price;

    String title;

    BookArr[0] = new Fiction("To Kill a Mockingbird");
  
	BookArr[1] = new Fiction("Anna Karenina");

    BookArr[2] = new NonFiction("A Brief History of Time by Stephen Hawking");

    BookArr[3] = new NonFiction("Orientalism by Edward Said");

    BookArr[4] = new NonFiction("The Selfish Gene by Richard Dawkins");

    BookArr[5] = new NonFiction("Awopbopaloobop Alopbamboom by Nik Cohn");

    BookArr[6] = new Fiction("The Great Gatsby");

    BookArr[7] = new Fiction("One Hundred Years of Solitude");

    BookArr[8] = new Fiction("Invisible Man");

    BookArr[9] = new Fiction("Don Quixote");

  
    for (int i = 0; i < BookArr.length; i++) {

		price = BookArr[i].getPrice();

		title =   BookArr[i].getTitle();

		System.out.println("");
		System.out.println("We have a book " + title + " at the price ..........." + price+ " $.");
		System.out.println("");
    } 

    

  }





}