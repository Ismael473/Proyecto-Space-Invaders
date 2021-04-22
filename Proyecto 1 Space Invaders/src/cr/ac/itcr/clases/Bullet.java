
package cr.ac.itcr.clases;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Bullet
{
    private double x;
    private double y;

    BufferedImage image;

    public Bullet(double x, double y,Juego juego)
    {
        this.x = x;
        this.y = y;

        SpriteSheet ss = new SpriteSheet(juego.getSprite());
        image = ss.grabImage(2,1,32,32);
    }

    public void tick()
    {
        y -= 10;
    }

    public void reproductor(Graphics g)
    {
        g.drawImage(image,(int)x,(int)y,null);
    }

    public double getY()
    {
        return y;
    }
}
