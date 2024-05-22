import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuButton extends Actor
{
    public MenuButton()
    {
        GreenfootImage image = new GreenfootImage("menu", 24, Color.WHITE, Color.BLACK);
        setImage(image);
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
