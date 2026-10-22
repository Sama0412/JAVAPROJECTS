package java_practice_task1;

public class productTest {
public static void main(String[] args) {
	product p= new product("notebook", 150);
	product p2=new product("pen", 75);
	product p3=new product("laptop", 80000);	
	product p4=new product("earphone", 2500);
	product p5=new product("watch", 1500);
	
	p.display();
	p2.display();
	p3.display();
	p4.display();
	p5.display();
	
	System.out.println("total_product is : "+ product.total_product);
}
}
