package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Beach {
    private final List<List<Color>> colorsOfSand = new ArrayList<>();
    public Beach() {
        Random random = new Random();
        List<Color> colorsList = new ArrayList<>(List.of(new Color(246, 215, 176), new Color(242, 210, 169), new Color(236, 204, 162),
                new Color(231, 196, 150), new Color(225, 191, 146), new Color(240, 230, 140)));
        for (int i = 0; i < 300; i++) {
            colorsOfSand.add(new ArrayList<>());
            for (int j = 0; j <1000; j++) {
                colorsOfSand.get(i).add(colorsList.get(random.nextInt(colorsList.size())));
            }
        }

    }
    public void drawBeach(Graphics2D graphics2D) {

        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 1000; j++) {
                graphics2D.setColor(colorsOfSand.get(i).get(j));
                graphics2D.fillRect(j, i + 500, 1, 1);
            }
        }
    }
}

