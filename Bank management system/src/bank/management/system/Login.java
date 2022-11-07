package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/BMS login.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 500, 500);
        add(image);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setBounds(150, 40, 500, 40);
        text.setForeground(Color.green.darker().darker().darker());
        text.setFont(new Font("Oswald", Font.BOLD, 24));
        image.add(text);
        
        JLabel cardno = new JLabel("CARD NO:");
        cardno.setBounds(125, 150, 120, 40);
        cardno.setForeground(Color.green.darker().darker());
        cardno.setFont(new Font("Oswald", Font.BOLD, 21));
        image.add(cardno);
        
        
        cardTextField = new JTextField();
        cardTextField.setBounds(230, 155, 200, 30);
        cardTextField.setFont(new Font("arial", Font.BOLD,14));
        image.add(cardTextField);
        
        
        JLabel pin = new JLabel("PIN:");
        pin.setBounds(125, 200, 500, 40);
        pin.setForeground(Color.green.darker().darker());
        pin.setFont(new Font("Oswald", Font.BOLD, 21));
        image.add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(230, 206, 200, 30);
        pinTextField.setFont(new Font("arial", Font.BOLD,14));
        image.add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(125, 300, 100, 30);
        login.setBackground(Color.GREEN.darker().darker().darker());
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        image.add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(275, 300, 100, 30);
        clear.setBackground(Color.GREEN.darker().darker().darker());
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        image.add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(125, 350, 248, 30);
        signup.setBackground(Color.GREEN.darker().darker().darker());
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        image.add(signup);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == clear){
             cardTextField.setText("");
             pinTextField.setText("");
         }else if(ae.getSource() == login){
          
             Conn conn = new Conn();
             String cardnumber = cardTextField.getText();
             String pinnumber = pinTextField.getText();
             String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"' ";
             try {
                 ResultSet rs = conn.s.executeQuery(query);
                 if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                 
                 
                 
             } catch (Exception e) {
                 System.out.println(e);
             }
             
             
         }else if(ae.getSource() == signup){
             setVisible(false);
             new SignupOne().setVisible(true);
         }
    }
    
    public static void main(String[] args) {
        new Login();
        
    }
    
}
