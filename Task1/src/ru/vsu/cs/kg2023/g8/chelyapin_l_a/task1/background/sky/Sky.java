package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sky;

import java.awt.*;

public class Sky {
    public void paintSky(Graphics2D graphics2D) {
        graphics2D.setPaint(new LinearGradientPaint(0, 250, 0, 0, new float[]{0f, 0.7f}, new Color[]{
                new Color(135, 206, 250), new Color(0, 191, 255)
        }));
        graphics2D.fillRect(0,0,1000,250);
    }
}
