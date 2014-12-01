package me.buddyrich.agility;


import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Skill;
import org.rev317.min.api.wrappers.SceneObject;

public class Swing implements Strategy {
	
	
	@Override
	public boolean activate() {
		SceneObject[] swing = SceneObjects.getNearest(2283);
		if(swing[0].distanceTo() < 3){
			return true;
			}
		return true;
	}

	@Override
	public void execute() {
		SceneObject[] swing = SceneObjects.getNearest(2283);
		
		if(swing[0].distanceTo() < 3) {
		swing[0].interact(1);
        IkovAgility.agiLvl = Skill.getCurrentLevel(16);
		IkovAgility.jumpCount++;
		Time.sleep(2000);
		}	
	}
}