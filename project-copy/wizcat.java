import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class wizcat extends Player
{
    
    public wizcat()
    {
        rightImage=new GreenfootImage("wizRight.png");
        leftImage=new GreenfootImage("wizLeft.png");
        setImage(leftImage);
    }
    /**
     * Act - do whatever the wizcat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        applyGravity();
        jump();
    }
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            setImage(leftImage);
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            setImage(rightImage);
            move(5);
        }
    }
    public void jump()
    {
        if (Greenfoot.isKeyDown("up") && getY()>=vSpeed && getY()== 270) {
            vSpeed=jumpPower;
        }
    }
}
