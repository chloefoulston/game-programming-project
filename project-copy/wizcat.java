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
        jumpButton = "up";
        moveLeft = "left";
        moveRight = "right";
        
        move();
        applyGravity();
        jump();
        
    }
    public void move()
    {
        if (Greenfoot.isKeyDown(moveLeft)) {
            setImage(leftImage);
            move(-5);
        }
        if (Greenfoot.isKeyDown(moveRight)) {
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
