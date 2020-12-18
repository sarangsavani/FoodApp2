package loginPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;  //imports the panel
import javax.swing.JPasswordField;  //imports the field for the password
import javax.swing.JTextField;  //imports the field for text bar

public class login implements ActionListener {

    //private because you these variables are only accessed in this class
    private static JLabel uLabel;  //user label 
    private static JTextField uText; //user text
    private static JPasswordField pText; // password text
    private static JLabel pLabel; //password label
    private static JButton button; //button 
    private static JLabel success; //success 

    public static void main(String[] args) {

        //login window
        JPanel panel = new JPanel();
        JFrame frame = new JFrame(); // creating a new frame
        frame.setSize(500, 500);  //frame size 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the frame when clicked. 
        frame.setVisible(true);     //displaying the frame
        frame.add(panel);

        panel.setLayout(null); //it is set to null because I am not trying to setup the layout. I just want it to display. 

        //displays the word user
        uLabel = new JLabel("User");
        uLabel.setBounds(10, 20, 80, 25);
        panel.add(uLabel);

        //username input box
        uText = new JTextField(20);
        uText.setBounds(100, 20, 165, 25);
        panel.add(uText);

        //displays the word password 
        pLabel = new JLabel("Password");
        pLabel.setBounds(10, 50, 80, 25);
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

        String user = uText.getText();  //getting text for username
        String password = pText.getText(); //getting text for password

        //username and password 
        if (user.equals("food") && password.equals("food")) {
            success.setText("Login successful"); //if correct then it will pass "Login successful"
        }
    }

}
