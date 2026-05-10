import lang.stride.*;
import greenfoot.*;
import greenfoot.Color;

/**
 * 
 */
public class HealthBar extends Actor
{
    private Player player;

    private int width = 150;
    private int height = 20;

    public HealthBar(Player trackedPlayer)
    {
        player = trackedPlayer;
        updateBar();
    }

    public void updateBar()
    {
        GreenfootImage image =
        new GreenfootImage(width, height);

        image.setColor(Color.DARK_GRAY);
        image.fillRect(0, 0, width, height);

        image.setColor(Color.RED);

        int healthWidth =
        (int)((double)player.getHealth()
        / Player.MAX_HEALTH * width);

        image.fillRect(0, 0, healthWidth, height);

        image.setColor(Color.WHITE);
        image.drawRect(0, 0, width - 1, height - 1);
         image.setColor(Color.WHITE);
        image.drawString(
        player.getHealth() + "/" + Player.MAX_HEALTH,
        45,
        15);
        setImage(image);
    }
}
