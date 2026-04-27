import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player extends Actor
{
    protected GreenfootImage rightImage;
    protected GreenfootImage leftImage;
    protected GreenfootImage attackRight;
    protected GreenfootImage attackLeft;
    protected int vSpeed = 4;
    protected final int GRAVITY = 1;
    protected int jumpPower = -15;
    protected int ground = 270;
    protected int health = 100;
      
    protected String attack;
    protected String specialAbility;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    public void applyGravity()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed += GRAVITY;

        if (getY() >= ground)
        {
            setLocation(getX(), ground);
            vSpeed = 0;
        }
    }
}
