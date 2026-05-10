import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public abstract class Player extends Actor
{
    protected GreenfootImage rightImage = null;
    protected GreenfootImage leftImage = null;
    protected GreenfootImage attackRight = null;
    protected GreenfootImage attackLeft = null;
    protected GreenfootImage dieRight = null;
    protected GreenfootImage dieLeft = null;
    protected GreenfootImage specialLEFT = null;
    protected GreenfootImage specialRIGHT = null;
    protected String facing;
    protected String winner;
    
    protected static final int MAX_HEALTH = 100;
    protected int health = MAX_HEALTH;
    
    protected final int GRAVITY = 1;
    protected int vSpeed = 4;
    protected int jumpPower = -15;
    protected int ground = 270;   
    
    protected int coolDown = 0;
    protected HealthBar healthBar;
    protected int endTimer = -1;
    protected static int wins;
    protected boolean canUseSpecial = false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        move();
        applyGravity();
        jump();
        attack();
        specialAttack();
        reduceCooldown();
        die();
         if (endTimer > 0){
            endTimer--;
            if (endTimer == 0){
            Greenfoot.setWorld(new endGameWorld(winner));
            }
            return;
        }
    }
    public abstract void move();
    
    public abstract void jump();
    
    public abstract void attack();
    public abstract void specialAttack();
    /**
     * getDirection - returns the direction the player is facing
     */
    public String getDirection()
    {
        return facing;
    }
    
    /**
     * applyGravity - applies gravity to the player to allow jumping
     */
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
    
    public boolean isOnGround(){
        return getY() >= ground;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void reduceCooldown()
    {
        if (coolDown > 0)
        {
            coolDown--;
        }
    }
    
    public void setHealthBar(HealthBar bar)
    {
        healthBar = bar;
        healthBar.updateBar();
    }
    
    public void takeDamage(int amount)
    {
        if (!isOnGround()){
            return;
        }
        health -= amount;
        if (health < 0){
            health = 0;
        }
        if (healthBar != null){
            healthBar.updateBar();
        }
        
         if (health == 0){
            if (this instanceof P1){
            winner = "P2"; 
            }else if (this instanceof P2){
            winner = "P1";
            }
            deathImage();
            getWorld().showText(getClass().getName() + " loses!", 300, 100);
            endTimer = 180;
        }
    }
    
    public void die()
    {
        if(health == 0){
            deathImage();
        }
    }
    
    public void walkingImage()
    {
        if(getDirection().equals("left")){
            setImage(leftImage);
        }
        if(getDirection().equals("right")){
            setImage(rightImage);
        }        
    }
    
    public void fightingImage()
    {
        if(getDirection().equals("left")){
            setImage(attackLeft);
        }
        if(getDirection().equals("right")){
            setImage(attackRight);
        }
    }
    
    public void deathImage()
    {
        if(getDirection().equals("left")){
            setImage(dieLeft);
        }
        if(getDirection().equals("right")){
            setImage(dieRight);
        }      
    }
    public void specialAtkImage()
    {
        if(getDirection().equals("left")){
            setImage(specialLEFT);
        }
        if(getDirection().equals("right")){
            setImage(specialRIGHT);
        }      
        
    }
    public void resetWins()
    {
        wins = 0;
    }
    public void canUseSpecial()
    {
        if (health <= 30){
            canUseSpecial = true;
        }else{
            canUseSpecial = false;
        }
    }
    public void heal(int amount)
    {
        health += amount;
        if (health > MAX_HEALTH)
        {
            health = MAX_HEALTH;
        }
        if (healthBar != null)
        {
            healthBar.updateBar();
        }
    }
}
