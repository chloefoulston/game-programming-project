// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class world extends World
{

    /**
     * Constructor for objects of class world.
     */
    public world()
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
        devil devil =  new  devil();
        addObject(devil, 111, 270);
        wizcat wizcat =  new  wizcat();
        addObject(wizcat, 485, 270);
    }
}
