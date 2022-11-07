package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener{
    
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        setLayout(null);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/BMS sign1.png"));
        Image i5 = i4.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 500, 650);
        add(image);

        JLabel l1 = new JLabel("Page 3: ACCOUNT DETAILS");
        l1.setFont(new Font("Oswald", Font.BOLD, 20));
        l1.setBounds(160, 40, 350, 40);
        image.add(l1);
        
        //ACCOUNT TYPE LABEL 1
        
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Oswald", Font.BOLD, 18));
        type.setBounds(50, 110, 400, 40);
        image.add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Oswald", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(50, 150, 160, 25);
        image.add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Oswald", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(230, 150, 200, 25);
        image.add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Oswald", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(50, 200, 160, 25);
        image.add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Oswald", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(230, 200, 235, 25);
        image.add(r4);
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(r1);
        accountgroup.add(r2);
        accountgroup.add(r3);
        accountgroup.add(r4);
        
        //CARD NUMBER LABEL 2
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Oswald", Font.BOLD, 18));
        card.setBounds(50, 250, 400, 40);
        image.add(card);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Oswald", Font.BOLD, 11));
        carddetail.setBounds(50, 280, 240, 12);
        image.add(carddetail);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-3613");
        number.setFont(new Font("Oswald", Font.BOLD, 18));
        number.setBounds(240, 250, 400, 40);
        image.add(number);
        
        
        //PIN NUMBER LABEL 3
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Oswald", Font.BOLD, 18));
        pin.setBounds(50, 290, 400, 40);
        image.add(pin);
        
        JLabel pindetail = new JLabel("Your 04 Digit Card Number");
        pindetail.setFont(new Font("Oswald", Font.BOLD, 11));
        pindetail.setBounds(50, 320, 240, 12);
        image.add(pindetail);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Oswald", Font.BOLD, 18));
        pnumber.setBounds(240, 290, 400, 40);
        image.add(pnumber);
        
        //SERVICES REQUIRED LABEL 4
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Oswald", Font.BOLD, 18));
        services.setBounds(50, 350, 400, 40);
        image.add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Oswald", Font.BOLD, 16));
        c1.setBounds(50, 390, 160, 23);
        image.add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Oswald", Font.BOLD, 16));
        c2.setBounds(230, 390, 160, 25);
        image.add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Oswald", Font.BOLD, 16));
        c3.setBounds(50, 430, 160, 25);
        image.add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Oswald", Font.BOLD, 16));
        c4.setBounds(230, 430, 160, 25);
        image.add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Oswald", Font.BOLD, 16));
        c5.setBounds(50, 470, 160, 25);
        image.add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Oswald", Font.BOLD, 16));
        c6.setBounds(230, 470, 160, 25);
        image.add(c6);
        
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Oswald", Font.BOLD, 9));
        c7.setBounds(30, 500, 430, 18);
        image.add(c7);
        
        
        //BUTTON
        
        submit = new JButton("SUBMIT");
        submit.setFont(new Font("Oswald", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(50, 550, 88, 30);
        submit.addActionListener(this);
        image.add(submit);
        
        
        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("Oswald", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(150, 550, 90, 30);
        cancel.addActionListener(this);
        image.add(cancel);
        
   
        setSize(500, 650);
        setLocation(500, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) { //getting values from inputs
      if(ae.getSource() == submit) {
        String accountType = null;
        if(r1.isSelected()) {
            accountType = "Saving Account";
        }else if(r2.isSelected()) {
            accountType = "Fixed Deposit Account";
        }else if(r3.isSelected()) {
            accountType = "Current Account";
        }else if(r4.isSelected()) {
            accountType = "Recurring Deposit Account";
        } 
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
        
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            
            if (c1.isSelected()) {
                facility = facility + "ATM card";
            }else if(c2.isSelected()){ 
                facility = facility + " Internet Banking";
            }else if(c3.isSelected()){ 
                facility = facility + " Mobile Banking";
            }else if(c4.isSelected()){ 
                facility = facility + " EMAIL Alerts";
            }else if(c5.isSelected()){ 
                facility = facility + " Cheque Book";
            }else if(c6.isSelected()){ 
                facility = facility + " E-Statement";
            }
            
            try {
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:"+ pinnumber);
                
                setVisible(false);
                new Deposit(pinnumber).setVisible(false);
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
       
      }else if (ae.getSource() == cancel){
       setVisible(false);
       new Login().setVisible(true);        
    }
          
      
    }

    public static void main(String[] args) {
        new SignupThree(""); 
    }
    
    
}
