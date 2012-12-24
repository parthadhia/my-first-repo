
public class Cell {

	private boolean status;
	private int neighbors;
	Cell()
	{
		status=false;
		neighbors=0;
	}
	boolean getStatus()
	{
		return status;
	}
	void setAlive()
	{
		status=true;
	}
	void setDead()
	{
		status=false;
	}
	int getNeighbors()
	{
		return neighbors;
	}
	void setNeighbors(int neighbors)
	{
		this.neighbors=neighbors;
	}

}
