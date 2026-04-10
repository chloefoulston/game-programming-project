import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class wizcat extends Actor
{

    /**
     * Act - do whatever the wizcat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(4);
        }
    }
}
