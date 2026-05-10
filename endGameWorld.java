import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endGameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endGameWorld extends World
{
    /**
     * Constructor for objects of class endGameWorld.
     * 
     */
    public endGameWorld(String winner)
    {    
        super(600, 400, 1);
        
        if (winner.equals("P1"))
        {
            setBackground("devWin.png");
            showText("PLAYER 1 WINS!", 295, 355);
            showText("press space to play again", 295, 385);
        }
        else if (winner.equals("P2"))
        {
            setBackground("wizWin.png");
            showText("PLAYER 2 WINS!", 295, 355);
            showText("press space to play again", 295, 385);
        }
        
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new CoreArena());
        }
    }
}
