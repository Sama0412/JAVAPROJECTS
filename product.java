package java_practice_task1;

public class product {
String name;
int price;
static int total_product=0;

public product(String name,int price) {
	this.name=name;
	this.price=price;
	total_product++;
}

void display() {
	System.out.println("product name :" + name +    "    price : " + price);
}

}
