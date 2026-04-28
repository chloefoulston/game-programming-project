import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class P1 extends Player
{
    private HealthBar healthBar;
    
    public P1()
    {
        rightImage =  new  GreenfootImage("dev-RIGHT.png");
        leftImage =  new  GreenfootImage("dev-LEFT.png");
        attackRight =  new  GreenfootImage("dev-ATT-RIGHT.png");
        attackLeft =  new  GreenfootImage("dev-ATT-LEFT.png");
        setImage(rightImage);
        facing = "right";
        healthBar = new HealthBar(100);
        
    }

    public void act()
    {
       super.act(); 
       
       
       if(Greenfoot.isKeyDown("s")){
           takeDamage();
       }
    }

    public void move()
    {
        if (Greenfoot.isKeyDown("a")) {
            facing = "left";
            walkingImage();
            move(-5);
        }
        if (Greenfoot.isKeyDown("d")) {
            facing = "right";
            walkingImage();
            move(5);
        }
    }
    
    public void jump()
    {
        if (Greenfoot.isKeyDown("w") && getY() >= vSpeed && getY() == 270) {
            vSpeed = jumpPower;
            Greenfoot.playSound("jump.mp3");
        }
    }
    
    public void attack()
    {
         while (Greenfoot.isKeyDown("s")&& coolDown == 0){
            fightingImage();
            Player enemy = (Player)getOneIntersectingObject(Player.class);
            
            if(enemy != null){
                
                Greenfoot.playSound("punch.mp3");
                
                coolDown=80;
        }
            
        }
    }
    
    public void takeDamage()
    {
        world w = (world)getWorld();
        w.getHealthBar1().loseHealth(10);
    }
} 

