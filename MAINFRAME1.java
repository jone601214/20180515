import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.xml.soap.Text;

public class MAINFRAME1 extends JFrame implements ActionListener{
    private JPanel jPanel1,jPanel2;

    private JTextField resultField;

    private JButton s1,s2,s3,s4,s5,s6,s7,s8,s9,s0,b1,b2,b3,b4,f1,f2,f3,f4,f5,f6;

    private boolean end,add,sub,mul,div;

    private String str;

    private double num1,num2,num3,num4;



    public MAINFRAME1(){

        super("計算機");

        setSize(1000,840);

        Container con=getContentPane();

        con.setLayout(new BorderLayout());

        jPanel1=new JPanel();

        jPanel1.setLayout(new GridLayout(1,1));

        jPanel2=new JPanel();

        jPanel2.setLayout(new GridLayout(4,5));

        resultField=new JTextField("0");

        jPanel1.add(resultField);
        jPanel2.setFont(new Font(null,Font.BOLD,72));

        con.add(jPanel1,BorderLayout.NORTH);

        s1=new JButton(" 1 "); s1.addActionListener(this);

        s2=new JButton(" 2 "); s2.addActionListener(this);

        s3=new JButton(" 3 "); s3.addActionListener(this);

        s4=new JButton(" 4 "); s4.addActionListener(this);

        s5=new JButton(" 5 "); s5.addActionListener(this);

        s6=new JButton(" 6 "); s6.addActionListener(this);

        s7=new JButton(" 7 "); s7.addActionListener(this);

        s8=new JButton(" 8 "); s8.addActionListener(this);

        s9=new JButton(" 9 "); s9.addActionListener(this);

        s0=new JButton(" 0 "); s0.addActionListener(this);

        b1=new JButton(" + "); b1.addActionListener(this);

        b2=new JButton(" - "); b2.addActionListener(this);

        b3=new JButton(" * "); b3.addActionListener(this);
        b4=new JButton(" / "); b4.addActionListener(this);

        f1=new JButton(" . "); f1.addActionListener(this);

        f2=new JButton(" = "); f2.addActionListener(this);

        f3=new JButton("AC");f3.addActionListener(this);

        f4=new JButton("PI");f4.addActionListener(this);

        f5=new JButton("Sqrt");f5.addActionListener(this);

        f6=new JButton("Exit");f6.addActionListener(this);
        jPanel2.add(s1);

        jPanel2.add(s2);

        jPanel2.add(s3);

        jPanel2.add(b1);

        jPanel2.add(f3);

        jPanel2.add(s4);

        jPanel2.add(s5);

        jPanel2.add(s6);

        jPanel2.add(b2);

        jPanel2.add(f5);

        jPanel2.add(s7);

        jPanel2.add(s8);

        jPanel2.add(s9);

        jPanel2.add(b3);

        jPanel2.add(f4);

        jPanel2.add(s0);

        jPanel2.add(f1);

        jPanel2.add(f2);

        jPanel2.add(b4);

        jPanel2.add(f6);

        jPanel2.setFont(new Font(null,Font.BOLD,72));

        con.add(jPanel2,BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public void num(int i){

        String s = null;

        s=String.valueOf(i);

        if(end){
            resultField.setText("0");
            end=false;
        }

        if((resultField.getText()).equals("0")){

            resultField.setText(s);

        }

        else{

            str = resultField.getText() + s;

            resultField.setText(str);

        }
    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==s1)

            num(1);
        else if(e.getSource()==s2)

            num(2);

        else if(e.getSource()==s3)

            num(3);

        else if(e.getSource()==s4)

            num(4);

        else if(e.getSource()==s5)

            num(5);

        else if(e.getSource()==s6)

            num(6);

        else if(e.getSource()==s7)

            num(7);

        else if(e.getSource()==s8)

            num(8);

        else if(e.getSource()==s9)

            num(9);

        else if(e.getSource()==s0)

            num(0);

        else if(e.getSource()==b1)

            sign(1);

        else if(e.getSource()==b2)

            sign(2);

        else if(e.getSource()==b3)

            sign(3);

        else if(e.getSource()==b4)

            sign(4);

        else if(e.getSource()==f1){

            str=resultField.getText();

            if(str.indexOf(".")<=1){

                str+=".";

                resultField.setText(str);

            }

        }

        else if(e.getSource()==f2) {
            num2 = Double.parseDouble(resultField.getText());
        }else if (e.getSource()==f4) {
            num3=Math.PI;
        }else if (e.getSource()==f3) {
            resultField.setText("0");
        }else if (e.getSource()==f5) {
            num4 = Math.sqrt(resultField.getColumns());
        }else if (e.getSource()==f6){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
            if(add){

                num1=num1 + num2;}

            else if(sub){

                num1=num1 - num2;}

            else if(mul){

                num1=num1 * num2;}

            else if(div){

                num1=num1 / num2;}

            resultField.setText(String.valueOf(num1));

            end=true;

        }

    }

    public void sign(int s){

        if(s==1){

            add=true;

            sub=false;

            mul=false;

            div=false;

        }

        else if(s==2){

            add=false;

            sub=true;

            mul=false;

            div=false;

        }

        else if(s==3){

            add=false;

            sub=false;

            mul=true;

            div=false;

        }

        else if(s==4){

            add=false;

            sub=false;

            mul=false;

            div=true;

        }

        num1=Double.parseDouble(resultField.getText());

        end=true;

    }

    public static void main(String[] args){

        MAINFRAME1 th1=new MAINFRAME1();

        th1.show();

    }
    }




