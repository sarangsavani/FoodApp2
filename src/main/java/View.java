

import static java.awt.SystemColor.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class View extends JFrame implements ActionListener{

    public static void main(String[] args) {

        //frame of the program
        JFrame frame = new JFrame("FoodApp");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //create the menu bar
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        menubar.setVisible(true);

        //Create the main menu tab
        JMenu Menu = new JMenu("Menu");
        menubar.add(Menu);

        //Create the restart tab
        JMenu restart = new JMenu("Restart");
        menubar.add(restart);

        //Create the help tab
        JMenu help = new JMenu("Help");
        menubar.add(help);
        
        
        // Exits the app
        JMenu exit = new JMenu("Exit");
        menubar.add(exit);
        exit.addMenuListener(new thisMenuListener());
        
        JFrame frame = new JFrame("Food One");
        JFrame1.setBounds(0, 500, 500, 1000);
        
        JFrame frame = new JFrame("Food Two");
        frame.setSize(500, 1000, 500, 1000);
        
        
      
        
    }
    
    

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


