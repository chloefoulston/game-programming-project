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
        rightImage =  new  GreenfootImage("P2moveRIGHT.png");
        leftImage =  new  GreenfootImage("P2moveLEFT.png");
        
        attackRight =  new  GreenfootImage("P2atkRIGHT.png");
        attackLeft =  new  GreenfootImage("P2atkLEFT.png");
    
        specialLEFT = new GreenfootImage("P2specialAtkLEFT.png");
        specialRIGHT = new GreenfootImage("P2specialAtkRIGHT.png");
        
        dieLeft = new GreenfootImage("P2deadLEFT.png");
        dieRight = new GreenfootImage("P2deadRIGHT.png");


        setImage(leftImage);
        facing = "left";
        
    }
    /**
     * Act - do whatever the wizcat wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
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
                enemy.takeDamage(10);
                coolDown=25;  
            }
        }
    }
    
    public void specialAttack()
    {
        canUseSpecial();
         if (Greenfoot.isKeyDown("control") && canUseSpecial){
            specialAtkImage();
            Player enemy = (Player)getOneIntersectingObject(Player.class);
            
            if(enemy != null){
                Greenfoot.playSound("magicAtk.wav");
                heal(10);
                enemy.takeDamage(20);  
            }
        }
    }
    
}

