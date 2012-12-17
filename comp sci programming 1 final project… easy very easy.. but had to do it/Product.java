
public class Product {

	private String name;
	private int id;
	private double price;//in cents
	private int number; //number of units sold
	Product(String name, int id, double price,int number)
	{
		this.name=name;
		this.id=id;
		this.price=price;
		this.setNumber(number); //this constructor will include any additional variables that i need in the class
	}
Product(String name, int id, double price)
{
	this.name=name;
	this.id=id;
	this.price=price;
}
void setName(String name)
{
	this.name=name;
}

String getName()
{
	return name;
}
void setID(int id)
{
	this.id=id;
}
int getId()
{
	return id;
}
void setPrice(double price)
{
	this.price=price;
}
double getPrice()
{
	return price;
}
int getNumber() {
	return number;
}
void setNumber(int number) {
	this.number = number;
}
  }
