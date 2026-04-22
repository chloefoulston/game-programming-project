import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class devil extends Player
{
    
    public devil()
    {
        rightImage=new GreenfootImage("devilRight.png");
        leftImage=new GreenfootImage("devilLeft.png");
        setImage(rightImage);
        jumpButton = "w";
        moveLeft = "a";
        moveRight = "d";
        
    }
    /**
     * Act - do whatever the devil wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
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
        if (Greenfoot.isKeyDown("w") && getY()>=vSpeed && getY()== 270) {
            vSpeed=jumpPower;
        }
    }
}
