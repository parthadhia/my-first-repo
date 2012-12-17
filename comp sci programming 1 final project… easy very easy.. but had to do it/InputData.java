public class InputData {
	
	String[] descr = {"Apples", "Bananas", "Berries", "Grapes", "Lemons", "Lime", "Melons", "Nectarines", "Oranges", "Peaches", "Pears", "Plums", "Strawberries", "Watermelon", "Asparagus", "Broccoli", "Cabbage", "Carrots", "Cauliflower", "Celery", "Corn", "Garlic", "Lettuce", "Mushrooms", "Onions", "Peppers", "Potato", "Squash", "Sweet Potato", "Tomatoes", "Zucchini", "Cherries", "Mixed Fruit", "Peaches", "Pears", "Pineapples", "Asparagus", "Carrots", "Corn", "Greenbeans", "Peas", "Potatoes", "Tomatoes", "Baked Beans", "Butter Beans", "Green Beans", "Kidney Beans", "Pinto Beans", "PorkNBeans", "String Beans", "Broccoli", "Carrots", "Corn", "Dinners", "French Fries", "Ice Cream", "Mixed Veg.", "Peas", "Pizza", "Tater Tots", "Chicken", "Corned Beef", "Ham", "Salmon", "Tuna", "Vienna Sausage", "Boneless Breast", "Breast with Bone", "Legs", "Whole Chicken", "Wings", "Ground", "Hamburger", "Roast", "Steaks"};
	int[] priceCents;
	int[] prodID;
	int[] soldUnits;
	int current;

	public InputData() {
		priceCents = new int[descr.length];
		prodID = new int[descr.length];
		soldUnits = new int[descr.length];

		current = 0;
		populate();
	}

	private void populate() {
		int i;
		for (i=0; i<descr.length; i++)
		{
			priceCents[i] = (int)(Math.random()*1000+1);
			prodID[i] = (int)(Math.random()*1000000000);
			soldUnits[i] = (int)(Math.random()*200);
		}
	}

	public boolean next()
	{
		if (current==descr.length-1)
			return false;
		
		current++;
		return true;
	}

	public int getPriceCents() {
		return priceCents[current];
	}

	public int getProdID() {
		return prodID[current];
	}

	public String getDescription() {
		return descr[current];
	}

	public int getUnitsSold() {
		return soldUnits[current];
	}
}