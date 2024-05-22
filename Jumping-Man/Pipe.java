import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pipe extends Actor
{
    private static final int PIPE_WIDTH = 512;
    private static final int PIPE_HEIGHT = 900;
    private static final int PIPE_GAP = 300;  // Increase this value to make the gap larger
    private static final int WORLD_HEIGHT = 600;  // Adjust to match your world height

    public Pipe() {
        GreenfootImage image = getImage();
        image.scale(PIPE_WIDTH, PIPE_HEIGHT);
    }

    public void act() 
    {
        if (Player.isAlive()) {
            setLocation(getX() - 1, getY());
        }
        if (getX() <= 1) {
            // Calculate new y-position to ensure a larger gap and prevent pipes from going out of bounds
            int newY = Greenfoot.getRandomNumber(WORLD_HEIGHT - PIPE_GAP) + PIPE_GAP / 2;
            setLocation(getX() + 700, newY);
        }
    }
}
