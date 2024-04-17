import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  // Declaring Variables
  PImage imgBackroundSpace;
  PImage imgspaceship;
  float intshipx = 0;
  float intshipy = 0;
  float fltspeedx = 0;
  float fltspeedy = 0;
  float fltcirclex = 0;
  float fltcircley = 0;
  float fltAngle = 0;
  float fltsizecircle = width/4;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    // loading the backround
    imgBackroundSpace = loadImage("space.png");
    // loading the ship
    imgspaceship = loadImage("ship.png");
    // resizing the backround so it fits the actual backround size
    imgBackroundSpace.resize(width, height);

    //Setting the Speed of the ship
    fltspeedx = 5;
    fltspeedy = 7;
  }

  public void draw() {
    background(imgBackroundSpace);

    //inputing the speed into the circle
    fltcirclex += fltspeedx;
    fltcircley += fltspeedy;
    //making the circle bounce
    if (fltcirclex >= width ) {
      fltspeedx *= -1;
    }
        if (fltcirclex <= 0) {
      fltspeedx *= -1;
    }

        if (fltcircley >= height ) {
      fltspeedy *= -1;
    }

            if (fltcircley <= 0 ) {
      fltspeedy *= -1 ;
    }
    // Setting the angle of whic the ship moves
    fltAngle = fltAngle + (float)0.1;
    intshipx = (float) Math.cos(fltAngle) * 100;
    intshipy = (float) Math.sin(fltAngle) * 100;
    // Drawing the Images and Or Shapes
    ellipse(fltcirclex, fltcircley, fltsizecircle, fltsizecircle);
    image(imgspaceship, intshipx+width/3, intshipy+height/3);

  }

}