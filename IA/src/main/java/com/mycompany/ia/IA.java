/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ia;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author avapa
 */
public class IA {

  class MainPanel extends JFrame {
      //creating buttons
    JButton f1 = new JButton();
    JButton f2 = new JButton();
    JButton f3 = new JButton();
    JButton f4 = new JButton();
    JButton f5 = new JButton();
    JButton f6 = new JButton();
 


public MainPanel(){
     JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            frame.setTitle("Calculate");
           //size+ location
            panel.setBorder(BorderFactory.createEmptyBorder(50, 30, 10, 30));
            panel.setLayout(new GridLayout(5, 5));
            frame.add(panel, BorderLayout.CENTER);
            frame.setLocation(80, 285);

            //what the buttons do
            
             f1.setText("V=△x/△t");
             panel.add(f1);
                       f1.addActionListener(new MessageListener());
     
             f2.setText("V₂=V₁+a△t");
             panel.add(f2);
                       f2.addActionListener(new MessageListener());

             f3.setText("V₂²=V₁²+2a△x");
             panel.add(f3);
                         f3.addActionListener(new MessageListener());

             f4.setText("△x=V₁△t+1/2a△t²");
             panel.add(f4);
                         f4.addActionListener(new MessageListener());

            f5.setText("△x=V₂△t-1/2a△t²");
             panel.add(f5);
                         f5.addActionListener(new MessageListener());

             f6.setText("△x=1/2(v₁+v₂)△t");
             panel.add(f6);
                         f6.addActionListener(new MessageListener());

             //nonsense stuff that makes program run
            frame.setVisible(true);
            frame.pack();
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

}
 public class MessageListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
              if (event.getSource().equals(f1)){
                  //for the frame of formula
                  JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JFrame frame2=new JFrame();
            JPanel pannel2=new JPanel();
              ImageIcon imageIcon = new ImageIcon("formulaone.png");
  JLabel label = new JLabel(imageIcon);
 
                panel.add(label);
        //frame one stuff
            frame.setVisible(true);
             frame.add(panel);
                      frame.pack();           
            frame.setLocation(1148, 285);
           //option panes+ changeing things into a double then does the math
            String x= JOptionPane.showInputDialog(null,"please input △x");
            String t= JOptionPane.showInputDialog(null,"please input  △t");
            //error catching
            try{
            Double number =  Double.parseDouble(x);
     Double number2 =  Double.parseDouble(t);
  
            double answer=number/number2;
             
                  JOptionPane.showMessageDialog(frame2, "The answer is :"+answer);}
            catch(Exception e){
             
              JOptionPane.showMessageDialog(frame2,"error, for one of the numbers you put a letter , please only input numbers and decimals, error code:"+e);
            }
  
                   

              }
              else if (event.getSource().equals(f2)){
                  JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JFrame frame2=new JFrame();
            JPanel pannel2=new JPanel();
              ImageIcon imageIcon = new ImageIcon("formulatwo.png");
  JLabel label = new JLabel(imageIcon);
  
  panel.add(label);
        //frame one stuff
            frame.setVisible(true);
             frame.add(panel);
                      frame.pack(); 
  frame.setLocation(1000, 343);
  // asking for numbers!
  
  String Vone= JOptionPane.showInputDialog(null,"please input V₁");
   String a= JOptionPane.showInputDialog(null,"please input a");
  String t= JOptionPane.showInputDialog(null,"please input △t");
  try{
                        Double numberone =  Double.parseDouble(Vone);
                        Double numbertwo =  Double.parseDouble(a);
                        Double numbertheree =  Double.parseDouble(t);


  //MATH 
 double Vtwo=numberone+numbertwo*numbertheree;
                  System.out.println(Vtwo);
  
  JOptionPane.showMessageDialog(frame2, "The answer is :"+Vtwo);}
  catch (Exception e){
        
                JOptionPane.showMessageDialog(frame2,"error, for one of the numbers you put a letter , please only input numbers and decimals, error code:"+e);}
  
  
              }
                    
                  else  if (event.getSource().equals(f3)){
                  JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JFrame frame2=new JFrame();
            JPanel pannel2=new JPanel();
            ImageIcon imageIcon = new ImageIcon("formulatheere.png");
            JLabel label = new JLabel(imageIcon);
  
            panel.add(label);
        //frame one stuff
                frame.setVisible(true);
                frame.add(panel);
                frame.pack(); 
                frame.setLocation(1000, 343);
         //ask user stuff
           String V= JOptionPane.showInputDialog(null,"please input V₁ , well square the number for you");
            String a= JOptionPane.showInputDialog(null,"please input a");
            String x= JOptionPane.showInputDialog(null,"please input △x ");
            //error catching
try{
            Double one =  Double.parseDouble(V);
            Double two =  Double.parseDouble(a);
            Double theere =  Double.parseDouble(x);
          
    double answer=(one*one)+((2*two)*theere);
  
  JOptionPane.showMessageDialog(frame2, "The answer is :"+answer);}
  catch (Exception e){
              
JOptionPane.showMessageDialog(frame2,"error, for one of the numbers you put a letter , please only input numbers and decimals, error code:"+e);  }
              }
                    
                     else  if (event.getSource().equals(f4)){
                              JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JFrame frame2=new JFrame();
            JPanel pannel2=new JPanel();
            ImageIcon imageIcon = new ImageIcon("formulafour.png");
                JLabel label = new JLabel(imageIcon);
  
            panel.add(label);
             frame.setVisible(true);
                frame.add(panel);
                frame.pack(); 
                frame.setLocation(150, 600);
                
                String V= JOptionPane.showInputDialog(null,"please input V₁ , we'll square the number for you");
            String t= JOptionPane.showInputDialog(null,"please input  △t ");
            String a= JOptionPane.showInputDialog(null,"please input a ");
            //error catching
            try{
            Double one =  Double.parseDouble(V);
             Double two =  Double.parseDouble(t);
            Double theere =  Double.parseDouble(a);

            
   double answer=(one*two)+((0.5*two)*theere);
  JOptionPane.showMessageDialog(frame2, "The answer is :"+answer);}
            catch (Exception e){
                       
     JOptionPane.showMessageDialog(frame2,"error, for one of the numbers you put a letter , please only input numbers and decimals, error code:"+e);}
              
              }
                     else  if (event.getSource().equals(f5)){
      JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JFrame frame2=new JFrame();
            JPanel pannel2=new JPanel();
              ImageIcon imageIcon = new ImageIcon("formulafive.png");
  JLabel label = new JLabel(imageIcon);
  
  panel.add(label);
        //frame one stuff 
            frame.setVisible(true);
             frame.add(panel);
                      frame.pack(); 
 frame.setLocation(400, 600) ;   
      
                String V= JOptionPane.showInputDialog(null,"please input V₂ , we'll square the number for you");
            String t= JOptionPane.showInputDialog(null,"please input  △t ");
            String a= JOptionPane.showInputDialog(null,"please input a ");
            try{
            Double one =  Double.parseDouble(V);
            Double two =  Double.parseDouble(t);
            Double theere =  Double.parseDouble(a);
               double answer=(one*two)-((0.5*two)*theere);
              
  JOptionPane.showMessageDialog(frame2, "The answer is :"+answer);}
                        catch (Exception e){
                            
     JOptionPane.showMessageDialog(frame2,"error, for one of the numbers you put a letter , please only input numbers and decimals, error code:"+e);
                        }
                     }
                    
                          else if (event.getSource().equals(f6)){
                              
                           JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JFrame frame2=new JFrame();
            JPanel pannel2=new JPanel();
              ImageIcon imageIcon = new ImageIcon("formulasix.png");
  JLabel label = new JLabel(imageIcon);
  
  panel.add(label);
        //frame one stuff 
            frame.setVisible(true);
             frame.add(panel);
                      frame.pack(); 
 frame.setLocation(400, 600) ;       
                                     

          String V= JOptionPane.showInputDialog(null,"please input V₁ ");
            String Vtwo= JOptionPane.showInputDialog(null,"please input  V₂ ");
            String t= JOptionPane.showInputDialog(null,"please input △t ");
            try{
            Double one =  Double.parseDouble(V);
            Double two =  Double.parseDouble(Vtwo);
            Double theere =  Double.parseDouble(t);


                              
               double answer=0.5*(one+two)*theere;
  JOptionPane.showMessageDialog(frame2, "The answer is :"+answer);}
            catch (Exception e){
                      
     JOptionPane.showMessageDialog(frame2,"error, for one of the numbers you put a letter , please only input numbers and decimals, error code:"+e);}
            
              }
                    
                    
                    
            }
        }
 
    


}
    public static void main(String[] args) {
           IA main = new IA();
        MainPanel frame = main.new MainPanel();

    }
    
}

        

