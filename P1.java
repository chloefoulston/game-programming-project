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
        rightImage =  new  GreenfootImage("P1moveRIGHT.png");
        leftImage =  new  GreenfootImage("P1moveLEFT.png");
        
        attackRight =  new  GreenfootImage("P1atkRIGHT.png");
        attackLeft =  new  GreenfootImage("P1atkLEFT.png");
    
        specialLEFT = new GreenfootImage("P1specialAtkLEFT.png");
        specialRIGHT = new GreenfootImage("P1specialAtkRIGHT.png");
        
        dieLeft = new GreenfootImage("P1deadLEFT.png");
        dieRight = new GreenfootImage("P1deadRIGHT.png");
        
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
                enemy.takeDamage(10);
                coolDown=25;   
            }
        }
    }
    public void specialAttack()
    {
        canUseSpecial();
         if (Greenfoot.isKeyDown("q") && canUseSpecial){
            specialAtkImage();
            Player enemy = (Player)getOneIntersectingObject(Player.class);
            
            if(enemy != null){
                Greenfoot.playSound("airAtk.wav");
                heal(10);
                enemy.takeDamage(20);  
            }
        }
    }
   
} 

