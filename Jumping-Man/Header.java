import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Header extends Actor
{
    public Header()
    {
        GreenfootImage image = new GreenfootImage(400, 100);  // Create a new image with a larger width and height
        image.setColor(new Color(0, 0, 0, 0));  // Set the background to transparent
        image.fill();  // Fill the image with the transparent color

        // Set font
        Font font = new Font("Arial", true, false, 48);
        image.setFont(font);

        // Draw black outline
        image.setColor(Color.BLACK);
        image.drawString("Jumping Man", 51, 61);
        image.drawString("Jumping Man", 49, 61);
        image.drawString("Jumping Man", 51, 59);
        image.drawString("Jumping Man", 49, 59);
        image.drawString("Jumping Man", 50, 60 + 1);
        image.drawString("Jumping Man", 50, 60 - 1);
        image.drawString("Jumping Man", 50 + 1, 60);
        image.drawString("Jumping Man", 50 - 1, 60);

        // Draw white text
        image.setColor(Color.WHITE);
        image.drawString("Jumping Man", 50, 60);

        setImage(image);  // Set the image to the actor
    }
}
