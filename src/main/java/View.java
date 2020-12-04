
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class View {

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
        Button.addActionListener(new ActionListener(){
            
          public void actionPreformed(ActionEvent e){
                  System.exit(0);
          frame.add(button);
        }
          };



    /*

        
        JFrame window = new JFrame("1");
        JPanel pane1_01 = new JPanel();
        JPanel pane1_02 = new JPanel();
        JButton click = new JButton();
        JLabel text = new JLabel("2");
         
        
        Panels() {

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
        }

    }

