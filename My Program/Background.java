import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends MyWorld
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ant ant = new Ant();
        addObject(ant,292,390);
        ant.setLocation(104,379);
        ant.setLocation(200,379);
        ant.setLocation(63,96);
    }
}
