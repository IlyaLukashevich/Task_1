package com.example.test.rasterization;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class OvalRasterization {
    public static void drawOval(
            GraphicsContext graphicsContext,
            int x,
            int y,
            int width,
            int height,
            Color colorAtStart,
            Color colorAtEnd) {
        final PixelWriter pixelWriter = graphicsContext.getPixelWriter();

        int x0 = x + width/2;
        int y0 = y + height/2;
        int a = width/2;
        int b = height/2;

        for (int row = y; row < y + height; row++) {
            List<Integer> listOfXes = findLineToFill(x0, row, y0, a, b);
            for (int col = listOfXes.get(0); col < listOfXes.get(1); col++) {
                pixelWriter.setColor(col, row, colorAtStart);
            }
        }

    }
    private static List<Integer> findLineToFill(int x0, int y, int y0, int a, int b) {
        List<Integer> listOfXes = new ArrayList<>(2);
        double v = (a / b) * Math.sqrt(b * b - (y - y0) * (y - y0));
        int leftX = (int) (x0 - v);
        int rightX = (int) (x0 + v);
        listOfXes.add(leftX);
        listOfXes.add(rightX);
        return listOfXes;
    }
}
