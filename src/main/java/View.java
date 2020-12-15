

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class View extends JFrame implements ActionListener{
    
    View(){
        
        

      JMenuBar menubar = new JMenuBar();

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
        
       
        class actionexit {
            public void actionPreformed (ActionEvent e){
                System.exit(1);
                
                
                
              
                
               
        }
       
        
        //frame of the program
        this.setTitle("FoodApp");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPreformed(ActionEvent e){
            System.out.print("Test2");
        }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
            }
            