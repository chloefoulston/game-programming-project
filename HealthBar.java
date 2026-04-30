import lang.stride.*;
import greenfoot.*;
import greenfoot.Color;

/**
 * 
 */
public class HealthBar extends Player
{
    protected int health;
    protected int maxHealth;
    protected int barWidth =100;
    protected int barHeight = 15;
    protected int pixelsPerHealthPoint;
    
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar(int max)
    {
        maxHealth = max;
        health = max;
        pixelsPerHealthPoint = barWidth / maxHealth;
        update();
    }

    /**
     * 
     */
    public void act()
    {
        update();
    }
    public void loseHealth(int amount)
    {
        health -= amount;
        if(health < 0) {
            health = 0;
            update();
        }
    }
    public void gainHealth(int amount)
    {
        health += amount;
        if(health > maxHealth){
            health = maxHealth;
            update();
        }
    }

    /**
     * 
     */
    public void update()
    {
        GreenfootImage img = new GreenfootImage(barWidth + 2, barHeight + 2);
        img.setColor(Color.BLACK);
        img.drawRect(0, 0, barWidth + 1, barHeight + 1);
        img.setColor(Color.GRAY);
        
        img.fillRect(1, 1, barWidth, barHeight);
        
        img.setColor(Color.RED);
        int healthWidth = (int) ((double)health / maxHealth * barWidth);
        
        img.fillRect(1, 1, healthWidth, barHeight);
        setImage(img);
    }
}
