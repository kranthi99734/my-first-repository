package temp_p;
public class fruit {
	  String name;
	  double price;	

 public fruit(String name,int price) {
	 this.name = name;
	 this.price = price;// TODO Auto-generated constructor stub
	}
 public static void main (String[] args) {
	
	fruit f= new fruit ("apple",100);
	System.out.println("name:"+f.name);
	System.out.println("price:"+f.price);
	 
	



}
}
