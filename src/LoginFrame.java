import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginFrame(){
        setTitle("Payroll Management System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

//        Add authentication logic here and replace the following line with it.
//        if(username.equals("admin") && password.equals("admin")){
//            JOptionPane.showMessageDialog(this, "Login Successful!");
//            new MainFrame();
//            this.dispose();
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "Invalid username or password!");
//        }
        if(authenticate(username, password)){
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);

//            Close the login frame
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid username or password!");
        }

        }
    private boolean authenticate(String username, String password){
        return username.equals("admin") && password.equals("admin");
    }

}
