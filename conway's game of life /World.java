
public class World {

	int numy; 
	int numx;
	Cell[][] univ;
	World(int numx, int numy)
	{
		this.numx=numx;
		this.numy=numy;
		univ=new Cell[numx][numy];
		for(int i=0; i<numx; i++)
		{
			for(int j=0;j<numy;j++)
			{
				univ[i][j]=new Cell();
			}
		}
		
		
	}
	
	public void populate_first_generation()
	{
		int stat=0;
		for(int i=0; i<numx; i++)
		{
			
			for(int j=0; j<numy; j++)
			{
				stat=(int)(Math.random()*2);
				if(stat==0)
				{
					univ[i][j].setAlive();
				}
				else
				{
					univ[i][j].setDead();
				}
				
			}
		}
	}

	
	
}