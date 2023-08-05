package _99_extra._04_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	
	Bug bug = new Bug();
	
	Location location1 = new Location(5, 5);
	
	world.add(location1, bug);
}
}