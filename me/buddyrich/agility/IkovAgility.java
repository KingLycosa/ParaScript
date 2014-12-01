package me.buddyrich.agility;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.framework.Strategy;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.api.interfaces.Paintable;
import org.rev317.min.api.methods.Skill;



@ScriptManifest(author = "buddyrich", category = Category.AGILITY, description = "Trains agility at the wilderness ropeswing for awesome xp/h", name = "buddyAgility", servers= { "Ikov" }, version = 1)
public class IkovAgility extends Script implements Paintable {
	
	private final ArrayList<Strategy> strat = new ArrayList<Strategy>();
	
	@Override
	public boolean onExecute() {
		strat.add(new Agility());
		provide(strat);
		return true;
	}
	
    private final Font font1 = new Font("Consolas", Font.BOLD, 12);
    private final Font font2 = new Font("Consolas", Font.PLAIN, 12);
	public static int jumpCount = 0;
    public static int agiLvl = Skill.getCurrentLevel(16);
	
	@Override
    public void paint(Graphics GFX) {
        Graphics2D g = (Graphics2D)GFX;
        g.setFont(font1);
        g.setColor(Color.red);
        g.drawString("buddyAgility", 5, 300);
        g.setFont(font2);
        g.setColor(Color.white);
        g.drawString("Jump count: " +jumpCount, 5, 315);
        g.drawString("Agility level: " +agiLvl, 5, 330);
    }
	
	
	@Override
	public void onFinish() {
		System.out.println("l8a");
	}
	
}