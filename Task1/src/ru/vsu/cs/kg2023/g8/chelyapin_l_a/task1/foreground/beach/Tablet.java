package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Tablet {
    private final int x;
    private final int y;
    public Tablet(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void drawTablet(Graphics2D graphics2D) {
        graphics2D.setColor(new Color(121,85,61));
        graphics2D.fillRect(x, y, 15, 80);
        graphics2D.fillRect(x  + 135, y, 15,80);

        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(x, y + 80);
        gp1.curveTo(x, y + 80, x + 7, y + 84, x + 15, y + 80);
        graphics2D.fill(gp1);

        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(x + 135, y + 80);
        gp2.curveTo(x + 135, y + 80, x + 142, y + 84, x + 150, y + 80);
        graphics2D.fill(gp2);

        graphics2D.setColor(new Color(240,233,219));
        graphics2D.fillRect(x - 15, y - 40, 178, 40);

        graphics2D.setColor(Color.DARK_GRAY);
        graphics2D.setFont(new Font("Consolas", Font.PLAIN, 14));
        graphics2D.drawString("За буйки не заплывать", x - 10, y - 20);
    }
}
