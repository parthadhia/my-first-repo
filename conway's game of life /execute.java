import java.io.*;
public class execute {

	static public void display(Cell univ[][])
	{
		for(int i=0;i<univ.length;i++)
		{
			for(int j=0;j<univ[0].length;j++)
			{
			
				if(univ[i][j].getStatus())
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	public static Cell[][] numneighbors(Cell univ[][])
	{
		int count=0; int x=univ.length;
		int y=univ[0].length;
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				
				if(i!=0 && j!=0)
				{
					if(univ[i-1][j-1].getStatus())
					{
						count++;
					}
				}
				if(i!=0)
				{
					if(univ[i-1][j].getStatus())
					{
						count++;
					}
				}
				if(j!=0)
				{
					if(univ[i][j-1].getStatus())
					{
						count++;
					}
				}
				if(i!= x-1 && j!= y-1)
				{
					if(univ[i+1][j+1].getStatus())
					{
						count++;
					}
				
				}
				if(i!=x-1)
				{
					if(univ[i+1][j].getStatus())
					{
						count++;
					}
				}
				if(j!=y-1)
				{
					if(univ[i][j+1].getStatus())
					{
						count++;
					}
				}
				if(i!=0 && j!=y-1)
				{
					if(univ[i-1][j+1].getStatus())
					{
						count++;
					}
				}
				if(i!=x-1 && j!=0)
				{
					if(univ[i+1][j-1].getStatus())
					{
						count++;
					}
				}
				univ[i][j].setNeighbors(count);
				
				count=0;
			}
			
		}
		return univ;
	}
	public static Cell[][] changeStatus(Cell univ[][])
	{
		for(int i=0; i<univ.length; i++)
		{
			for(int j=0; j<univ[0].length; j++)
			{
				
				if(univ[i][j].getStatus() && univ[i][j].getNeighbors()<2)
				{
					univ[i][j].setDead();
					
					
				}
				else if(univ[i][j].getStatus() && univ[i][j].getNeighbors()==2 || univ[i][j].getNeighbors()==3)
				{
					univ[i][j].setAlive();
				
				}
				else if(!univ[i][j].getStatus() && univ[i][j].getNeighbors()==3)
				{
					univ[i][j].setAlive();
				}
				else if(univ[i][j].getStatus() && univ[i][j].getNeighbors()>3)
				{
					univ[i][j].setDead();
				
				}
			}
		
		}
		return univ;
		
	}
	
	public static void main(String[] args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("welcome to the game of life which basically works on 4 rules");
		System.out.println("its starts of with some random cells and then proceeds to further generations");
		System.out.println("the four rules on which the games works are:");
		System.out.println("Any live cell with fewer than two live neighbours dies, as if caused by under-population.");
		System.out.println("Any live cell with two or three live neighbours lives on to the next generation.");
		System.out.println("Any live cell with more than three live neighbours dies, as if by overcrowding.");
		System.out.println("Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.");
		System.out.println("For best results, enlarge the console window and then in the two number inputs below enter a large number like 100 or more than 100 to see the magic");
		System.out.println("Input the number of rows of the grid");
		System.out.println("input a large number like 100 to see awesomer results");
		int numx=Integer.parseInt(in.readLine());
		System.out.println("Input the number of columns of the grid");
		System.out.println("input a large number like 100 or more than that to see awesomer results");
	    int numy=Integer.parseInt(in.readLine());
	    World ob= new World(numx, numy);
	    System.out.println("Here is the first generation");
	    ob.populate_first_generation();
	    display(ob.univ);
	    System.out.println("to see the best results keep pressing y and enter or return key, that is .... keep viewing till many generations and see the magic");
	    String c; boolean f=true; 
	    while(f)
	    {    	
	    	System.out.println("Enter y to proceed and anything else to exit");
	    	
	    	c=in.readLine();
	    	if(c.equals("y"))
	    	
	    	{
	    		f=true;
	    		System.out.println("Here is the next generation");
	    	
	    		Cell[][] e=changeStatus(numneighbors(ob.univ));
	    		for(int i=0; i< e.length; i++)
	    		{
	    			for(int j=0;j< e[0].length ; j++)
	    			{
	    				ob.univ[i][j]=e[i][j];
	    				
	    			}
	    		}
	    		display(ob.univ);
	    	}
	    	
	    	else 
	    	{
	    	
	    		f=false;
	    		System.out.println("thankyou for using the game of life, hope to see you again mate");
	    	
	    	}
	}
  }
}
