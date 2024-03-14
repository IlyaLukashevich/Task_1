package ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1;

import ru.vsu.cs.kg2023.g8.chelyapin_l_a.task1.DrawPanel;

import javax.swing.*;

public class MainFrame extends JFrame {
    private static DrawPanel dp;
    private JPanel mainPanel;

    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        dp = new DrawPanel();
        this.add(dp);

        this.setVisible(true);
    }
}
