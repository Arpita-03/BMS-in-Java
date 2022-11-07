
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class MiniStatement extends JFrame implements ActionListener{
    
   MiniStatement(String pinnumber){
   setTitle("Mini Statement");  
   setLayout(null);
        
        
        //Label 1
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400, 200);
        add(mini);
   
        //Label 2
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
        //Label 3
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
       //Label 4 
        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);
        
        //BUTTON
        JButton b1 = new JButton("Exit");
        b1.addActionListener(this);
        b1.setBounds(20, 500, 100, 25);
        add(b1);
    
        
        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next()) {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
            } 
        }catch (Exception e) {
            System.out.println(e);
        }
        
        try{
             Conn conn = new Conn();
             int bal = 0;
             ResultSet rs = conn.s.executeQuery("SELECT * FROM bank where pin = '"+pinnumber+"'");
             while(rs.next()){
                 mini.setText(mini.getText() + "<html>"+ rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                 if(rs.getString("type").equals("Deposit")) {
                         bal += Integer.parseInt(rs.getString("amount"));
                     } else {
                         bal -= Integer.parseInt(rs.getString("amount"));
                     }
             }
             balance.setText("Your current account balance is Rs" + bal);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
       
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
   
    public static void main(String[] args) {
         new MiniStatement("");
    }
    
}
