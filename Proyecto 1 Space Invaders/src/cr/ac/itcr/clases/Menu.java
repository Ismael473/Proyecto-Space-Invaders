package cr.ac.itcr.clases;

import java.awt.*;

public class Menu
{
    /**
     * Objetivo: Es la pantalla inicial del juego en la cual se aparecen los botones para información e inicio de juego
     */
    public Rectangle playB = new Rectangle(Juego.WIDTH/2+120,470,100,50);
    public Rectangle infoB = new Rectangle(Juego.WIDTH/2+120,535,100,50);

    public void reproductor(Graphics graphics)
    {
        Graphics2D g2D = (Graphics2D) graphics;

        Font f = new Font("arial",Font.BOLD,30);
        graphics.setFont(f);
        graphics.setColor(Color.WHITE);
        graphics.drawString("Play", playB.x+20, playB.y+35);
        g2D.draw(playB);
        graphics.drawString("Info", infoB.x+20, infoB.y+35);
        g2D.draw(infoB);

    }
}
