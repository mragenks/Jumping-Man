import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionsWorld extends World
{
    public InstructionsWorld()
    {    
        super(600, 400, 1); 
        
        // Set font and size
        Font font = new Font("Arial", true, false, 36); // Increased font size to 36
        GreenfootImage background = getBackground();
        background.setFont(font);
        
        // Display instructions
        showText("Instructions: Use the spacebar to flap.\nAvoid the pipes to score points.", getWidth() / 2, getHeight() / 2);
        
        // Add back button
        addObject(new BackButton(), getWidth() / 2, getHeight() - 100);
    }
}
