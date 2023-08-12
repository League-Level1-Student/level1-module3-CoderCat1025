package _99_extra._04_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldExtra {
public static void main(String[] args) {
	World<Bug> world = new World<Bug>();
	world.show();
	
	for (int i = 0; i < 10; i++) {
		world.add(new Location(i, i), new Bug());
		world.add(new Location(i, 9 - i), new Bug());

	}
}
}
