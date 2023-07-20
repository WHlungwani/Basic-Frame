
package za.ac.tut.ui;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author GOD IS GOOD
 */
public class MyFirstFrame extends JFrame{

    public MyFirstFrame()
    {
        setTitle("My First GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setForeground(Color.red);
        setVisible(true);
        
    }
    
    
}
