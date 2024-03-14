package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Umbrella {
    private final int x;
    private final int y;
    Color colorOfUmbrella;
    public Umbrella(int x, int y) {
        this.x = x;
        this.y = y;

        Random random = new Random();
        List<Color> listOfColorsForUmbrella = new ArrayList<>(List.of(Color.GREEN, Color.CYAN,
                Color.MAGENTA));
        colorOfUmbrella = listOfColorsForUmbrella.get(random.nextInt(listOfColorsForUmbrella.size()));
    }
    public void drawUmbrella(Graphics2D graphics2D) {
        GeneralPath gpForTube = new GeneralPath();

        graphics2D.setColor(Color.GRAY);
        graphics2D.fillRect(x, y - 130, 8, 130);
        gpForTube.moveTo(x, y);
        gpForTube.curveTo(x, y, x + 4, y + 5, x + 8, y);
        graphics2D.fill(gpForTube);
        graphics2D.setColor(colorOfUmbrella);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(x - 71, y - 130);
        gp.curveTo(x - 71, y - 130, x + 4, y - 90, x + 79, y - 130);
        gp.lineTo(x + 4, y - 210);
        gp.lineTo(x - 71, y - 130);
        graphics2D.fill(gp);
    }
}
