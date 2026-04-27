// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;
import greenfoot.Color;

/**
 * 
 */
public class HealthBar extends Player
{
    protected int health = 4;
    protected int healthBarWidth = 80;
    protected int healthBarHeight = 15;
    protected int pixelsPerHealthPoint = ( int ) healthBarWidth / health;

    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
        update ( );
    }

    /**
     * 
     */
    public void act()
    {
        update ( );
    }

    /**
     * 
     */
    public void update()
    {
        setImage ( new GreenfootImage ( healthBarWidth + 2 , healthBarHeight + 2 ) );
        GreenfootImage myImage = getImage ( );
        myImage . setColor ( Color . WHITE );
        myImage . drawRect ( 0 , 0 , healthBarWidth + 1 , healthBarHeight + 1 );
        myImage . setColor ( Color . RED );
        myImage . fillRect ( 1 , 1 , health * pixelsPerHealthPoint , healthBarHeight );
    }

    /**
     * 
     */
    public void loseHealth()
    {
        health = health - 1;
    }
}
