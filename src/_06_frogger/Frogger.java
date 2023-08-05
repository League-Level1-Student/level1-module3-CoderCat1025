package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 525;
    int FrogHopDistance = 75;
    Car car1;
    Car car2;
    Car car3;
    Car car4;
    Car car5;
    Car car6;
    
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
car1 = new Car (100, 125, 100, 10, "right");
car2 = new Car (300, 125, 100, 10, "right");
car3 = new Car (100, 275, 100, 10, "left");
car4 = new Car (400, 450, 100, 10, "right");
car5 = new Car (150, 450, 100, 10, "right");
car6 = new Car (600, 450, 100, 10, "right");

back = loadImage("src/_06_frogger/froggerBackground.png");
carLeft = loadImage("src/_06_frogger/carLeft.png");
carLeft.resize(160,100);
carRight = loadImage("src/_06_frogger/carRight.png");
carRight.resize(160,100);
frog = loadImage("src/_06_frogger/frog.png");
frog.resize(75,75);
    }

    @Override
    public void draw() {
background(back);
image (frog, x, y);

car1.display();
car2.display();
car3.display();
car4.display();
car5.display();
car6.display();

car1.moveRight();
car1.display();

car2.moveRight();
car2.display();

car3.moveLeft();
car3.display();

car4.moveRight();
car4.display();

car5.moveRight();
car5.display();

car6.moveRight();
car6.display();

if (intersects(car1)) {
	x = 400;
	y = 525;
}
if (intersects(car2)) {
	x = 400;
	y = 525;
}
if (intersects(car3)) {
	x = 400;
	y = 525;
}
if (intersects(car4)) {
	x = 400;
	y = 525;
}
if (intersects(car5)) {
	x = 400;
	y = 525;
}
if (intersects(car6)) {
	x = 400;
	y = 525;
}
    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP && y - FrogHopDistance> 0)
            {
            y = y - FrogHopDistance;
            }
            else if(keyCode == DOWN && y + FrogHopDistance < 600)
            {
                y = y + FrogHopDistance;
            }
            else if(keyCode == RIGHT && x + FrogHopDistance < 800)
            {
                x = x + FrogHopDistance;
            }
            else if(keyCode == LEFT && x - FrogHopDistance> 0)
            {
                x = x - FrogHopDistance;
            }
        }
    }
    
    boolean intersects(Car car) {
    	 if ((y + 5 > car.getCarY() && y + 5 < car.getCarY()+50) &&
    	                (x + 5 > car.getCarX() && x + 5 < car.getCarX()+car.getCarSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    
 

}

    class Car {
    	private int carX;
    	private int carY;
    	private int carSize;
    	int carSpeed;
    	String carDirection;

    	public int getCarSize() {
			return carSize;
		}

		public int getCarX() {
			return carX;
		}

		public int getCarY() {
			return carY;
		}

		public Car (int carX, int carY, int carSize, int carSpeed, String carDirection) {
    		this.carX = carX;
    		this.carY = carY;
    		this.carSize = carSize;
    		this.carSpeed = carSpeed;
    		this.carDirection = carDirection;
    	}

    	void display()
    	{
    		if (carDirection .equals( "left")) {
    	        image (carLeft,carX,carY);
    		}
    		else if (carDirection .equals ("right")) {
    	        image (carRight,carX, carY);

    		}
    	}
    	
    	void moveLeft() {
    		if (carX > -carSize) {
    			carX = carX - carSpeed;
    		}
    		else {
    			carX = 800;
    		}
    	}
    	
    	void moveRight() {
    		if (carX < 800) {
    			carX = carX + carSpeed;
    		}
    		else {
    			carX = -carSize;
    		}
    	}
    	
    	}
}
