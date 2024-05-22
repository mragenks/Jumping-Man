import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackButton extends Actor
{
    public BackButton()
    {
        GreenfootImage image = new GreenfootImage(200, 50);  // Create a new image with specified width and height
        image.setColor(new Color(0, 0, 0, 0));  // Set the background to transparent
        image.fill();  // Fill the image with the transparent color

        // Set font and size
        Font font = new Font("Arial", true, false, 24);  // Set the font to Arial, bold, size 24
        image.setFont(font);

        // Text to display
        String text = "Back";

        // Draw black outline
        image.setColor(Color.BLACK);
        image.drawString(text, 51, 31);
        image.drawString(text, 49, 31);
        image.drawString(text, 51, 29);
        image.drawString(text, 49, 29);
        image.drawString(text, 50, 30 + 1);
        image.drawString(text, 50, 30 - 1);
        image.drawString(text, 50 + 1, 30);
        image.drawString(text, 50 - 1, 30);

        // Draw white text
        image.setColor(Color.WHITE);
        image.drawString(text, 50, 30);

        setImage(image);  // Set the image to the actor
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
