package lab2;

public class Punkt2d {
	
	private double x; 
	private double y;
	public Punkt2d(double x, double y) 
	{
		setX(x);
		setY(y);
	}
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}

	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double distance(Punkt2d punktTmp)
	{
		return Math.sqrt(Math.pow(punktTmp.getX()-getX(), 2) + Math.pow(punktTmp.getY()-getY(), 2));
	}
	
	public String toString()
	{
		return "["+ x + "," + y + "] ";
	}
}
