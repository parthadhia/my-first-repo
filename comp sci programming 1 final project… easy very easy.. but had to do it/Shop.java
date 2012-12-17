
public class Shop {

	private Product[] k; private int count=0;private int count1=0; private int sumofproducts=0; private double totalincome=0; 
	private String shopname;private double sum;
	Shop()
	{
		InputData ob1=new InputData();
		do
		{
		
		count1++;
		}
		while(ob1.next());
		k=new Product[count1];
	}
	void setshopName(String shopname)
	{
		this.shopname=shopname;
	}
	String getshopName()
	{
		return shopname;
	}
	void AddProduct(Product y)
	{
        k[count]=y;
        count++;
	}
	void AddProduct(int id, String name, double price, int number)
	{
     k[count]=new Product(name, id, price, number);
     count++;
     sumofproducts=sumofproducts+number;
     totalincome=totalincome+(number*price);
	}
	double averagePrice()
{
	double average=0;
	for(int i=0;i<count;i++)
	{
		sum=sum+k[i].getPrice();
	}
	average=sum/count;
	return average;
}
double maxPrice()
{
	double max=0;
	for(int i=0;i<count;i++)
	{
		if(k[i].getPrice()>max)
		{
			max=k[i].getPrice();
		}
	}
	return max;
}
int getSum()
{
	return sumofproducts;//total number of products
}
double getTotalIncome()
{
	return totalincome;
}

void showSalesReport()
{
	Product ob=new Product("", 0, 0, 0);
	for(int i=0;i<count-1;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(k[i].getNumber()<k[j].getNumber())
			{
				ob=k[i];
				k[i]=k[j];
				k[j]=ob;
			}
		}
	}
	for(int i=0; i<count ;i++)
	{
	System.out.println("id: "+k[i].getId()+", product name: "+k[i].getName()+", price: $ "+k[i].getPrice()+", sales numbers: "+k[i].getNumber());
	}
}
}


