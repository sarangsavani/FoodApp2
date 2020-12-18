
import java.awt.event.ActionEvent; //imports actions performed
import java.awt.event.ActionListener;  //import to handle all actions
import javax.swing.JButton;  //imports buttons
import javax.swing.JFrame;   //imports frame
import javax.swing.JMenu;   // imports menu option;
import javax.swing.JMenuBar;  //imports menu bar
import javax.swing.JMenuItem;  //imports items from the menu

public class View extends JFrame implements ActionListener {

    View() {

        JMenuBar menubar = new JMenuBar();  //menubar in the app

        //Create the main menu tab
        JMenu Menu = new JMenu("Menu");         //menu button
        menubar.add(Menu);

        //Create the restart tab
        JMenu restart = new JMenu("Restart");       //Restart button
        menubar.add(restart);

        //Create the help tab
        JMenu help = new JMenu("Help");     //Help button
        menubar.add(help);
        JMenuItem about = new JMenuItem("Please choose a food.");
        help.add(about);

        // Exits the app
        JMenu exit = new JMenu("Exit");        //Exit button       
        menubar.add(exit);

        JButton test = new JButton("test3");
        test.addActionListener(this);

        //creates the menu bar
        this.setJMenuBar(menubar);
        /* 
       //exit button on menu 
        class actionexit {
            public void actionPreformed (ActionEvent e){
                System.exit(1);
               
               
            }
         */

        //frame of the program
        this.setTitle("FoodApp");  //title on the frame
        this.setSize(1000, 1000);  //size of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //closes the app 
        this.setVisible(true);  //set to true to show the app
    }

    public void actionPreformed(ActionEvent e) {
        System.out.print("Test2");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
