import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyWorld extends World
{
    //private GreenfootSound backgroundMusic = new GreenfootSound("bs.mp3");
    
    public FlappyWorld()
    {    
        super(600, 400, 1);
        addObject(new Player(-1.3), 100, 300);
        addObject(new Pipe(), 300, 175);
        addObject(new Pipe(), 600, 175);
        addObject(new Score(), 300, 100); 
        //addObject(new MenuButton(), 50, 50);  // Adding the Menu button
        //backgroundMusic.playLoop();
    }

    public void gameOver()
    {
        addObject(new GameOver(), getWidth() / 2, getHeight() / 2);
    }
}
