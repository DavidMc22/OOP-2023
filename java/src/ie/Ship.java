package ie;

import processing.core.PApplet;
import processing.core.PVector;

public class Ship {

    private PVector pos;
    PApplet p;

    public Ship (float x, float y, float sizw, int c)
    {
        pos = new PVector(x, y);
        this.size = size;
        this.c = c;
        this.p = p;
    }





     public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    

     private float rot;
     private int c;
     private float size;
    
}
