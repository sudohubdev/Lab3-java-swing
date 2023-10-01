/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {
    public Graphic(String s) {
        super(s);
        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        //register buttons
        Button sin = new Button("sin");
        sin.setBounds(5,20,100,25);
        add(sin);
        Button cos = new Button("cos");
        cos.setBounds(5,70,100,25);
        add(cos);
        Button x2 = new Button("parabola");
        x2.setBounds(5,120,100,25);
        add(x2);

        //інші лаби
        Button lab2task1 = new Button("lab2task1");
        lab2task1.setBounds(150,20,100,25);
        add(lab2task1);
        Button lab2task2 = new Button("lab2task2");
        lab2task2.setBounds(150,70,100,25);
        add(lab2task2);

        //event handlers
        sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Sinus("Sinus");
            }
        });
        cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Cosinus("Cosinus");
            }
        });
        x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new X2("Parabola");
            }
        });

        lab2task1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ExtEventHandler("Друга програма");
            }
        });
        lab2task2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new House("Власна програма");
            }
        });
    }
}