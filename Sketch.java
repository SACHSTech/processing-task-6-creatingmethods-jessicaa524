import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    stickMan(100, 60);
    positionMan();

    // heart
    for (int y = 1; y < 7; y++) {
      int xLayout = (y % 2) * 50; 
      for (int x = 70; x < 750; x += 100) {
        heart(x +xLayout, 25 + (y * 50));
      }
    }

  }
  
/**
 * Description: Drawing stickman 
 * 
 * @param intHorizontalX first int
 * @param intVerticalY second
 */
  private void stickMan(int x, int y){
    int intHorizontalX = 50 + x;
    int intVerticalY = y;
    fill(210, 255, 173);

    //head 
    ellipse(intHorizontalX,30 + intVerticalY, 15, 15);
    //body 
    line (intHorizontalX, 37 + intVerticalY, intHorizontalX, 55 + intVerticalY);
    //right arm 
    line(intHorizontalX, 50 + intVerticalY,60 + x, 40 + intVerticalY);
    //left arm 
    line(intHorizontalX, 50 + intVerticalY,40 + x, 40 + intVerticalY);
    //right leg
    line(intHorizontalX, 55 + intVerticalY,60 + x, 65 + intVerticalY);
    //left leg
    line(intHorizontalX, 55 + intVerticalY,40 + x, 65 + intVerticalY);
  }
/**
 * Description: Formatting stickman
 * Uses positionMan() method to layout 
 */

 private void positionMan(){
  for (int xAxis = 0; xAxis < 750; xAxis += 50){
    for (int yAxis = 10; yAxis < 350; yAxis += 50){
      if (yAxis == 10){
        // red
        stroke(255, 34, 0);
      }
      else if (yAxis == 60) {  
        // orange
        stroke(255, 136, 0);
      }
      else if (yAxis == 110){
        // yellow 
        stroke(255, 234, 0);
      }
      else if (yAxis == 160){
        // green
        stroke(0, 133, 51);
      }
      else if (yAxis == 210){
        // light blue
        stroke(53, 186, 219);
      }
      else if (yAxis == 260){
        // dark blue
        stroke(0, 47, 196);
      }
      else if (yAxis == 310) {
        // purple
        stroke(140, 0, 255);
      }
      stickMan(xAxis, yAxis);
    }
  }  
 }

 /**
 * Description: Drawing heart
 */
 private void heart(int x, int y){
  stroke(0);
  fill(0, 0, 0);
  ellipse(x, y, 8, 10);
  ellipse(x + 10, y, 8, 10);
  triangle(x - 5, y, x + 15, y, x + 5, y + 12);
 }
}

