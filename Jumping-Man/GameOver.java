import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Actor
{
    public GameOver()
    {
        GreenfootImage image = new GreenfootImage(650, 100);  // Create a new image with specified width and height
        image.setColor(new Color(0, 0, 0, 0));  // Set the background to transparent
        image.fill();  // Fill the image with the transparent color

        // Set font and size
        Font font = new Font("Arial", true, false, 48);
        image.setFont(font);

        // Text to display
        String text = "Game Over";

        // Draw black outline
        image.setColor(Color.BLACK);
        image.drawString(text, 201, 51);
        image.drawString(text, 199, 51);
        image.drawString(text, 201, 49);
        image.drawString(text, 199, 49);
        image.drawString(text, 200, 50 + 1);
        image.drawString(text, 200, 50 - 1);
        image.drawString(text, 200 + 1, 50);
        image.drawString(text, 200 - 1, 50);

        // Draw white text
        image.setColor(Color.WHITE);
        image.drawString(text, 200, 50);

        setImage(image);  // Set the image to the actor
    }

    public void addedToWorld(World world)
    {
        // Add Restart and Back to Menu buttons
        world.addObject(new RestartButton(), world.getWidth() / 2, world.getHeight() / 2 + 50);
        world.addObject(new BackToMenuButton(), world.getWidth() / 2, world.getHeight() / 2 + 100);
    }
}
