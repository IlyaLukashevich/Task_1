package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sea;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Buoy {
    private int x;
    private int y;
    private final boolean isLampOn;
    private int shift;
    public Buoy(int x, int y, boolean isLampOn) {
        this.x = x;
        this.y = y;
        this.isLampOn = isLampOn;
        shift = (Math.random() > 0.5) ? 1: -1;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void draw(Graphics2D graphics2D) {
        Random random = new Random();

        GeneralPath generalPath = new GeneralPath();
        graphics2D.setColor(new Color(255, 69, 0));
        graphics2D.fillRect(x, y, 20, 5);
        graphics2D.fillRect(x + 5, y - 20, 10, 20);
        generalPath.moveTo(x + 5, y - 20);
        generalPath.curveTo(x + 5, y - 20, x + 10, y - 30, x + 15, y - 20);
        graphics2D.fill(generalPath);

        graphics2D.setColor(Color.BLACK);
        graphics2D.fillRect(x + 5, y - 15, 10, 5);
        graphics2D.setColor(Color.BLUE);

        GeneralPath gp = new GeneralPath();
        gp.moveTo(x, y + 5);
        graphics2D.setColor(new Color(28,163,236));
        gp.curveTo(x - 3, y + 5,x - 2 + random.nextDouble(26) , y - 2, x + 23, y + 5);
        graphics2D.fill(gp);

        graphics2D.setColor((isLampOn)? Color.YELLOW: Color.GRAY);
        graphics2D.fillOval(x + 5, y - 33, 10,10);
    }

    public int getY() {
        return y;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
}
