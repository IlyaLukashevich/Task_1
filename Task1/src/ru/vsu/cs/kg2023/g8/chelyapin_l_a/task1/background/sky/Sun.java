package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sky;

import java.awt.*;

public class Sun {
    private final int x;
    private final int y;
    public Sun(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void drawSun(Graphics2D graphics2D) {
        Stroke oldStroke = graphics2D.getStroke();
        graphics2D.setStroke(new BasicStroke(3));
        graphics2D.setColor(Color.YELLOW);
        graphics2D.fillOval(x,y, 100,100);

        double factor = Math.PI/ 10;
        int r = 70;
        int R = 100;
        for (int i = 0; i < 20; i++) {
            double k = factor * i;
            double x1 = r * Math.cos(k) + x + 50;
            double y1 = r * Math.sin(k) + y + 50;
            double x2 = R * Math.cos(k) + x + 50;
            double y2 = R * Math.sin(k) + y + 50;

            graphics2D.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
        graphics2D.setStroke(oldStroke);
    }
}
