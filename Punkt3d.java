package lab2;

public class Punkt3d extends Punkt2d
{
	private double z;
	
	public Punkt3d(double x, double y, double z) 
	{
		super(x, y);
		setZ(z);
	}
	public double getZ()
	{
		return z;
	}
	public void setZ(double z)
	{
		this.z = z;
	}
	
	public String toString()
	{
		return "[" + getX() + "," + getY() + "," + getZ() + "]";
	}
	
	public double distance(Punkt3d punktTmp)
	{
		return Math.sqrt(Math.pow(punktTmp.getX()-getX(), 2) + Math.pow(punktTmp.getY()-getY(), 2) + Math.pow(punktTmp.getX()-getZ(), 2));
	}

}
