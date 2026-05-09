import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class StartButton extends Actor
{

    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mousePressed(this)) {
            startWorld start = (startWorld)getWorld();
            start.getMusic().stop();
            Greenfoot.playSound("Cloud Click.wav");
            Greenfoot.setWorld( new  world());
        }
    }
    
}
