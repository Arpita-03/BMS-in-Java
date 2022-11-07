
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{

    
     JPasswordField pin,repin;
     JButton change,back;
     
     String pinnumber;
    
    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("images/atm.png"));
        Image i8 = i7.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        //HEADING
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(230,150,700,35);
        text.setBackground(Color.BLACK);
        text.setFont(new Font("Oswald", Font.BOLD, 16));
        image.add(text);
        
        //LABEL 1
        
        JLabel pintext = new JLabel("NEW PIN");
        pintext.setBounds(120,190,180,25);
        pintext.setBackground(Color.BLACK);
        pintext.setFont(new Font("Oswald", Font.BOLD, 16));
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setBounds(310,190,180,25);
        pin.setFont(new Font("Oswald", Font.BOLD, 25));
        image.add(pin);
        
         //LABEL 2
        
        JLabel repintext = new JLabel("RE-ENTER YOUR PIN");
        repintext.setBounds(120,220,180,25);
        repintext.setBackground(Color.BLACK);
        repintext.setFont(new Font("Oswald", Font.BOLD, 16));
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setBounds(310,220,180,25);
        repin.setFont(new Font("Oswald", Font.BOLD, 25));
        image.add(repin);
        
        //BUTTON 1
        change = new JButton("CHANGE");
        change.setBounds(400, 370, 90, 30);
        change.setBackground(Color.WHITE);
        change.setForeground(Color.BLACK);
        change.addActionListener(this);
        image.add(change);
        
        //BUTTON 2
        back = new JButton("BACK");
        back.setBounds(400,410,90,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);
       
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change) {
        try{
            String npin = pin.getText();
            String rpin = pin.getText();
            
            if (!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;                
            }
            if (npin.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Enter New PIN ");
                return;
            }
            if (rpin.equals("")) {
                JOptionPane.showMessageDialog(null,"Please Re-Enter PIN ");
                return;
            }
            
            Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String query2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
                String query3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
                
        }catch(Exception e) {
            System.out.println(e);
        }
     }else {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);

       }
        
    }
    
    
    public static void main(String[] args) {
       new PinChange("").setVisible(true);
    }
    
}
