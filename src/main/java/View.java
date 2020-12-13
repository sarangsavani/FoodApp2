
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

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

        // Exits the app
        JMenu exit = new JMenu("Exit");        //Exit button
        menubar.add(exit);
        //View mainView = new View();
            
        JButton test = new JButton("test3");
        test.addActionListener(this);
          
          //create the menu bar
        
        this.setJMenuBar(menubar);
        menubar.setVisible(true);
        
        
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

        /*
       Panels() {
           
        JFrame window = new JFrame("1");
        JPanel pane1_01 = new JPanel();
        JPanel pane1_02 = new JPanel();
        JButton click = new JButton();
        JLabel text = new JLabel("2");
         
        
       

            JFrame frame1 = new JFrame("test1");
            frame1.setSize(500, 500);
            frame1.setVisible(true);

            JFrame frame2 = new JFrame("test2");
            frame2.setSize(500, 500);
            frame2.setVisible(true);
             
              pane1_02.setBackground(color.AQUA);
                        
                window.add(pane1_01, BorderLayout.CENTER);
                window.add(pane1_02, BorderLayout.PAGE_END);
                
                window.setSize(400, 400);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
            }
             


    

*/