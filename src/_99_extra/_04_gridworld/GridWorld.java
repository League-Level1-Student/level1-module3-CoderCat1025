package _99_extra._04_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World<Actor> world = new World<Actor>();
		world.show();

		Bug bug = new Bug();
		Bug bug2 = new Bug();

		Location location1 = new Location(5, 5);
		int rand = new Random().nextInt(10);
		int rand2 = new Random().nextInt(10);
		Location location2 = new Location(rand, rand2);
		rand2 ++;
		Location location3 = new Location(rand, rand2);
		int rand3 = rand2 - 2;
		Location location4 = new Location(rand, rand3);



		world.add(location1, bug);
		world.add(location2, bug2);

		bug2.setColor(Color.BLUE);
		bug2.turn();
		bug2.turn();

		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		Flower flower3 = new Flower();

		flower3.setColor(Color.RED);

		if (rand2 > 0) {
			world.add(location3, flower1);
		}

		if (rand3 < 11) {
			world.add(location4, flower2);
		}

		for (int i = 0; i < 10; i++) {
			Color flower3Color = flower3.getColor();
			for (int o = 0; o < 10; o++) {				
				Location location = new Location(i, o);
				world.add(location, new Flower(flower3Color));
			}
			if (flower3.getColor() == Color.RED) {
				flower3.setColor(Color.WHITE);
				flower3Color = Color.WHITE;
			}
			else {
				flower3.setColor(Color.RED);
				flower3Color = Color.RED;
			}		
		}
	}

	// I don't know if this is intended or not, but the bugs and flowers can be in multiple places at once.
	// So if I make a bug, then add it to 2 different locations in the world, it appears in both locations.

}