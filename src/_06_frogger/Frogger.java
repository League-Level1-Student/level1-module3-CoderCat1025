package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 525;
    int FrogHopDistance = 0;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
background(0, 0, 255);
fill(0, 0, 255);
ellipse(x, y, 25, 25);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP && y > 0)
            {
            y = y - FrogHopDistance;
            }
            else if(keyCode == DOWN && y < 600)
            {
                y = y + FrogHopDistance;
            }
            else if(keyCode == RIGHT && x < 800)
            {
                x = x + FrogHopDistance;
            }
            else if(keyCode == LEFT && x > 0)
            {
                x = x - FrogHopDistance;
            }
        }
    }
    
    public class Car {
    	int carX;
    	int carY;
    	int carSize;
    	int carSpeed;

    	public Car (int carX, int carY, int carSize, int carSpeed) {
    		this.carX = carX;
    		this.carY = carY;
    		this.carSize = carSize;
    		this.carSpeed = carSpeed;
    	}

    	void display()
    	{
    	  fill(0, 255, 0);
    	  rect(carX,  carY,  carSize, 50);
    	}
    	}

}


