/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {
    public int WIDTH =445,widthTF=120, widthB =100;
    public int HEIGHT = 300, heightTF = 30, heightB= 30;
    public JTextField textF1, textF2, textF3;
    public JButton sum,res,div,mult,bin,dec,oct,hex;
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(75,40,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(225,40,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(150,230,widthTF,heightTF));
        
        sum = new JButton("Suma");
        sum.setBounds(new Rectangle(20,115,widthB,heightB));
        
        res = new JButton("Resta");
        res.setBounds(new Rectangle(120,115,widthB,heightB));
        
        mult = new JButton("Multiplicación");
        mult.setBounds(new Rectangle(220,115,widthB,heightB));
        
        div = new JButton("División");
        div.setBounds(new Rectangle(320,115,widthB,heightB));
        
        bin = new JButton("Binario");
        bin.setBounds(new Rectangle(20,150,widthB,heightB));
        
        dec = new JButton("Decimal");
        dec.setBounds(new Rectangle(120,150,widthB,heightB));
        
        oct = new JButton("Octal");
        oct.setBounds(new Rectangle(220,150,widthB,heightB));
        
        hex = new JButton("Hexadecimal");
        hex.setBounds(new Rectangle(320,150,widthB,heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        sum.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                
            }
        });
        
        res.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
             
            }
        });
        
        mult.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                
            }
        });
        
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                
            }
        });
        
        bin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                
            }
        });
        
        dec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                
            }
        });
        
        oct.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
               
            }
        });
        
        hex.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                
            }
        });
        
        add(textF1);
        add(textF2);
        add(textF3);
        add(sum);
        add(res);
        add(mult);
        add(div);
        add(bin);
        add(dec);
        add(oct);
        add(hex);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
}
