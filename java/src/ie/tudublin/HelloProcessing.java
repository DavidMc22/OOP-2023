package ie.tudublin;


import com.jogamp.opengl.util.TimeFrameI;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(1000, 1000);
		
	}

	public void setup() {
		
		background(0,0,0);
	
		
	}

	
	public void draw()
	{	
		
		strokeWeight(10);
		delay(100);
		fill(0, 255, 255);
		circle(random(0,width), random(0, width), random(0,width));
		delay(100);
		fill(0, 0, 255);
		circle(random(0,width), random(0, width), random(0,width));
		fill(0, 245, 204);
		circle(random(0,width), random(0, width), random(0,width));
		
	

	}
}
