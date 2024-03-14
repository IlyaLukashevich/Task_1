package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carpet {
    private final int x;
    private final int y;
    private final List<Color> colorsOfCarpet = new ArrayList<>();
    public Carpet(int x, int y) {
        this.x = x;
        this.y = y;

        Random random = new Random();
        List<Color> colorsOfCarpet = new ArrayList<>(List.of(new Color(255, 102, 102), new Color(255, 79, 79),
                new Color(255, 57, 57), new Color(255, 37, 37), new Color(255, 18, 18)));
        for (int i = 0; i < 20; i++) {
            this.colorsOfCarpet.add(colorsOfCarpet.get(random.nextInt(colorsOfCarpet.size())));
        }

    }
    public void drawCarpet(Graphics2D graphics2D) {
        graphics2D.setColor(Color.DARK_GRAY);
        graphics2D.setStroke(new BasicStroke(5));

        for (int i = 0; i < 20; i++) {
            graphics2D.setColor(colorsOfCarpet.get(i));
            graphics2D.drawLine(x + i * 3, y + i * 4, x + i * 3 + 60, y + i * 4);
        }

        graphics2D.setColor(new Color(255, 0, 0));
        graphics2D.drawLine(x - 1, y, x + 59, y + 80);
        graphics2D.drawLine(x + 60, y + 80, x + 120, y + 80);
        graphics2D.drawLine(x + 120, y + 80, x + 60, y);
        graphics2D.drawLine(x + 60, y, x, y);
    }
}
