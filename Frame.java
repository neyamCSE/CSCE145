
public class Frame {
	
	private double size;
	private String type;
	
	public Frame()
	{
		this.size = 18.5;
		this.type = "Diamond";
	}
	
	public Frame(double size, String type)
	{
		setSize(size);
		setType(type);
	}
	
	public double getSize()
	{
		return size;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setSize(double size)
	{
		if(size >= 18.5 && size <= 60)
		{
			this.size = size;
		}
		
		else
		{
			this.size = 18.5;
		}
	}
	
	public void setType(String type)
	{
		//checks if the variables are set to Diamond, Step-Through, 
		//or Penny-Farthing, if not the value is set to the default
		if(type.equals("Diamond") || type.equals("Step-Through") || type.equals("Truss") || type.equals("Penny-Farthing")) 
		{
			this.type = type;
		}
		
		else 
		{
			this.type = "Diamond";
		}
	}
	
	public String toString()
	{
		//returns the frame info size and type
		String frameInfo = "Size: " + size + " Type: " + type;
		return frameInfo;
	}
	
	public boolean equals(Frame i)
	{
		if(i.size == this.size && i.type.equals(this.type))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

}
