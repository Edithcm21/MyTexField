package mx.uv.fiee.iinf.poo.mytextfield;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.JTextField;

public class MyTextField extends JTextField implements KeyListener {

    public MyTextField () {

        this.addKeyListener (this);
    }

    @Override
    public void keyTyped (KeyEvent e) {
        if (this.getText().length()==13)
            e.consume();

        if ( (!((e.getKeyChar () >= '0' && e.getKeyChar () <= '9') || e.getKeyChar () == '(' || e.getKeyChar () == ')' || e.getKeyChar () == ' ' )) ||
                (e.getKeyChar () == '(' && this.getText ().contains ("(")) || (e.getKeyChar () == ')' && this.getText ().contains (")")) || (e.getKeyChar () == ' ' && this.getText ().contains (" "))   )  {

            e.consume ();

        }


        if ( !MyTextField.this.getText().matches("\\([\\d]{3}\\)[ ]{1}[\\d]{7}") ) {
            MyTextField.this.setBackground(Color.red);
            MyTextField.this.setForeground(Color.white);
        }

        if ( MyTextField.this.getText().length() == 12 && MyTextField.this.getText().matches("\\([\\d]{3}\\)[ ]{1}[\\d]{6}") ) {
            MyTextField.this.setBackground(Color.white);
            MyTextField.this.setForeground(Color.red);
        }




    }

    @Override
    public void keyPressed (KeyEvent e) {
    }

    @Override
    public void keyReleased (KeyEvent e) {
    }



    @Override
    public void paint (Graphics g) {
        super.paint (g);

      // g.setColor (Color.red);
     //  g.drawRect (getSize ().width , getSize ().height - 30, 20, 20);

     //  g.setColor(Color.red);
     //  g.fillRect (getSize ().width - 25, getSize ().height - 30, 20, 20);

     //   g.dispose ();

        try {
            URL url = getClass ().getResource ("/images/ico.png");
            File file = new File (url.getPath ());
            BufferedImage img = ImageIO.read (file);
            g.drawImage (img, getSize ().width - 30, getSize ().height - 30, null);
        }
        catch (IOException ex) {
            System.out.println (ex.getMessage ());
        }
    }






}