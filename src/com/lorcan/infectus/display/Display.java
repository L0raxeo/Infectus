package com.lorcan.infectus.display;

import javax.swing.*;
import java.awt.*;

public class Display
{

    private JFrame frame;
    private Canvas canvas;

    private final String title;

    private final Dimension size;

    public Display(String title, int width, int height)
    {
        this.title = title;
        size = new Dimension(width, height);

        createDisplay();
    }

    private void createDisplay()
    {
        frame = new JFrame(title);
        frame.setSize(size);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(size);
        canvas.setMaximumSize(size);
        canvas.setMinimumSize(size);
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();

        System.out.println("[System]: initialization/INFO - Successfully created display (Display)");
    }

    public Canvas getCanvas()
    {
        return canvas;
    }

    public JFrame getFrame()
    {
        return frame;
    }

}
