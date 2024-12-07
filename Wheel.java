
public class Wheel {
	
	private double diameter;
	private double width;
	
	public Wheel()
	{
		diameter = 16;
		width = 1;
	}
	
	
	public Wheel(double diameter, double width)
	{
		setDiameter(diameter);
		setWidth(width);
	}
	
	public double getDiameter()
	{
		return diameter;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setDiameter(double diameter)
	{
		if(diameter >= 16 && diameter <= 55)
		{
			this.diameter = diameter;
		}
		
		else
		{
			this.diameter = 16;
		}
	}
	
	public void setWidth(double width)
	{
		if(width >= 1 && width <= 2.5)
		{
			this.width = width;
		}
		
		else 
		{
			this.width = 1;
		}
	}
	
	public String toString()
	{
		String wheelInfo = "Diameter: " + diameter + " Width " + width; 
		return wheelInfo;
	}
	
	public boolean equals(Wheel i)
	{
		if (i.diameter == diameter && i.width == width) 
		{
			return true;
		} 
		
		else 
		{
			return false;
		}
		
	}
	

}
