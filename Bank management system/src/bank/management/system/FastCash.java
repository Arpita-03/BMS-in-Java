
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton bu1, bu2, bu3, bu4, bu5, bu6, exit;
    
    String pinnumber;
    
    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/atm.png"));
        Image i8 = i7.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        //TEXT LABEL 1   
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(180,150,700,35);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("Oswald", Font.BOLD, 16));
        image.add(text);
        
        //BUTTONS
        bu1 = new JButton("Rs 100");
        bu1.setBounds(120,220,150,30);
        bu1.setBackground(Color.WHITE);
        bu1.setForeground(Color.BLACK);
        bu1.addActionListener(this);
        image.add(bu1);
        
        bu2 = new JButton("Rs 500");
        bu2.setBounds(320,220,150,30);
        bu2.setBackground(Color.WHITE);
        bu2.setForeground(Color.BLACK);
        bu2.addActionListener(this);
        image.add(bu2);
        
        bu3 = new JButton("Rs 1000");
        bu3.setBounds(120,260,150,30);
        bu3.setBackground(Color.WHITE);
        bu3.setForeground(Color.BLACK);
        bu3.addActionListener(this);
        image.add(bu3);
        
        bu4 = new JButton("Rs 2000");
        bu4.setBounds(320,260,150,30);
        bu4.setBackground(Color.WHITE);
        bu4.setForeground(Color.BLACK);
        bu4.addActionListener(this);
        image.add(bu4);
        
        bu5 = new JButton("Rs 5000");
        bu5.setBounds(120,300,150,30);
        bu5.setBackground(Color.WHITE);
        bu5.setForeground(Color.BLACK);
        bu5.addActionListener(this);
        image.add(bu5);
        
        bu6 = new JButton("Rs 10,000");
        bu6.setBounds(320,300,150,30);
        bu6.setBackground(Color.WHITE);
        bu6.setForeground(Color.BLACK);
        bu6.addActionListener(this);
        image.add(bu6);
        
        exit = new JButton("BACK");
        exit.setBounds(400,410,90,30);
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
          if (ae.getSource() == exit) {
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
          }else {
            String amount = ((JButton)ae.getSource()).getText();  //Rs 500
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()) {
                     if(rs.getString("type").equals("Deposit")) {
                         balance += Integer.parseInt(rs.getString("amount"));
                     } else {
                         balance -= Integer.parseInt(rs.getString("amount"));
                     }
                }
                
                if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"'))";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                  
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            } catch(Exception e) {
                System.out.println(e);
            }
            
          }
      
    }
    
    
    public static void main(String[] args) {
        new FastCash("");
          
    }
    
}
