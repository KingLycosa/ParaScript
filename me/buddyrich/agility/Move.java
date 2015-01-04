package me.buddyrich.agility;


import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.wrappers.SceneObject;

public class Move implements Strategy {
	
	
	@Override
    public boolean activate() {
        SceneObject swing = getSwing();
        //Check if the Object Exist.
        if(swing != null) {
            if (swing.distanceTo() > 3) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void execute() {
        SceneObject swing = getSwing();

        if(swing != null) {
            if (swing.distanceTo() > 3) {
                swing.getLocation().walkTo();
                Time.sleep(500);
            }
        }
    }

    /**
     * Gets the SceneObject
     * @return The SceneObject.
     */
    private SceneObject getSwing(){
        for(SceneObject swing : SceneObjects.getNearest(2283)){
            if(swing != null){
                return swing;
            }
        }
        return null;
    }
}
