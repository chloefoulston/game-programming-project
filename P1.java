import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class P1 extends Player
{

    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/

    /**
     * 
     */
    public P1()
    {
        rightImage =  new  GreenfootImage("dev-RIGHT.png");
        leftImage =  new  GreenfootImage("dev-LEFT.png");
        attackRight =  new  GreenfootImage("dev-ATT-RIGHT.png");
        attackLeft =  new  GreenfootImage("dev-ATT-LEFT.png");
        setImage(rightImage);
        attack = "s";
    }

    /**
     * Act - do whatever the devil wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        applyGravity();
        jump();
        attack();
    }

    /**
     * 
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("a")) {
            setImage(leftImage);
            move(-5);
        }
        if (Greenfoot.isKeyDown("d")) {
            setImage(rightImage);
            move(5);
        }
    }

    /**
     * 
     */
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
    /**
     * 
     */
    public void attack()
    {
        if (Greenfoot.isKeyDown("s")){
            Player enemy = (Player)getOneIntersectingObject(Player.class);
            if(enemy != null){
                enemy.takeDamage(10);
            }
        }
    }
} 

