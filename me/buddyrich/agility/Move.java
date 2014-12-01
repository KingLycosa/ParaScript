package me.buddyrich.agility;


import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

public class Move implements Strategy {
	
	
	@Override
	public boolean activate() {
		SceneObject[] swing = SceneObjects.getNearest(2283);
		if(swing[0].distanceTo() > 3){
			return true;
			}
		return false;
	}

	@Override
	public void execute() {
		SceneObject[] swing = SceneObjects.getNearest(2283);
		
		if(swing[0].distanceTo() > 3) {
		swing[0].getLocation().walkTo();
		Time.sleep(500);
		}	
	}
}