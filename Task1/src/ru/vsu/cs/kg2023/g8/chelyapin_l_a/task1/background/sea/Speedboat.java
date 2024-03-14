package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sea;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Speedboat {
    private final int x;
    private final int y;
    public Speedboat(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void drawBoat(Graphics2D graphics2D) {
        graphics2D.setStroke(new BasicStroke(1));
        graphics2D.setColor(new Color(115,133,149));

        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(x, y);
        gp1.lineTo(x + 150, y);
        gp1.curveTo(x + 150,y, x + 170, y, x + 200,y - 50);
        gp1.lineTo(x, y - 50);
        gp1.lineTo(x,y);

        gp1.moveTo(x + 60, y - 50);
        gp1.lineTo(x + 70, y - 100);
        gp1.lineTo(x + 120, y - 100);
        gp1.lineTo(x + 140, y - 50);
        graphics2D.fill(gp1);

        graphics2D.setColor(new Color(187,231,210));
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(x + 97,y - 90);
        gp2.lineTo(x + 123,y - 90);
        gp2.lineTo(x + 135, y - 60);
        gp2.lineTo(x + 97,y - 60);
        graphics2D.fill(gp2);

        graphics2D.setColor(Color.DARK_GRAY);
        graphics2D.drawLine(x + 60, y - 50, x + 140, y - 50);
        graphics2D.setFont(new Font("Consolas", Font.PLAIN, 20));
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawString("Охрана", x + 61, y - 20);
    }
}
