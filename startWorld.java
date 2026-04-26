import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class startWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class startWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private GreenfootImage startButton;
    /**
     * Constructor for objects of class startWorld.
     */
    public startWorld()
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
        StartButton startButton =  new  StartButton();
        addObject(startButton, 293, 114);
    }
}
