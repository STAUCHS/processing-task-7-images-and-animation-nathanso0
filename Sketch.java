import processing.core.PApplet;

public class Sketch extends PApplet {
  float intx = 200;
  float inty = 0;
  float fltspeed = 0;
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    fltspeed = 1;
    intx += 0;
    inty += fltspeed;
    background(210,255,173);
    fill(0,0,0);
    ellipse(200, 200, 40, 40);
    fill(255,255,255);
    ellipse(intx, inty, 40, 40);
    if (inty == 200){
    fltspeed = 0;
    background(210,255,173);
    }
  }

}