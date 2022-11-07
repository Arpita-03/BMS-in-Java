package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    long random;
    JTextField panTextField, aadharTextField;            
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;
            
    SignupTwo(String formno){
        
        this.formno =formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        setLayout(null);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/BMS sign1.png"));
        Image i5 = i4.getImage().getScaledInstance(500, 650, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 500, 650);
        add(image);

                
        JLabel additionalDetails = new JLabel("Page 2: ADDITIONAL DETAILS");
        additionalDetails.setFont(new Font("Oswald", Font.BOLD, 20));
        additionalDetails.setBounds(160, 40, 350, 40);
        image.add(additionalDetails);
        
        //Religion LABEL 1
        
        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Oswald", Font.BOLD, 18));
        Religion.setBounds(35, 110, 400, 40);
        image.add(Religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(200, 120, 240, 25);
        religion.setBackground(Color.WHITE);
        image.add(religion);
        
               
        //CATEGORIES LABEL 2
        
        JLabel Category = new JLabel("Category:");
        Category.setFont(new Font("Oswald", Font.BOLD, 18));
        Category.setBounds(35, 150, 400, 40);
        image.add(Category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox (valCategory);
        category.setBounds(200, 160, 240, 25);
        category.setBackground(Color.WHITE);
        image.add(category);
        
        
        //INCOME LABEL 3
        
        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Oswald", Font.BOLD, 18));
        Income.setBounds(35, 190, 400, 40);
        image.add(Income);
        
        String valIncome[] = {"Null", "< 1,50,000", "< 2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox (valIncome);
        income.setBounds(200, 200, 240, 25);
        income.setBackground(Color.WHITE);
        image.add(income);
        
        
        //EDUCATION LABEL 4
        
        JLabel Education = new JLabel("Edu. Qualification:");
        Education.setFont(new Font("Oswald", Font.BOLD, 18));
        Education.setBounds(35, 230, 400, 40);
        image.add(Education);
        
        String valEducation[] = {"Non-Graduation", "Undergraduation", "Graduation", "Post Graduation", "Doctrate", "Others"};
        education  = new JComboBox (valEducation);
        education.setBounds(200, 240, 240, 25);
        education.setBackground(Color.WHITE);
        image.add(education);
       
        //OCCUPATION LABEL 5
        
        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Oswald", Font.BOLD, 18));
        Occupation.setBounds(35, 270, 400, 40);
        image.add(Occupation);
        
        String valOccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation  = new JComboBox (valOccupation);
        occupation.setBounds(200, 280, 240, 25);
        occupation.setBackground(Color.WHITE);
        image.add(occupation);
        
        
        //PAN LABEL 6
        
        JLabel Pan = new JLabel("PAN Number:");
        Pan.setFont(new Font("Oswald", Font.BOLD, 18));
        Pan.setBounds(35, 310, 400, 40);
        image.add(Pan);
        
        panTextField = new JTextField("");
        panTextField.setBounds(200, 320, 240, 22);
        panTextField.setBackground(Color.WHITE);
        image.add(panTextField);
       

        //AADHAR LABEL 7
        
        JLabel Aadhar = new JLabel("Aadhar Number:");
        Aadhar.setFont(new Font("Oswald", Font.BOLD, 18));
        Aadhar.setBounds(35, 350, 400, 40);
        image.add(Aadhar);
       
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Oswald", Font.BOLD, 14));
        aadharTextField.setBounds(200, 360, 240, 25);
        image.add(aadharTextField);
        
        //SENIOR CITIZEN LABEL 8
        
        JLabel Seniorc = new JLabel("Senior Citizen:");
        Seniorc.setFont(new Font("Oswald", Font.BOLD, 18));
        Seniorc.setBounds(35, 390, 400, 40);
        image.add(Seniorc);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(200, 400, 110, 25);
        syes.setBackground(Color.WHITE);
        image.add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(330, 400, 110, 25);
        sno.setBackground(Color.WHITE);
        image.add(sno);
        
        ButtonGroup Seniorcgroup = new ButtonGroup();
        Seniorcgroup.add(syes);
        Seniorcgroup.add(sno);
        
        
       //EXISITING ACC LABEL 9
        
        JLabel Existingacc = new JLabel("Existing Acc:");
        Existingacc.setFont(new Font("Oswald", Font.BOLD, 18));
        Existingacc .setBounds(35, 430, 400, 40);
        image.add(Existingacc );
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(200, 440, 110, 25);
        eyes.setBackground(Color.WHITE);
        image.add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(330, 440, 110, 25);
        eno.setBackground(Color.WHITE);
        image.add(eno);
        
        ButtonGroup Existingaccgroup = new ButtonGroup();
        Existingaccgroup.add(syes);
        Existingaccgroup.add(sno);
       
        
      //NEXT BUTTON 10
  
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
        
        String sreligion =(String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        
        if(syes.isSelected()) {
            seniorcitizen = "Yes";
        }else if(sno.isSelected()) {
            seniorcitizen = "No";
        }
        
        String existingacc = null;
        if(eyes.isSelected()){ 
            existingacc = "Yes";
        }else if(eno.isSelected()){ 
            existingacc = "No";
        }
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        
       try{
           
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingacc+"')";
                c.s.executeUpdate(query);
       
     //SignupThree Object     
       
        setVisible(false);
        new SignupThree(formno).setVisible(true);
        
       }catch(Exception e){
            System.out.println(e);
        } 
        
        
        
        
        
    }

    public static void main(String[] args) {
        new SignupTwo(""); 
    }
    
    
}

