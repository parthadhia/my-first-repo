
public class Cell {

	private String status;
	private int neighbors;
	Cell()
	{
		status="";
		neighbors=0;
	}
	String getStatus()
	{
		return status;
	}
	void setStatus(String status)
	{
		this.status=status;
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
