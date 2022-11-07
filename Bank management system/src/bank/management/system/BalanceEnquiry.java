package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
     
     JButton back;
     String pinnumber;
     
    BalanceEnquiry(String pinnumber) {
         
        this.pinnumber = pinnumber;
         setLayout(null);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/atm.png"));
        Image i8 = i7.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 700, 700);
        add(image);
            
        //BUTTON 1
        back = new JButton("BACK");
        back.setBounds(400,410,90,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);
        
         Conn c = new Conn();
         int balance = 0;
            try {
                ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");                
                while(rs.next()) {
                     if(rs.getString("type").equals("Deposit")) {
                         balance += Integer.parseInt(rs.getString("amount"));
                     } else {
                         balance -= Integer.parseInt(rs.getString("amount"));
                     }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
        JLabel text = new JLabel("Your Current Account Balance is Rs "+ balance);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("Oswald", Font.BOLD, 16));
        text.setBounds(170,215,400,30);
        image.add(text);
        
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);  
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
   
    
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
    
}
