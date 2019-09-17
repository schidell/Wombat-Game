import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         
        if (Greenfoot.isKeyDown("right"))
        {
            move (5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move (-5);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation (getX (), getY () - 5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation (getX (), getY () + 5);
        }
        if (isTouching (Ant.class))
        {
            removeTouching(Ant.class);
        }
    }
}
