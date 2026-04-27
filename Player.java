import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player extends Actor
{
    protected GreenfootImage rightImage = null;
    protected GreenfootImage leftImage = null;
    protected GreenfootImage attackRight = null;
    protected GreenfootImage attackLeft = null;
    protected static final int MAX_HEALTH = 100;
    protected int health = 100;
    protected final int GRAVITY = 1;
    protected int vSpeed = 4;
    protected int jumpPower = -15;
    protected int ground = 270;      
    protected String attack = null;
    protected String specialAbility;
    protected int coolDown = 0;
    protected String facing;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        move();
        applyGravity();
        jump();
        
        if ((coolDown > 0)){
            coolDown --;
            
        }else{
            attack();
        }
    }
    public void move()
    {
    }
    public void jump()
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
    public void takeDamage(int amount)
    {
        health = health - amount;        
    }
    public void attack()
    {}
}
