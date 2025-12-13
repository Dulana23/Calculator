
package my.calculator;


import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;






public class Home extends JFrame{
    private double num1, num2, num3, result;
    private char operator;
    private double num4, num5;
    
     public Home(){
               
           
             
       
            AppIconUtil.applyIcon(this);
            setTitle("My Calculator");
            setSize(380,550);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            
             
               
                     
           JTextField textfield = new JTextField("0");
              textfield.setFont(new Font("Arial", Font.BOLD, 30));
              textfield.setHorizontalAlignment(JTextField.RIGHT);
              textfield.setEditable(false);
              textfield.setBorder(new LineBorder(Color.BLUE, 2));
              textfield.setBackground(Color.white);
              
           
             
           
                     
              JPanel panel3 = new JPanel();
               BoxLayout bx = new BoxLayout(panel3, BoxLayout.PAGE_AXIS);
               panel3.setLayout(bx);
               
               panel3.setBackground(Color.WHITE);
               JLabel titleLabel = new JLabel("Standard Calculator");
                 titleLabel.setFont(new Font("Arial", Font.BOLD, 20)); 
                  panel3.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));
                      panel3.add(titleLabel);
                      panel3.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));
                      panel3.add(textfield);
                      panel3.add(javax.swing.Box.createRigidArea(new Dimension(0, 10)));
                       add(panel3, BorderLayout.NORTH);
                  
             JPanel panel2 = new JPanel();
              panel2.setLayout(new GridLayout(6,4,5,5));
                panel2.setBackground(Color.WHITE);
               
              Font buttonFont = new Font("Arial", Font.PLAIN, 18);
              
                JButton b1 = new JButton("%");
                b1.setFont(buttonFont);
                
               JButton b2 = new JButton("CE");
                b2.setFont(buttonFont);
                
               
               
               JButton b3 = new JButton("C");
                b3.setFont(buttonFont);
               
                
                b3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                      textfield.setText("");
                }
                
                
                });
                
               JButton b4 = new JButton();
                  FlatSVGIcon svgIcon = new FlatSVGIcon("my/calculator/img/clear_icon.svg", 60, 50);
                 b4.setIcon(svgIcon);
                b4.setFont(buttonFont);
                
                
                b4.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                      String currentText = textfield.getText();
                      if (!currentText.isEmpty()) {
                           textfield.setText(currentText.substring(0, currentText.length() - 1));
                    }
                }
                
                
                });
                
               
                
               JButton b5 = new JButton("1/x");
                b5.setFont(buttonFont);
               
               JButton b6 = new JButton("x\u00B2");
                b6.setFont(buttonFont);
                
                
               JButton b7 = new JButton("\u221Ax");
                b7.setFont(buttonFont);
                
                
               JButton b8 = new JButton("/");
                b8.setFont(buttonFont);
              
                
               JButton b9 = new JButton("7");
                b9.setFont(buttonFont);
                
                
                
                
               JButton b10 = new JButton("8");
                b10.setFont(buttonFont);
               
                
                
                
               JButton b11 = new JButton("9");
                b11.setFont(buttonFont);
                
                
                
               JButton b12 = new JButton("x");
                b12.setFont(buttonFont);
                
               
              
               JButton b13 = new JButton("4");
                b13.setFont(buttonFont);
                
               
                
               JButton b14 = new JButton("5");
                b14.setFont(buttonFont);
                

                
               JButton b15 = new JButton("6");
                b15.setFont(buttonFont);
                
                
                
               JButton b16 = new JButton("-");
                b16.setFont(buttonFont);
                
                
               JButton b17 = new JButton("3");
                b17.setFont(buttonFont);
                
                
                
                
               JButton b18 = new JButton("2");
                b18.setFont(buttonFont);
                
                
               
                
               JButton b19 = new JButton("1");
                b19.setFont(buttonFont);
                
                
                
               JButton b20 = new JButton("+");
                b20.setFont(buttonFont);
                   
               JButton b21 = new JButton("\u00B1");
                b21.setFont(buttonFont);
                
                
               JButton b22 = new JButton("0");
                b22.setFont(buttonFont);
               
                
               
                
               JButton b23 = new JButton(".");
                b23.setFont(buttonFont);
                
                
               JButton b24 = new JButton("=");
                b24.setFont(buttonFont);
                b24.setBackground(new Color(51,153,255));
                b24.setOpaque(true);
                b24.setBorderPainted(false);
                
              panel2.add(b2);
              panel2.add(b3);
              panel2.add(b4);
              panel2.add(b1);
              panel2.add(b5);
              panel2.add(b6);
              panel2.add(b7);
              panel2.add(b8);
              panel2.add(b9);
              panel2.add(b10);
              panel2.add(b11);
              panel2.add(b12);
              panel2.add(b13);
              panel2.add(b14);
              panel2.add(b15);
              panel2.add(b16);
              panel2.add(b19);
              panel2.add(b18);
              panel2.add(b17);
              panel2.add(b20);
              panel2.add(b21);
              panel2.add(b22);
              panel2.add(b23);
              panel2.add(b24);
               
                  
                 ActionListener listener1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   JButton source = (JButton) e.getSource();
                   String buttonText = source.getText();
                   String currentText = textfield.getText();
                    
                 
                    if (currentText.length() < 16) {
                          if (currentText.equals("0")) {
                              textfield.setText(buttonText);
                        } else {
                              textfield.setText(currentText + buttonText);
                        }
                    }
                }
                
                
              
                
                };
                
                b9.addActionListener(listener1);
                b10.addActionListener(listener1);
                b11.addActionListener(listener1);
                b13.addActionListener(listener1);
                b14.addActionListener(listener1);
                b15.addActionListener(listener1);
                b17.addActionListener(listener1);
                b18.addActionListener(listener1);
                b19.addActionListener(listener1);
                b22.addActionListener(listener1);
                b23.addActionListener(listener1);
                
              ActionListener listener2 = new ActionListener() {
                  
                @Override
                public void actionPerformed(ActionEvent e) {
                   
                     String command = e.getActionCommand();
                       if (command.matches("\\d") || command.equals(".")) {
                         textfield.setText(textfield.getText() + command);
                       } else if(command.equals("+") || command.equals("-") || command.equals("x") || command.equals("/") ){
                        num1 = Double.parseDouble(textfield.getText());
                         operator = command.charAt(0);
                           textfield.setText("");
                    } else if(command.equals("=")){
                          num2 = Double.parseDouble(textfield.getText());
                         switch (operator){
                             case '+': result = num1 + num2; break;
                             case '-': result = num1 - num2; break;
                             case 'x': result = num1 * num2; break;
                             case '/': result = num1 / num2; break;
                             
                             
                            
                         }
                         textfield.setText(String.valueOf(result));
                         
                     }else if(command.equals("%")){
                           result =  Double.parseDouble(textfield.getText()) * 100;
                           textfield.setText(result+ "%");
                     }
                   
                }

                 
                
                };
             
             
             b20.addActionListener(listener2);
             b16.addActionListener(listener2);
             b12.addActionListener(listener2);
             b8.addActionListener(listener2);
             b1.addActionListener(listener2);
            
             
             b24.addActionListener(listener2);
               
              ActionListener listener3 = new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.matches("\\d") || command.equals(".")) {
                textfield.setText(textfield.getText() + command);
            } else if (command.equals("x\u00B2")) {
                num3 = Integer.parseInt(textfield.getText());
                int result =  (int) Math.pow(num3, 2);
                textfield.setText(String.valueOf(result));
            } 
                
            } 
                 
              };
                
                b6.addActionListener(listener3);
             
              ActionListener listener4 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.matches("\\d") || command.equals(".")) {
                        textfield.setText(textfield.getText() + command);
                    }else if(command.equals("\u221Ax")){
                        num4 = Double.parseDouble(textfield.getText());
                        double result =  Math.sqrt(num4);
                        textfield.setText(String.valueOf(result));
                  }
                }
              };
          
              b7.addActionListener(listener4);
              
              ActionListener listener5 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    
                    if (command.matches("\\d") || command.equals(".")) {
                        textfield.setText(textfield.getText() + command);
                    }else if(command.equals("1/x")){
                        try {
                             num5 = Double.parseDouble(textfield.getText());
                             if (num5 !=0) {
                                 double result = 1/num5;
                                 textfield.setText(String.valueOf(result));
                            }else{
                                 textfield.setText("Error: Division by 0");
                             }
                        } catch (NumberFormatException ex) {
                             textfield.setText("Invalid Input");
                        }
                    }
                }
              };    
                        b5.addActionListener(listener5);
     
              add(panel2, BorderLayout.CENTER);
     }
     
     public class AppIconUtil {

    static Image appIcon;

    static {
        try {
            URL iconPath = AppIconUtil.class.getResource("/my/calculator/img/calculator.png");
            ImageIcon icon = new ImageIcon(iconPath);
            AppIconUtil.appIcon = icon.getImage();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Invalid icon path...");
        }
    }

    public static void applyIcon(JFrame frame) {
        if (frame != null) {
            frame.setIconImage(appIcon);
        }
    }
}
     
  
    
    public static void main(String[] args) {
          FlatLightLaf.setup();
          
          try {
            

             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }
            Home home = new Home(); 
            home.setVisible(true);
      
      }

   

    
    }

