import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Chi_Square_Calculator_2X2 extends JFrame implements ActionListener {
    JLabel labelname,label1,label2,label3,label4,label5,label6,label7,label_output,label_hypothesis,ab,cd,ac,bd,GT;
    JTextField textField1,textField2,textField3,textField4,textFieldA,textFieldB,textFieldC,textFieldD;
    JButton b1,b2;
    JComboBox comboBox1;

    Chi_Square_Calculator_2X2() {

        labelname= new JLabel("Chi_Square Calculator 2X2");
        labelname.setBounds(250,0,400,20);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelname.setForeground(Color.decode("#7FD8BE"));
        add(labelname);
        //input section
        textField1 = new JTextField("Group 1");
        textField1.setBounds(40, 90, 100, 30);
        textField1.setBackground(Color.decode("#7FD8BE"));
        textField1.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField1.setForeground(Color.WHITE);
        add(textField1);

        textField2 = new JTextField("Group 2");
        textField2.setBounds(40, 160, 100, 30);
        textField2.setBackground(Color.decode("#7FD8BE"));
        textField2.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField2.setForeground(Color.white);
        add(textField2);

        textField3 = new JTextField("Outcome 1");
        textField3.setBounds(175, 40, 150, 30);
        textField3.setBackground(Color.decode("#7FD8BE"));
        textField3.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField3.setForeground(Color.white);
        add(textField3);

        textField4 = new JTextField("Outcome 2");
        textField4.setBounds(375, 40, 150, 30);
        textField4.setBackground(Color.decode("#7FD8BE"));
        textField4.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField4.setForeground(Color.white);
        add(textField4);

        textFieldA = new JTextField();
        textFieldA.setBounds(175, 90, 150, 30);
        textFieldA.setForeground(Color.white);
        textFieldA.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textFieldA.setBackground(Color.decode("#7FD8BE"));
        add(textFieldA);

        textFieldB = new JTextField();
        textFieldB.setBounds(375, 90, 150, 30);
        textFieldB.setForeground(Color.white);
        textFieldB.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textFieldB.setBackground(Color.decode("#7FD8BE"));
        add(textFieldB);

        textFieldC = new JTextField();
        textFieldC.setBounds(175, 160, 150, 30);
        textFieldC.setForeground(Color.white);
        textFieldC.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textFieldC.setBackground(Color.decode("#7FD8BE"));
        add(textFieldC);

        textFieldD = new JTextField();
        textFieldD.setBounds(375, 160, 150, 30);
        textFieldD.setForeground(Color.white);
        textFieldD.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textFieldD.setBackground(Color.decode("#7FD8BE"));
        add(textFieldD);
        //total print
        label5 = new JLabel("");
        label5.setBounds(40, 200, 100, 30);
        label5.setFont(new Font("Tahoma", Font.BOLD, 16));
        label5.setForeground(Color.decode("#7FD8BE"));
        add(label5);

        label6 = new JLabel("");
        label6.setBounds(575, 40, 100, 30);
        label6.setFont(new Font("Tahoma", Font.BOLD, 16));
        label6.setForeground(Color.decode("#7FD8BE"));
        add(label6);

        ac = new JLabel("");
        ac.setBounds(175, 200, 150, 30);
        ac.setForeground(Color.decode("#7FD8BE"));
        ac.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(ac);

        bd = new JLabel();
        bd.setBounds(375, 200, 150, 30);
        bd.setForeground(Color.decode("#7FD8BE"));
        bd.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(bd);

        ab = new JLabel();
        ab.setBounds(575, 90, 150, 30);
        ab.setForeground(Color.decode("#7FD8BE"));
        ab.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(ab);

        cd = new JLabel();
        cd.setBounds(575, 160, 150, 30);
        cd.setForeground(Color.decode("#7FD8BE"));
        cd.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(cd);

        GT = new JLabel();
        GT.setBounds(575, 200, 150, 30);
        GT.setForeground(Color.decode("#7FD8BE"));
        GT.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(GT);
        // significance level selection
        label7 = new JLabel("Significance Level");
        label7.setBounds(175, 250, 200, 30);
        label7.setFont(new Font("Tahoma", Font.BOLD, 16));
        label7.setForeground(Color.decode("#7FD8BE"));
        add(label7);

        comboBox1 = new JComboBox(new String[]{"0.01", "0.05", "0.025"});
        comboBox1.setForeground(Color.white);
        comboBox1.setBounds(175,280,150,30);
        comboBox1.setBackground(Color.decode("#7FD8BE"));
        comboBox1.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(comboBox1);

        b1 = new JButton("Calculate");
        b1.setBounds(175,330,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.decode("#00A676"));
        b1.setForeground(Color.decode("#FCEFEF"));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Close");
        b2.setBounds(375,330,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.decode("#00A676"));
        b2.setForeground(Color.decode("#FCEFEF"));
        add(b2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(303);
            }
        });

        // Result of Chi_square Hypothesis
        label_output=new JLabel("Calculation output");
        label_output.setBounds(40,370,600,45);
        label_output.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label_output.setForeground(Color.decode("#7FD8BE"));
        add(label_output);

        label_hypothesis = new JLabel("Hypothesis Accept or Reject ?");
        label_hypothesis.setBounds(40,420,600,45);
        label_hypothesis.setFont(new Font("Tahoma",Font.PLAIN,15));
        label_hypothesis.setForeground(Color.decode("#7FD8BE"));
        add(label_hypothesis);




        getContentPane().setBackground(Color.decode("#E5FCF5"));
        setLocation(400, 0);
        setLayout(null);
        setSize(750, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            try {

                String a = textFieldA.getText();
                String b = textFieldB.getText();
                String c = textFieldC.getText();
                String d = textFieldD.getText();

                String Significant = (String) comboBox1.getSelectedItem();

                double totalac = Double.parseDouble(a)+Double.parseDouble(c);
                ac.setText(""+totalac);
                double totalbd = Double.parseDouble(b)+Double.parseDouble(d);
                bd.setText(""+totalbd);
                double totalab = Double.parseDouble(a)+Double.parseDouble(b);
                ab.setText(""+totalab);
                double totalcd = Double.parseDouble(c)+Double.parseDouble(d);
                cd.setText(""+totalcd);
                double total_total = totalab+totalcd;
                GT.setText(""+total_total);


                double N = Double.parseDouble(a)+Double.parseDouble(b)+Double.parseDouble(c)+Double.parseDouble(d);
                double x = Double.parseDouble(a)*Double.parseDouble(d)-Double.parseDouble(b)*Double.parseDouble(c);
                double xsq = Math.pow(x,2);
                double p = N*xsq;
                double q = totalac*totalab*totalcd*totalbd;
                double Xsq = p/q;


                double sign = Double.parseDouble(Significant);
                if(sign==0.05){
                    if(Xsq<3.841) {
                        label_hypothesis.setText("Hypothesis Accepted!");
                    }else {
                        label_hypothesis.setText("Hypothesis Rejected!");
                    }
                }if(sign==0.01){
                    if(Xsq<2.706) {
                        label_hypothesis.setText("Hypothesis Accepted!");
                    }else {
                        label_hypothesis.setText("Hypothesis Rejected!");
                    }
                }if(sign==0.025){
                    if(Xsq<5.024) {
                        label_hypothesis.setText("Hypothesis Accepted!");
                    }else {
                        label_hypothesis.setText("Hypothesis Rejected!");
                    }
                }

                label6.setText("Total");
                label5.setText("Total");
                label_output.setText("Chi-Square statistic is "+Xsq+". Significant at "+sign);

            }catch (Exception E){
                E.printStackTrace();

            }

        }


    }
    public static void main(String[] args){
        new Chi_Square_Calculator_2X2();
    }
}
