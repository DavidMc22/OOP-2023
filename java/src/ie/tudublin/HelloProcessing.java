package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		

	
		
	}

	
	public void draw()
	{	

		stroke(225);
		line(10,10,100,100); //x1 y1 x2 y2
		circle(300,250,70); //CX, CY, d  
		fill(0,255,0);
		rect(10,300,10,100); // TLX, TLY, W, H
		stroke(127); //outines shapes 
		fill(0,0,255);// Fills shapes 
		noStroke(); //
		noFill();// Takes away the fill
		strokeWeight(1); // Changes tickness of lines
		triangle(40,90,300,20,80,70);
		fill(0,0,255);







	}
}
