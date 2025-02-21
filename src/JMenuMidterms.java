/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CIIT
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class JMenuMidterms {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Sample Menu");
            frame.setLayout(null);
            frame.setLocationRelativeTo(null);
        
        JMenuBar jm = new JMenuBar();
        JMenu menu = new JMenu("Main Menu");
            JMenuItem AddMenu = new JMenuItem("Add");
            JMenuItem SubMenu = new JMenuItem("Sub");
            JMenuItem MulMenu = new JMenuItem("Mul");
            JMenuItem DivMenu = new JMenuItem("Div");
            JMenuItem HomeMenu = new JMenuItem("Home");
        
        JMenu about = new JMenu("About");
                    JMenuItem confirmAbout = new JMenuItem("Learn more about the Programmer");
        
        JMenu exitMenu = new JMenu("Exit");
            JMenuItem confirmExit = new JMenuItem("Confirm");
        
        frame.add(jm);
            frame.setJMenuBar(jm);
        
        
        jm.add(menu);
        
            menu.add(AddMenu);
            menu.add(SubMenu);
            menu.add(MulMenu);
            menu.add(DivMenu);
            menu.add(HomeMenu);
        
        jm.add(about);
            about.add(confirmAbout);
        
        jm.add(exitMenu);
            exitMenu.add(confirmExit);

        JLabel label_1 = new JLabel("First Number: ");
            label_1.setBounds(40, 120, 160, 20);
            label_1.setVisible(false);
            label_1.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(label_1);
                    
        JLabel label_2 = new JLabel("Second Number:");
            label_2.setBounds(40, 150, 160, 20);
            label_2.setVisible(false);
            label_2.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(label_2);
                        
        JLabel operation = new JLabel("Default: ");
            operation.setBounds(40, 180, 160, 20);
            operation.setVisible(false);
            operation.setFont(new Font("Arial", Font.BOLD, 18));
            frame.add(operation);
            
        JTextField field_1 = new JTextField();
            field_1.setBounds(200, 120, 200, 20);
            field_1.setVisible(false);
            field_1.setFont(new Font("Arial", Font.PLAIN, 18));
            frame.add(field_1);
            
        JTextField field_2 = new JTextField();
            field_2.setBounds(200, 150, 200, 20);
            field_2.setVisible(false);
            field_2.setFont(new Font("Arial", Font.PLAIN, 18));
            frame.add(field_2);
        
        JTextField field_3 = new JTextField();
            field_3.setBounds(200, 180, 200, 20);
            field_3.setVisible(false);
            field_3.setFont(new Font("Arial", Font.PLAIN, 18));
            field_3.setEditable(false);
            frame.add(field_3);
            
            
        JButton btn = new JButton("btn");
            btn.setBounds(80, 300, 100, 40);
            btn.setVisible(false);            
            frame.add(btn);
 
        JButton clearBtn = new JButton("CLEAR");
            clearBtn.setBounds(190, 300, 100, 40);
            clearBtn.setVisible(false);            
            frame.add(clearBtn);       
            
        JButton exitBtn = new JButton("Exit");
            exitBtn.setBounds(300, 300, 100, 40);
            exitBtn.setVisible(false);            
            frame.add(exitBtn);  
        
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(246, 207, 103));
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AddMenu.addActionListener((ActionEvent e) ->{
            
            label_1.setVisible(true);                                   
            label_2.setVisible(true);
            operation.setVisible(true);
                operation.setText("Sum:");
                
            field_1.setVisible(true);
            field_2.setVisible(true);
            field_3.setVisible(true);
            
            btn.setText("ADD");
                btn.setVisible(true);
            
            clearBtn.setVisible(true);
            exitBtn.setVisible(true);
                        
        });
        
        
        SubMenu.addActionListener((ActionEvent e) ->{
            
            label_1.setVisible(true);                                   
            label_2.setVisible(true);
            operation.setVisible(true);
                operation.setText("Difference:");
                
            field_1.setVisible(true);
            field_2.setVisible(true);
            field_3.setVisible(true);
            
            btn.setText("SUB");
                btn.setVisible(true);
            
            clearBtn.setVisible(true);
            exitBtn.setVisible(true);
        });
        
        
        
        MulMenu.addActionListener((ActionEvent e) ->{
            
            label_1.setVisible(true);                                   
            label_2.setVisible(true);
            operation.setVisible(true);
                operation.setText("Product:");
                
            field_1.setVisible(true);
            field_2.setVisible(true);
            field_3.setVisible(true);
            
            btn.setText("MULT");
                btn.setVisible(true);
            
            clearBtn.setVisible(true);
            exitBtn.setVisible(true);
        });
        
        DivMenu.addActionListener((ActionEvent e) ->{
            
            label_1.setVisible(true);                                   
            label_2.setVisible(true);
            operation.setVisible(true);
                operation.setText("Quotient:");
                
            field_1.setVisible(true);
            field_2.setVisible(true);
            field_3.setVisible(true);
            
            btn.setText("DIV");
                btn.setVisible(true);
            
            clearBtn.setVisible(true);
            exitBtn.setVisible(true);
        });
        
        HomeMenu.addActionListener((ActionEvent e) ->{
            
            label_1.setVisible(false);                                   
            label_2.setVisible(false);
            operation.setVisible(false);
                operation.setText("Default:");
                
            field_1.setVisible(false);
            field_2.setVisible(false);
            field_3.setVisible(false);
            
            btn.setText("DEF");
                btn.setVisible(false);
            
            clearBtn.setVisible(false);
            exitBtn.setVisible(false);
        });
        
        
        confirmAbout.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(null, "Programmmer: Krystian L. Genson \n Made During OOP Class, CIIT KAMUNING, QC.");
        });
        
        clearBtn.addActionListener((ActionEvent e)->{
            field_1.setText(null);
            field_2.setText(null);
            field_3.setText(null);
        });
        
        exitBtn.addActionListener((ActionEvent e)->{
            label_1.setVisible(false);                                   
            label_2.setVisible(false);
            operation.setVisible(false);
                operation.setText("Default:");
                
            field_1.setVisible(false);
            field_2.setVisible(false);
            field_3.setVisible(false);
            
            btn.setText("DEF");
                btn.setVisible(false);
            
            clearBtn.setVisible(false);
            exitBtn.setVisible(false);
        });
        
        confirmExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        btn.addActionListener((ActionEvent e)->{
            float x = Integer.parseInt(field_1.getText());
            float y = Integer.parseInt(field_2.getText());
            float z;
            switch (btn.getText()) {
                case "ADD":
                    z = x+y;
                    field_3.setText(String.valueOf(z));
                    break;
                case "SUB":
                    z = x-y;
                    field_3.setText(String.valueOf(z));
                    break;
                    
                case "MUL":
                    z = x*y;
                    field_3.setText(String.valueOf(z));
                    break;
                    
                case "DIV":
                    z = x/y;
                    field_3.setText(String.valueOf(z));
                    break;
                default:
                    throw new AssertionError();
            }
        });
    }
}

