import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class P2 extends Player
{
    private HealthBar healthBar;
    public P2()
    {
        rightImage = new GreenfootImage("wiz-RIGHT.png");
        leftImage=new GreenfootImage("wiz-LEFT.png");
        attackRight = new GreenfootImage("wATR.png");
        attackLeft = new GreenfootImage("wATL.png");
        setImage(leftImage);
        facing = "left";
        healthBar = new HealthBar(100);
    }
    /**
     * Act - do whatever the wizcat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        if(Greenfoot.isKeyDown("down")){
            takeDamage();
            
        }
    }
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            facing = "left";
            walkingImage();
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            facing = "right";
            walkingImage();
            move(5);
        }
    }
    
    public void jump()
    {
        if (Greenfoot.isKeyDown("up") && getY()>=vSpeed && getY()== 270) {
            vSpeed=jumpPower;
            Greenfoot.playSound("jump.mp3");
        }
    }
    public void attack()
    {
        while (Greenfoot.isKeyDown("down")&& coolDown == 0){
            fightingImage();
            Player enemy = (Player)getOneIntersectingObject(Player.class);
            
            if(enemy != null){
                Greenfoot.playSound("wand.mp3");
                
                coolDown=80;
            }
        }
    }

    public void takeDamage()
    {
       world w =(world)getWorld();
        w.getHealthBar2().loseHealth(10);
    }
}

