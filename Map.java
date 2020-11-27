package ru.geekbrains.java_one.home_7;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    Map() {
        setBackground(Color.BLACK);
    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode=%d, size=%d, len=%d\n", mode, fieldSizeX, winLength);
    }
}
