
package bank.managment.systemm;
import java.awt.Color;
import java.awt.*;

import java.util.*;
 import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements   ActionListener{
    long random;
    JTextField pan,aadhar ;
    JButton next;     
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
       
        setTitle("NEw Account application from:page 2");
        
       
        
         JLabel additionalDetails =new JLabel("Page 2: Additional Details:");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
         JLabel name =new JLabel("Religion:");
         name.setFont(new Font("Raleway",Font.BOLD,20));
         name.setBounds(100,140,100,30);
         add(name);
         
         String varReligion[] ={"Hindu","Muslim","Sikh","Chrichan","other"};
          religion =new JComboBox(varReligion);
          religion.setBounds(300,140,400,30);
          religion.setBackground(Color.WHITE);
         add(religion);
         
         
         JLabel fname =new JLabel(" Category:");
         fname.setFont(new Font("Raleway",Font.BOLD,20));
         fname.setBounds(100,190,200,30);
         add(fname);
         
         String varCategory[]={"Marath","Sc","NT","Teli","OBC"};
          category=new JComboBox(varCategory);
         category.setBounds(300,190,400,30);
         category.setBackground(Color.WHITE);
         add(category);
         
         JLabel dob =new JLabel(" Income:");
         dob.setFont(new Font("Raleway",Font.BOLD,20));
         dob.setBounds(100,240,200,30);
         add(dob);
         
         String incomecategory[]={"Null","<1,50,000","<2,50,0000","<5,00,000","upto 10,00,000"};
          income=new JComboBox(incomecategory);
         income.setBounds(300,240,400,30);
         income.setBackground(Color.WHITE);
         add(income);
         
         
        
         JLabel gender =new JLabel(" Education:");
         gender.setFont(new Font("Raleway",Font.BOLD,20));
         gender.setBounds(100,290,200,30);
         add(gender);
         
         String educationValues[]={"Non-Gradudate","UG","PG","OTHER",};
          education=new JComboBox(educationValues);
         education.setBounds(300,290,400,30);
         education.setBackground(Color.WHITE);
         add(education);
          
         
         
        
         
          JLabel marital =new JLabel(" Occupation:");
         marital.setFont(new Font("Raleway",Font.BOLD,20));
         marital.setBounds(100,390,200,30);
         add(marital);
         
         String occupationValues[]={"Salary Person","Self Employeed","Businessman","OTHER",};
          occupation=new JComboBox(occupationValues);
         occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
         add(occupation);
         
         
       
         
         JLabel address =new JLabel(" PAN Number:");
         address.setFont(new Font("Raleway",Font.BOLD,20));
         address.setBounds(100,440,200,30);
         add(address);
         
          pan =new JTextField();
         pan.setFont(new Font("Raileway",Font.BOLD,20));
         pan.setBounds(300,440,400,30);
         add(pan);
         
         
         JLabel city =new JLabel(" Aadhar Number:");
         city.setFont(new Font("Raleway",Font.BOLD,20));
         city.setBounds(100,490,200,30);
         add(city);
         
         aadhar=new JTextField();
         aadhar.setFont(new Font("Raleway",Font.BOLD,14));
         aadhar.setBounds(300,490,400,30);
         add(aadhar);
         
         
         
         
         JLabel State =new JLabel(" Senior Citizen:");
         State.setFont(new Font("Raleway",Font.BOLD,20));
         State.setBounds(100,540,200,30);
         add(State);
         
        syes=new JRadioButton("yes");
        syes.setBounds(300,540,100,30);
         syes.setBackground(Color.WHITE);
         add(syes);
         
         sno=new JRadioButton("no");
         sno.setBounds(450,540,100,30);
         sno.setBackground(Color.WHITE);
         add(sno);
         
         ButtonGroup maritalgroup = new ButtonGroup();
         maritalgroup.add(syes);
         maritalgroup.add(sno);
         
          
         
         JLabel pincode =new JLabel(" Exicting Account:");
         pincode.setFont(new Font("Raleway",Font.BOLD,20));
         pincode.setBounds(100,590,200,30);
         add(pincode);
         
            eyes=new JRadioButton("yes");
        eyes.setBounds(300,590,100,30);
         eyes.setBackground(Color.WHITE);
         add(eyes);
         
         eno=new JRadioButton("no");
         eno.setBounds(450,590,100,30);
         eno.setBackground(Color.WHITE);
         add(eno);
         
         ButtonGroup emaritalgroup = new ButtonGroup();
         emaritalgroup.add(eyes);
         emaritalgroup.add(eno);
         
         next=new JButton("Next"); 
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
 
         
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         String fromno = "" + random;
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sIncome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen =null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
       
        String exisitingaccount=null;
        if(eyes.isSelected()){
            exisitingaccount="Yes";
        }else if(eno.isSelected()){
            exisitingaccount="No";
        }
        
        String span=pan.getText(); 
        String saadhar=aadhar.getText();
      
        
        try{
           
               Conn c =new Conn();
             String query = "INSERT INTO signuptwo (formno, religion, category, income, education, pan, aadhar, existingaccount, seniorcitizen, occupation) " +
               "VALUES ('" + formno + "','" + sreligion + "','" + scategory + "','" + sIncome + "','" + seducation + "','" + span + "','" + saadhar + "','" + exisitingaccount + "','" + seniorcitizen + "','" + soccupation + "')";


                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String []args){
        new SignupTwo(" ");
                
                }
}
