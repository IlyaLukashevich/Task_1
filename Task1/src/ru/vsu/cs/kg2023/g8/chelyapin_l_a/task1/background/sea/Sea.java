package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sea;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class Sea {
    List<Buoy> buoys = new ArrayList<>();
    public Sea() {
        for (int i = 0; i < 20; i++) {
            buoys.add(new Buoy(i * 50 + 5, 290 + ((int) (Math.random() * 10)), Math.random() > 0.5));
        }
    }
    public void drawSea(Graphics2D graphics2D) {
        graphics2D.setPaint(new LinearGradientPaint(0, 500, 0, 250, new float[] {0f, 0.3f, 0.6f, 0.9f},
                new Color[]{new Color(116,204,244), new Color(116,204,244), new Color(28,163,236), new Color(35,137,218)}));

        GeneralPath generalPath = new GeneralPath();
        graphics2D.fillRect(0,250, 1000, 250);
        generalPath.moveTo(0,500);
        generalPath.curveTo(0, 500, 500, 570, 1000, 500);
        graphics2D.setColor(new Color(116,204,244));
        graphics2D.fill(generalPath);

        for (Buoy buoy : buoys) {
            buoy.draw(graphics2D);
        }
    }

    public List<Buoy> getBuoys() {
        return buoys;
    }
}
