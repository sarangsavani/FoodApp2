package loginPage;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login implements ActionListener {
    
    
    
    private static JLabel uLabel;
    private static JTextField uText;
    private static JPasswordField pText;
    private static JLabel pLabel;
    private static JButton button;
    private static JLabel success;
    
    public static void main(String[] args){
        
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame(); // creating a new frame
        frame.setSize(500, 500);  //frame size 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the frame when clicked. 
        frame.setVisible(true);     //displaying the frame
        frame.add(panel);
        
        panel.setLayout(null); //it is set to null because I am not trying to setup the layout. I just want it to display. 
        
        
        //displays the word user
        uLabel = new JLabel("User");
        uLabel.setBounds(10, 20 , 80, 25);
        panel.add(uLabel);
        
        //username input box
        uText = new JTextField(20);
        uText.setBounds(100, 20, 165, 25);
        panel.add(uText);
        
        //displays the word password 
        pLabel = new JLabel("Password");
        pLabel.setBounds(10, 50 , 80, 25);
        panel.add(pLabel);
        
        //password input boc
        pText = new JPasswordField();
        pText.setBounds(100, 50, 165, 25);
        panel.add(pText);
        
         //login box
        button = new JButton("Login");
        button.setBounds(10, 110, 300, 25);
        button.addActionListener(new login());
        panel.add(button);
        
        //if username and password were correct it will show success. 
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);        
        panel.add(success);
        
        frame.setVisible(true); 
                    
        }

    @Override
    public void actionPerformed(ActionEvent e) {
         
        String user = uText.getText();  //
        String password = pText.getText();
       
        //username and password 
        if(user.equals("food") && password.equals("food")){
            success.setText("Login successful"); //if correct then it will pass "Login successful"
        }
    }
        
        
    }
        
