
package bank.managment.systemm;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox j1,j2,j3,j4,j5,j6,j7;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno){
        this.formno=formno;
        setLayout(null);
        //setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        r1=new JRadioButton("Saving account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3=new JRadioButton("currunt account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4=new JRadioButton("Recurring account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
         groupaccount.add(r2);
          groupaccount.add(r3);
           groupaccount.add(r4);
           
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 300, 200, 30);
        add(card);   
        
        JLabel number = new JLabel("xxxx-xxxx-xxxx-4123");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);  
        
        JLabel carddetail = new JLabel("This is youre card number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300,15 );
        add(carddetail);  
        
        
        JLabel pin = new JLabel("pin Number");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);   
        
        JLabel pnumber = new JLabel("xxxx");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);   
        
        JLabel pindetail = new JLabel("This is youre password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300,20 );
        add(pindetail);  
        
        JLabel services= new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 12));
        services.setBounds(100, 450, 400,20 );
        add(services); 
        
        
        j1=new JCheckBox("Atm card");
        j1.setBackground(Color.WHITE);
        j1.setFont(new Font("Raleway", Font.BOLD, 16));
        j1.setBounds(350,500,200,30);
        add(j1);
        
        
        j2=new JCheckBox("internet bankin");
        j2.setBackground(Color.WHITE);
        j2.setFont(new Font("Raleway", Font.BOLD, 16));
        j2.setBounds(100,500,200,30);
        add(j2);
        
        
        j3=new JCheckBox("Mobile banking");
        j3.setBackground(Color.WHITE);
        j3.setFont(new Font("Raleway", Font.BOLD, 16));
        j3.setBounds(100,550,200,30);
        add(j3);
        
        
        j4=new JCheckBox("Email Alerts");
        j4.setBackground(Color.WHITE);
        j4.setFont(new Font("Raleway", Font.BOLD, 16));
        j4.setBounds(350,600,200,30);
        add(j4);
        
        j5=new JCheckBox("Check Book");
        j5.setBackground(Color.WHITE);
        j5.setFont(new Font("Raleway", Font.BOLD, 16));
        j5.setBounds(100,600,200,30);
        add(j5);
        
        j6=new JCheckBox("g-statments");
        j6.setBackground(Color.WHITE);
        j6.setFont(new Font("Raleway", Font.BOLD, 16));
        j6.setBounds(350,600,200,30);
        add(j6);
        
        j7=new JCheckBox(":declearation that above enter detail are correct");
        j7.setBackground(Color.WHITE);
        j7.setFont(new Font("Raleway", Font.BOLD, 16));
        j7.setBounds(100,680,600,30);
        add(j7);
        
       
        

        submit =new JButton("submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
         cancel =new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
         cancel.addActionListener(this);
        add(cancel);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving account";
            }
            else if (r2.isSelected()){
                accountType="Fixed Deposite account";
            }
            else if (r3.isSelected()){
                accountType="Currunt Account";
            }
            else if(r4.isSelected()){
                accountType="Recuurent deposite";
            }
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong() %90000000L)+504093600000000L);
            
            String pinnumber=""+Math.abs((random.nextLong() %9000L)+1000L);
            
            String facility ="";
            
            if(j1.isSelected()){
                facility = facility + "Atm card";
            }
            else if(j2.isSelected()){
                facility = facility +"internet banking";
            }
            else if(j3.isSelected()){
                facility= facility + "mobile banking ";
            }
            else if(j4.isSelected()){
                facility=facility + "Email and sms alert";
            }
            else if(j5.isSelected()){
                facility=facility + "Cheak book";
            }
            else if(j6.isSelected()){
                facility=facility + " e=statment";
            }
            
            try{
               if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null, "Account type is required");
               } 
               else{
               Conn c =new Conn();
                   String query1= "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String query2= "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                   c.s.executeUpdate(query1);
                   
                   c.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "card number"+cardnumber+"\npin:"+pinnumber);
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(false);
               }
            }
            catch(Exception e){
                System.out.println(e);
            }

        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
            
    public static void main(String args[]){
        new SignupThree("");
    }
}
