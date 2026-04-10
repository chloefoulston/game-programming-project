import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class devil extends Actor
{

    /**
     * Act - do whatever the devil wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
        }
    }
}
