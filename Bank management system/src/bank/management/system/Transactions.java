
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit, withdrawl, ministatement, pinchange, fastcash, balanceenquiry, exit;
    
    String pinnumber;
    
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/atm.png"));
        Image i8 = i7.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        //TEXT LABEL 1   
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(180,150,700,35);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("Oswald", Font.BOLD, 16));
        image.add(text);
        
        //BUTTONS
        deposit = new JButton("Deposit");
        deposit.setBounds(120,220,150,30);
        deposit.setBackground(Color.WHITE);
        deposit.setForeground(Color.BLACK);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(320,220,150,30);
        withdrawl.setBackground(Color.WHITE);
        withdrawl.setForeground(Color.BLACK);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(120,260,150,30);
        fastcash.setBackground(Color.WHITE);
        fastcash.setForeground(Color.BLACK);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(320,260,150,30);
        ministatement.setBackground(Color.WHITE);
        ministatement.setForeground(Color.BLACK);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Pin Change");
        pinchange.setBounds(120,300,150,30);
        pinchange.setBackground(Color.WHITE);
        pinchange.setForeground(Color.BLACK);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(320,300,150,30);
        balanceenquiry.setBackground(Color.WHITE);
        balanceenquiry.setForeground(Color.BLACK);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("EXIT");
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
              System.exit(0);
          }else if (ae.getSource() == deposit) {
              setVisible(false);
              new Deposit(pinnumber).setVisible(true);
          }else if (ae.getSource() == withdrawl) {
              setVisible(false);
              new Withdrawl(pinnumber).setVisible(true);
          }else if(ae.getSource() == fastcash) {
              setVisible(false);
              new FastCash(pinnumber).setVisible(true);
          }else if(ae.getSource() == pinchange) {
              setVisible(false);
              new PinChange(pinnumber).setVisible(true);
          }else if(ae.getSource() == balanceenquiry) {
              setVisible(false);
              new BalanceEnquiry(pinnumber).setVisible(true);
          }else if(ae.getSource() == ministatement) {
              new MiniStatement(pinnumber).setVisible(true);
          }
    }
    
    public static void main(String[] args) {
        new Transactions("");
          
    }
    
}
