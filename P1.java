import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class P1 extends Player
{
    public P1()
    {
        rightImage =  new  GreenfootImage("dev-RIGHT.png");
        leftImage =  new  GreenfootImage("dev-LEFT.png");
        attackRight =  new  GreenfootImage("dev-ATT-RIGHT.png");
        attackLeft =  new  GreenfootImage("dev-ATT-LEFT.png");
        setImage(rightImage);
        facing = "right";
        
    }

    public void act()
    {
       super.act(); 
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
        }
    }
    
    public void takeDamage(int amount)
    {
        health -= amount;        
    }
    
    public void attack()
    {
         while (Greenfoot.isKeyDown("s")&& coolDown == 0){
            fightingImage();
            Player enemy = (Player)getOneIntersectingObject(Player.class);
            
            if(enemy != null){
                enemy.takeDamage(10);
                coolDown=80;
            }
        }
    }
} 

