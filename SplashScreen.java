import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class splashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{

    /**
     * Constructor for objects of class splashScreen.
     * 
     */
    private int timer = 180;

    public SplashScreen()
    {
        super(600, 400, 1);

        setBackground("splashScreen.png");
    }

    public void act()
    {
        timer--;

        if (timer == 0)
        {
            Greenfoot.setWorld(new startWorld());
        }
    }
}

