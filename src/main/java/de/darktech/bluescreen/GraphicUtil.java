package de.darktech.bluescreen;



import javax.swing.*;
import java.awt.*;



public class GraphicUtil {


    public static void showOnScreen(final int screen, final JFrame frame) {
        try {
            final GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            final GraphicsDevice[] gd = ge.getScreenDevices();
            if (screen > -1 && screen < gd.length) {
                frame.setLocation(gd[screen].getDefaultConfiguration().getBounds().x, frame.getY());
            } else if (gd.length > 0) {
                frame.setLocation(gd[0].getDefaultConfiguration().getBounds().x, frame.getY());
            } else {
            }
        } catch (final Exception ignored) {
        }
    }
}
