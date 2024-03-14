package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sky;

import java.awt.*;

public class Cloud {
   private int x,y;
   public Cloud(int x, int y) {
       this.x = x;
       this.y = y;
   }
    public void drawCloud(Graphics2D graphics2D) {
        Color c = new Color(250, 250, 250);
        graphics2D.setColor(c);

        graphics2D.fillOval(40 + x, 40 + y, 20, 20);
        graphics2D.fillOval(55 + x, 30 + y, 25, 25);
        graphics2D.fillOval(75 + x, 35 + y, 23, 23);
        graphics2D.fillOval(95 + x, 45 + y, 15, 15);
        graphics2D.fillOval(80 + x, 50 + y, 23, 23);
        graphics2D.fillOval(53 + x, 48 + y, 30, 30);
    }
}
