package de.darktech.bluescreen;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main (String[] args) throws Exception{
        TimeUnit.MILLISECONDS.sleep(3000);
        BlueScreen blueScreen = new BlueScreen();
        GraphicUtil.showOnScreen(0, blueScreen);
        blueScreen.setVisible(true);
        Audio.play();

    }



}
