package me.buddyrich.agility;


import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Skill;
import org.rev317.min.api.wrappers.SceneObject;

public class Agility implements Strategy {
	
	
	@Override
	public boolean activate() {
		SceneObject[] swing = SceneObjects.getNearest(2283);
		if(swing[0].distanceTo() < 3){
			swing[0].interact(1);
            IkovAgility.agiLvl = Skill.getCurrentLevel(16);
			IkovAgility.jumpCount++;
			Time.sleep(2000);

		}
		if(swing[0].distanceTo() > 3){
			swing[0].getLocation().walkTo();
			Time.sleep(1000);

		}
		
		
		
		return true;
	}

	@Override
	public void execute() {
		
	}
	
	
	
}
