/*
 * Written by Neya Murugesan
 */
public class Bicycle {
	
	private String make;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame frame;
	
	public Bicycle()
	{
		make = "none";
		FrontWheel = new Wheel();
		BackWheel = new Wheel();
		frame = new Frame();
		
	}
	
	public Bicycle(String make, Wheel FrontWheel, Wheel BackWheel, Frame frame)
	{
		setMake(make);
		setFrontWheel(FrontWheel);
		setBackWheel(BackWheel);
		setFrame(frame);
	}
	
	public String getMake()
	{
		//returns the make
		return make;
	}
	
	public Wheel getFrontWheel()
	{
		return FrontWheel;
	}
	
	public Wheel getBackWheel()
	{
		return BackWheel;
	}
	
	public Frame getFrame()
	{
		return frame;
	}
	
	public void setMake(String make)
	{
		//if the make is null, the make is set to the default value "none"
		if (make == null)
		{
			this.make = "none";
		}
		
		else
		{
			this.make = make;
		}
	}
	
	public void setFrontWheel(Wheel FrontWheel)
	{
		if (FrontWheel.equals(FrontWheel))
		{
			this.FrontWheel = FrontWheel;
		}
		
		else
		{
			this.FrontWheel = new Wheel();
		}
	}
	
	public void setBackWheel(Wheel BackWheel)
	{
		if (BackWheel.equals(BackWheel))
		{
			this.BackWheel = BackWheel;
		}
		
		else
		{
			this.BackWheel = new Wheel();
		}
	}
	
	public void setFrame(Frame frame)
	{
		if (frame.equals(frame))
		{
			this.frame = frame;
		}
		
		else
		{
			this.frame = new Frame();
		}
			
	}
	
	public boolean equals(Bicycle i)
	{
		if (this.make.equals(i.make) && this.FrontWheel.equals(i.FrontWheel) && this.BackWheel.equals(i.BackWheel) && this.frame.equals(i.frame))
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		//returns a string with all the bicycle info
		String bicycleInfo = " [Bicycle] Make: " + make + " Front Wheel: [Wheel] " + FrontWheel + " Back Wheel: " + BackWheel + " Frame: [Frame] " + frame;
		return bicycleInfo;
	}
	

}
