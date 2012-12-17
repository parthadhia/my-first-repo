
public class SalesReport {

	public static void main(String[] args)
	{
	InputData input1 = new InputData();
	InputData input2= new InputData();
    Shop shop1Data= new Shop();
    Shop shop2Data= new Shop();
    fillShopData(shop1Data, input1);
    fillShopData(shop2Data, input2);
    System.out.println("Shop number 1:");
    System.out.println("The number of products sold is "+shop1Data.getSum());
    System.out.println("The total income is $ "+shop1Data.getTotalIncome());
    System.out.println("The average price of products is $ "+shop1Data.averagePrice());
    System.out.println("The max price is $ "+shop1Data.maxPrice());
    System.out.println("Here is the sales report");
    shop1Data.showSalesReport();
    System.out.println();
    System.out.println("Shop number 2:");
    System.out.println("The number of products sold is "+shop2Data.getSum());
    System.out.println("The total income is $ "+shop2Data.getTotalIncome());
    System.out.println("The average price of products is $ "+shop2Data.averagePrice());
    System.out.println("The max price is $ "+shop2Data.maxPrice());
    System.out.println("Here is the sales report");
    shop2Data.showSalesReport();
    
	}
	public static void fillShopData(Shop h, InputData p)
	{
		do
		{
		h.AddProduct(p.getProdID(), p.getDescription(), (((double)p.getPriceCents())/100), p.getUnitsSold());
	}
		while(p.next());
		
	}
	
}
