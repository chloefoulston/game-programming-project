import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CoreArena extends World
{    
    /**
     * Constructor for objects of class world.
     */
    public CoreArena()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
        P2 wizcat =  new P2();
        addObject(wizcat, 485, 270);
        P1 devil =  new P1();
        addObject(devil, 111, 270);
        
        HealthBar P1Bar = new HealthBar(devil);
        HealthBar P2Bar = new HealthBar(wizcat);

        addObject(P1Bar, 105, 32);
        addObject(P2Bar, 505, 32);
        devil.setHealthBar(P1Bar);
        wizcat.setHealthBar(P2Bar);
        
    }
   
    }
