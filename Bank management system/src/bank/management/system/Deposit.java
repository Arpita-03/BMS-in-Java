
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    
    Deposit(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/atm.png"));
        Image i8 = i7.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        //TEXT LABEL 1   
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setBounds(170,150,700,35);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("Oswald", Font.BOLD, 16));
        image.add(text);
        
        //TEXTFIELD
        
        JTextField amount = new JTextField();
        amount.setFont(new Font("Oswald", Font.BOLD, 22));
        amount.setBounds(150, 200, 320, 25);
        image.add(amount);
        
         //BUTTON
        deposit = new JButton("Deposit");
        deposit.setBounds(350,370,120,30);
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("back");
        back.setBounds(350,410,120,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == deposit) {
           String number = amount.getText();
           Date date = new Date();
           if (number.equals("")) {
               JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
           }else {
               try {
                   Conn conn = new Conn();
               
               String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')"; 
                   conn.s.executeUpdate(query);
                   JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully"); 
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               } catch (Exception e) {
                 System.out.println(e);   
                }               
               }
               
        }else if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Deposit("");
    }
    
    
    
    
    
    
}
