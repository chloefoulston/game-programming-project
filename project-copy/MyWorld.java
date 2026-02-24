// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
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
        Bee bee =  new  Bee();
        addObject(bee, 289, 199);
        Bee bee2 =  new  Bee();
        addObject(bee2, 485, 119);
        Bee bee3 =  new  Bee();
        addObject(bee3, 90, 297);
    }
}
