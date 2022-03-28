package mx.uv.fiee.iinf.poo.mytextfield;


import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main( String[ ] args ) {
        JFrame frame = new JFrame( "Custom Component Create & Usage"
        );
        frame.setSize( 640, 480 );
        frame.setLayout( new FlowLayout( FlowLayout.CENTER, 20, 20 )
        );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE
        );
        MyTextField mf = new MyTextField();
        mf.setColumns( 13 );
        frame.add( mf );
        frame.setVisible( true );


    }


}