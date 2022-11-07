package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField,addressTextField, cityTextField, stateTextField, pinTextField;            
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/BMS sign1.png"));
        Image i5 = i4.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 500, 650);
        add(image);

        JLabel formno = new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Oswald", Font.BOLD, 25));
        formno.setBounds(120, 30, 600, 40);
        image.add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: PERSONAL DETAILS");
        personalDetails.setFont(new Font("Oswald", Font.BOLD, 20));
        personalDetails.setBounds(160, 70, 350, 40);
        image.add(personalDetails);
        
        //NAME LABEL 1
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Oswald", Font.BOLD, 18));
        name.setBounds(50, 110, 400, 40);
        image.add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        nameTextField.setBounds(200, 120, 240, 25);
        image.add(nameTextField);
                
        //FATHER'S NAME 2
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Oswald", Font.BOLD, 18));
        fname.setBounds(50, 150, 400, 40);
        image.add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        fnameTextField.setBounds(200, 160, 240, 25);
        image.add(fnameTextField);
        
        //DOB LABEL 3
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Oswald", Font.BOLD, 18));
        dob.setBounds(50, 190, 400, 40);
        image.add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(200, 200, 240, 25);
        dateChooser.setForeground(Color.BLACK);
        image.add(dateChooser);
        
        //GENDER LABEL 4
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Oswald", Font.BOLD, 18));
        gender.setBounds(50, 230, 400, 40);
        image.add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(200, 240, 100, 25);
        male.setBackground(Color.WHITE);
        image.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(330, 240, 100, 25);
        female.setBackground(Color.WHITE);
        image.add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        //EMAIL LABEL 5
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Oswald", Font.BOLD, 18));
        email.setBounds(50, 270, 400, 40);
        image.add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        emailTextField.setBounds(200, 280, 240, 25);
        image.add(emailTextField);
        
        //MARITAL LABEL 6
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Oswald", Font.BOLD, 18));
        marital.setBounds(50, 310, 400, 40);
        image.add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(200, 320, 69, 22);
        married.setBackground(Color.WHITE);
        image.add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(277, 320, 85, 22);
        unmarried.setBackground(Color.WHITE);
        image.add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(368, 320, 69, 22);
        other.setBackground(Color.WHITE);
        image.add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        gendergroup.add(married);
        gendergroup.add(unmarried);
        gendergroup.add(other);

        //ADDRESS LABEL 7
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Oswald", Font.BOLD, 18));
        address.setBounds(50, 350, 400, 40);
        image.add(address);
       
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        addressTextField.setBounds(200, 360, 240, 25);
        image.add(addressTextField);
        
        //CITY LABEL 8
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Oswald", Font.BOLD, 18));
        city.setBounds(50, 390, 400, 40);
        image.add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        cityTextField.setBounds(200, 400, 240, 25);
        image.add(cityTextField);
        
        //STATE LABEL 9
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Oswald", Font.BOLD, 18));
        state.setBounds(50, 430, 400, 40);
        image.add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        stateTextField.setBounds(200, 440, 240, 25);
        image.add(stateTextField);
        
        //PINCODE LABEL 10
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Oswald", Font.BOLD, 18));
        pincode.setBounds(50, 470, 400, 40);
        image.add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        pinTextField.setBounds(200, 480, 240, 25);
        image.add(pinTextField);
        
        //BUTTON
        
        next = new JButton("NEXT");
        next.setFont(new Font("Oswald", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(50, 550, 80, 30);
        next.addActionListener(this);
        image.add(next);
        
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) { //getting values from inputs
        String formno = "" + random;  //long
        String name = nameTextField.getText();  //setText
        String fname = fnameTextField.getText();  //setText
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        if(male.isSelected()) {
            gender = "Male";
        }else if(female.isSelected()) {
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pincode = pinTextField.getText();
        String state = stateTextField.getText();
        
       try{
           
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");    
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
                c.s.executeUpdate(query);
                
        //SignupTwo Object        
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        } 
        
        
        
        
        
    }

    public static void main(String[] args) {
        new SignupOne(); 
    }
    
    
}
