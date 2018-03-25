package de.darktech.bluescreen;

import javax.swing.*;
import java.awt.*;

public class BlueScreen extends JFrame {



    public BlueScreen(){
        super();
        this.setLayout(null);
        this.setBackground(Color.blue);
        this.setUndecorated(true);
        final Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim);
        getContentPane().setBackground(Color.BLUE);


        JTextArea jtextArea = new JTextArea();

       // jtextArea.setBounds(100, 100, this.getWidth()-200, this.getHeight()-200 );
        jtextArea.setText("A problem has been detected and windows has been shut down to prevent damage " +
                "\nto your computer." +
                "\n\nThe problem seems to ber caused by the following file: SPCMCON.SYS" +
                "\n\nPAGE_FAULTT_IN_NONPAGED_AREA" +
                "\n\nIf this is the first time you have seen this Stop error screen," +
                "\nrestart your computer. If this screen appears again, follow" +
                "\nthese steps: " +
                "\n\nCheck to make sure any new hardware or software is properly installed." +
                "\nIf this is a new Installation, ask your hardware or software manufacturer." +
                "\nfor any windows updates you might need."+
                "\n\nIf the problems continue, disable or remove any newly installed hardware or" +
                "\nsoftware. Disable BIOS Memory options such as caching or shadowing." +
                "\nIf you need to use Safe Mode to remove or disable components, restart" +
                "\nyour computer. Press F8 to select Advanced Startup options, and then" +
                "\nselect Safe Mode." +
                "\n\nTechnical information:" +
                "\n\nSTOP: 0x00000050 (0xFD3094C2, 0x00000001, 0xF8FE7617, 0x00000000)" +
                "\n\nSPCMCON.SYS - Address FBFE7617 base at FBFE5000, Datestamp 3d6dd67c");

        //jtextArea.setBounds(0,0,300,300);
        jtextArea.setBounds(100, 100, this.getWidth()-200, this.getHeight()-200 );
        jtextArea.setForeground(Color.white);
        jtextArea.setOpaque(false);
        jtextArea.setFont(new Font("Lucida Console", Font.PLAIN, 26));


       // jtextArea.setFont(jtextArea.getFont().deriveFont(26f));
        this.add(jtextArea);



        this.setVisible(true);
    }


}
