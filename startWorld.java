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
    private GreenfootSound bgMusic = new GreenfootSound("startWorld.mp3");
    
    /**
     * Constructor for objects of class startWorld.
     */
    public startWorld()
    {
        super(600, 400, 1);      
        prepare();
        
    
    }
    public GreenfootSound getMusic(){
        return bgMusic;
    }
    public void started()
    {
        bgMusic.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton =  new  StartButton();
        addObject(startButton, 293, 114);

        startButton.setLocation(298,116);
        startButton.setLocation(301,132);
    }

    public void stopped()
    {    
        bgMusic.pause();
    }

}
