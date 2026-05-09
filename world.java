// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class world extends World
{
    private StartButton startButton;
    private P1 player1;
    private P2 player2;
    private HealthBar healthBar1;
    private HealthBar healthbar2;
    
    
    /**
     * Constructor for objects of class world.
     */
    public world()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
        P2 wizcat =  new P2();
        addObject(wizcat, 485, 270);
        P1 devil =  new P1();
        addObject(devil, 111, 270);
        
        healthBar1 = new HealthBar(100);
        healthbar2 = new HealthBar(100);
        addObject(healthBar1, 100, 30);
        addObject(healthbar2, getWidth() -100, 30);
        
    }
    public HealthBar getHealthBar1()
    {
        return healthBar1;
    }
    public HealthBar getHealthBar2()
    {
        return healthbar2;
    }
    }
