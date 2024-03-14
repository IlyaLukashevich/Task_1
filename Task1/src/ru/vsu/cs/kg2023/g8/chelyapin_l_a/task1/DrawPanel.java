package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1;

import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sea.Buoy;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sky.Cloud;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sea.Sea;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sky.Sky;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sky.Sun;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.background.sea.Speedboat;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach.Beach;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach.Carpet;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach.Tablet;
import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.foreground.beach.Umbrella;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {
    Timer timerForBuoys;
    List<Umbrella> umbrellas = new ArrayList<>();
    List<Cloud> clouds = new ArrayList<>();
    Sea sea;
    Beach beach;
    Sky sky;
    List<Carpet> carpets = new ArrayList<>();
    Tablet tablet;
    Sun sun;
    Speedboat speedboat;
    public DrawPanel() {
        beach = new Beach();

        umbrellas.add(new Umbrella(100, 700));
        umbrellas.add(new Umbrella(414,679));
        umbrellas.add(new Umbrella(840, 650));

        carpets.add(new Carpet(120, 600));
        carpets.add(new Carpet(434, 600));
        carpets.add(new Carpet(860, 600));

        for (int i = 0; i < 5; i++) {
            clouds.add( new Cloud(i * 200,((int) (Math.random() * 100)) + 30));
        }

        sea = new Sea();
        sky = new Sky();
        tablet = new Tablet(590, 460);
        sun = new Sun(100, -50);
        speedboat = new Speedboat(350,420);

        timerForBuoys = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Buoy buoy : sea.getBuoys()) {
                    int y = buoy.getY();
                    if (y <= 285 || y >= 300) {
                        buoy.setShift(-buoy.getShift());
                    }
                    y += buoy.getShift();
                    buoy.setY(y);
                    repaint();
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D gr = (Graphics2D) g;
        sky.paintSky(gr);
        sun.drawSun(gr);
        beach.drawBeach(gr);
        sea.drawSea(gr);

        for (Cloud c: clouds) {
            c.drawCloud(gr);
        }

        for (Umbrella umbrella : umbrellas) {
            umbrella.drawUmbrella(gr);
        }

        for (Carpet carpet : carpets) {
            carpet.drawCarpet(gr);
        }
        tablet.drawTablet(gr);
        speedboat.drawBoat(gr);
        timerForBuoys.start();
    }
}
