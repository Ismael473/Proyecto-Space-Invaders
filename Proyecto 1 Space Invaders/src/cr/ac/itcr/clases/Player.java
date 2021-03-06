package cr.ac.itcr.clases;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player
{
    private double x;
    private double y;

    private double velX = 0;

    private Texturas texturas;

    public Player(double x, double y, Texturas texturas)
    {
        this.x = x;
        this.y = y;
        this.texturas = texturas;

    }
    public void tick()
    {
        x+=velX;

        if(x <= -10)
        {
            x = -10;
        }
        if(x >= 610)
        {
            x = 610;
        }
    }
    public void reproductor(Graphics g)
    {
        g.drawImage(texturas.cazador, (int)x,(int)y,null);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setVelX(double velX)
    {
        this.velX = velX;
    }

}
