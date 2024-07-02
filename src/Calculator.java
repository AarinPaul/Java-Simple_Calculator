//Calculator Code

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Calc extends JFrame{
    JTextField t1;
    JTextField t2;

    JButton b1,b2,b3,b4;

    JLabel Ml1;
    JLabel l1;
    JLabel l2;

    public Calc(){
        setTitle("Calculator");
        setVisible(true);
        setSize(400,500);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating Heading label
        Ml1 = new JLabel("CALCULATOR");
        add(Ml1);
        setLayout(null);
        Ml1.setBounds(115,10,150,20);
        Ml1.setFont(new Font("Segue UI",Font.BOLD,20));
        Ml1.setForeground(Color.BLUE);

        //Creating Text Field & Label 1
        l1 = new JLabel("Number 1:");
        l1.setBounds(103,75,75,20);
        add(l1);

        t1 = new JTextField(10);
        t1.setBounds(185,75,95,20);
        add(t1);

        //Creating Text Field and & Label 2
        l2 = new JLabel("Number 2:");
        l2.setBounds(103,115,75,20);
        add(l2);

        t2 = new JTextField(10);
        t2.setBounds(185,115,95,20);
        add(t2);

        //Creating Buttons
        b1 = new JButton("+");
        b1.setBounds(115,155,70,30);
        add(b1);

        b2 = new JButton("-");
        b2.setBounds(220,155,70,30);
        add(b2);

        b3 = new JButton("*");
        b3.setBounds(115,191,70,30);
        add(b3);

        b4 = new JButton("/");
        b4.setBounds(220,191,70,30);
        add(b4);

        //Result box creation
        JLabel l3 = new JLabel("Result :");
        l3.setBounds(130,235,75,20);
        add(l3);

        JTextField t3 = new JTextField(10);
        t3.setBounds(186,235,95,20);
        add(t3);

        //Operators Handling Event
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double num1 = Double.parseDouble(t1.getText());
               double num2 = Double.parseDouble(t2.getText());
               double sum = num1+num2;
               t3.setText(String.valueOf(sum));
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double sub = num1-num2;
                t3.setText(String.format("%.3f", sub));
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double mul = num1*num2;
                t3.setText(String.format("%.3f", mul));
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double div = num1/num2;
                t3.setText(String.format("%.3f", div));
            }
        });
    }
}

public class Calculator {
    public static void main(String[] args){
        Calc c = new Calc();

    }
}
