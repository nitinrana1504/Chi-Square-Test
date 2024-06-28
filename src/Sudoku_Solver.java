import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sudoku_Solver extends JFrame implements ActionListener {
    JLabel labelname,note;
    JTextField a00,a01,a02,a03,a04,a05,a06,a07,a08,a10,a11,a12,a13,a14,a15,a16,a17,a18,a20,a21,a22,a23,a24,a25,a26,a27,a28,a30,a31,a32,a33,a34,a35,a36,a37,a38,a40,a41,a42,a43,a44,a45,a46,a47,a48,a50,a51,a52,a53,a54,a55,a56,a57,a58,a60,a61,a62,a63,a64,a65,a66,a67,a68,a70,a71,a72,a73,a74,a75,a76,a77,a78,a80,a81,a82,a83,a84,a85,a86,a87,a88;
    JButton solve,close,reset;
    Sudoku_Solver()
    {
        labelname= new JLabel("Sudoku Solver");
        labelname.setBounds(150,0,400,20);
        labelname.setFont(new Font("serif", Font.BOLD, 20));
        labelname.setForeground(Color.decode("#7FD8BE"));
        add(labelname);

        note = new JLabel("");
        note.setBounds(40,40,400,20);
        note.setFont(new Font("serif",Font.PLAIN,15));
        note.setForeground(Color.decode("#7FD8BE"));
        add(note);


        a00 = new JTextField("");
        a00.setBounds(40, 80, 35, 35);
        a00.setBackground(Color.decode("#7FD8BE"));
        a00.setFont(new Font("Tahoma", Font.BOLD, 16));
        a00.setForeground(Color.WHITE);
        add(a00);

        a01 = new JTextField("");
        a01.setBounds(75, 80, 35, 35);
        a01.setBackground(Color.decode("#7FD8BE"));
        a01.setFont(new Font("Tahoma", Font.BOLD, 16));
        a01.setForeground(Color.WHITE);
        add(a01);

        a02 = new JTextField("");
        a02.setBounds(110, 80, 35, 35);
        a02.setBackground(Color.decode("#7FD8BE"));
        a02.setFont(new Font("Tahoma", Font.BOLD, 16));
        a02.setForeground(Color.WHITE);
        add(a02);

        a03 = new JTextField("");
        a03.setBounds(160, 80, 35, 35);
        a03.setBackground(Color.decode("#7FD8BE"));
        a03.setFont(new Font("Tahoma", Font.BOLD, 16));
        a03.setForeground(Color.WHITE);
        add(a03);

        a04 = new JTextField("");
        a04.setBounds(195, 80, 35, 35);
        a04.setBackground(Color.decode("#7FD8BE"));
        a04.setFont(new Font("Tahoma", Font.BOLD, 16));
        a04.setForeground(Color.WHITE);
        add(a04);

        a05 = new JTextField("");
        a05.setBounds(230, 80, 35, 35);
        a05.setBackground(Color.decode("#7FD8BE"));
        a05.setFont(new Font("Tahoma", Font.BOLD, 16));
        a05.setForeground(Color.WHITE);
        add(a05);

        a06 = new JTextField("");
        a06.setBounds(280, 80, 35, 35);
        a06.setBackground(Color.decode("#7FD8BE"));
        a06.setFont(new Font("Tahoma", Font.BOLD, 16));
        a06.setForeground(Color.WHITE);
        add(a06);

        a07 = new JTextField("");
        a07.setBounds(315, 80, 35, 35);
        a07.setBackground(Color.decode("#7FD8BE"));
        a07.setFont(new Font("Tahoma", Font.BOLD, 16));
        a07.setForeground(Color.WHITE);
        add(a07);

        a08 = new JTextField("");
        a08.setBounds(350, 80, 35, 35);
        a08.setBackground(Color.decode("#7FD8BE"));
        a08.setFont(new Font("Tahoma", Font.BOLD, 16));
        a08.setForeground(Color.WHITE);
        add(a08);

        a10 = new JTextField("");
        a10.setBounds(40, 115, 35, 35);
        a10.setBackground(Color.decode("#7FD8BE"));
        a10.setFont(new Font("Tahoma", Font.BOLD, 16));
        a10.setForeground(Color.WHITE);
        add(a10);

        a11 = new JTextField("");
        a11.setBounds(75, 115, 35, 35);
        a11.setBackground(Color.decode("#7FD8BE"));
        a11.setFont(new Font("Tahoma", Font.BOLD, 16));
        a11.setForeground(Color.WHITE);
        add(a11);

        a12 = new JTextField("");
        a12.setBounds(110, 115, 35, 35);
        a12.setBackground(Color.decode("#7FD8BE"));
        a12.setFont(new Font("Tahoma", Font.BOLD, 16));
        a12.setForeground(Color.WHITE);
        add(a12);

        a13 = new JTextField("");
        a13.setBounds(160, 115, 35, 35);
        a13.setBackground(Color.decode("#7FD8BE"));
        a13.setFont(new Font("Tahoma", Font.BOLD, 16));
        a13.setForeground(Color.WHITE);
        add(a13);

        a14 = new JTextField("");
        a14.setBounds(195, 115, 35, 35);
        a14.setBackground(Color.decode("#7FD8BE"));
        a14.setFont(new Font("Tahoma", Font.BOLD, 16));
        a14.setForeground(Color.WHITE);
        add(a14);

        a15 = new JTextField("");
        a15.setBounds(230, 115, 35, 35);
        a15.setBackground(Color.decode("#7FD8BE"));
        a15.setFont(new Font("Tahoma", Font.BOLD, 16));
        a15.setForeground(Color.WHITE);
        add(a15);

        a16 = new JTextField("");
        a16.setBounds(280, 115, 35, 35);
        a16.setBackground(Color.decode("#7FD8BE"));
        a16.setFont(new Font("Tahoma", Font.BOLD, 16));
        a16.setForeground(Color.WHITE);
        add(a16);

        a17 = new JTextField("");
        a17.setBounds(315, 115, 35, 35);
        a17.setBackground(Color.decode("#7FD8BE"));
        a17.setFont(new Font("Tahoma", Font.BOLD, 16));
        a17.setForeground(Color.WHITE);
        add(a17);

        a18 = new JTextField("");
        a18.setBounds(350, 115, 35, 35);
        a18.setBackground(Color.decode("#7FD8BE"));
        a18.setFont(new Font("Tahoma", Font.BOLD, 16));
        a18.setForeground(Color.WHITE);
        add(a18);

        a20 = new JTextField("");
        a20.setBounds(40, 150, 35, 35);
        a20.setBackground(Color.decode("#7FD8BE"));
        a20.setFont(new Font("Tahoma", Font.BOLD, 16));
        a20.setForeground(Color.WHITE);
        add(a20);

        a21 = new JTextField("");
        a21.setBounds(75, 150, 35, 35);
        a21.setBackground(Color.decode("#7FD8BE"));
        a21.setFont(new Font("Tahoma", Font.BOLD, 16));
        a21.setForeground(Color.WHITE);
        add(a21);

        a22 = new JTextField("");
        a22.setBounds(110, 150, 35, 35);
        a22.setBackground(Color.decode("#7FD8BE"));
        a22.setFont(new Font("Tahoma", Font.BOLD, 16));
        a22.setForeground(Color.WHITE);
        add(a22);

        a23 = new JTextField("");
        a23.setBounds(160, 150, 35, 35);
        a23.setBackground(Color.decode("#7FD8BE"));
        a23.setFont(new Font("Tahoma", Font.BOLD, 16));
        a23.setForeground(Color.WHITE);
        add(a23);

        a24 = new JTextField("");
        a24.setBounds(195, 150, 35, 35);
        a24.setBackground(Color.decode("#7FD8BE"));
        a24.setFont(new Font("Tahoma", Font.BOLD, 16));
        a24.setForeground(Color.WHITE);
        add(a24);

        a25 = new JTextField("");
        a25.setBounds(230, 150, 35, 35);
        a25.setBackground(Color.decode("#7FD8BE"));
        a25.setFont(new Font("Tahoma", Font.BOLD, 16));
        a25.setForeground(Color.WHITE);
        add(a25);

        a26 = new JTextField("");
        a26.setBounds(280, 150, 35, 35);
        a26.setBackground(Color.decode("#7FD8BE"));
        a26.setFont(new Font("Tahoma", Font.BOLD, 16));
        a26.setForeground(Color.WHITE);
        add(a26);

        a27 = new JTextField("");
        a27.setBounds(315, 150, 35, 35);
        a27.setBackground(Color.decode("#7FD8BE"));
        a27.setFont(new Font("Tahoma", Font.BOLD, 16));
        a27.setForeground(Color.WHITE);
        add(a27);

        a28 = new JTextField("");
        a28.setBounds(350, 150, 35, 35);
        a28.setBackground(Color.decode("#7FD8BE"));
        a28.setFont(new Font("Tahoma", Font.BOLD, 16));
        a28.setForeground(Color.WHITE);
        add(a28);

        a30 = new JTextField("");
        a30.setBounds(40, 200, 35, 35);
        a30.setBackground(Color.decode("#7FD8BE"));
        a30.setFont(new Font("Tahoma", Font.BOLD, 16));
        a30.setForeground(Color.WHITE);
        add(a30);

        a31 = new JTextField("");
        a31.setBounds(75, 200, 35, 35);
        a31.setBackground(Color.decode("#7FD8BE"));
        a31.setFont(new Font("Tahoma", Font.BOLD, 16));
        a31.setForeground(Color.WHITE);
        add(a31);

        a32 = new JTextField("");
        a32.setBounds(110, 200, 35, 35);
        a32.setBackground(Color.decode("#7FD8BE"));
        a32.setFont(new Font("Tahoma", Font.BOLD, 16));
        a32.setForeground(Color.WHITE);
        add(a32);

        a33 = new JTextField("");
        a33.setBounds(160, 200, 35, 35);
        a33.setBackground(Color.decode("#7FD8BE"));
        a33.setFont(new Font("Tahoma", Font.BOLD, 16));
        a33.setForeground(Color.WHITE);
        add(a33);

        a34 = new JTextField("");
        a34.setBounds(195, 200, 35, 35);
        a34.setBackground(Color.decode("#7FD8BE"));
        a34.setFont(new Font("Tahoma", Font.BOLD, 16));
        a34.setForeground(Color.WHITE);
        add(a34);

        a35 = new JTextField("");
        a35.setBounds(230, 200, 35, 35);
        a35.setBackground(Color.decode("#7FD8BE"));
        a35.setFont(new Font("Tahoma", Font.BOLD, 16));
        a35.setForeground(Color.WHITE);
        add(a35);

        a36 = new JTextField("");
        a36.setBounds(280, 200, 35, 35);
        a36.setBackground(Color.decode("#7FD8BE"));
        a36.setFont(new Font("Tahoma", Font.BOLD, 16));
        a36.setForeground(Color.WHITE);
        add(a36);

        a37 = new JTextField("");
        a37.setBounds(315, 200, 35, 35);
        a37.setBackground(Color.decode("#7FD8BE"));
        a37.setFont(new Font("Tahoma", Font.BOLD, 16));
        a37.setForeground(Color.WHITE);
        add(a37);

        a38 = new JTextField("");
        a38.setBounds(350, 200, 35, 35);
        a38.setBackground(Color.decode("#7FD8BE"));
        a38.setFont(new Font("Tahoma", Font.BOLD, 16));
        a38.setForeground(Color.WHITE);
        add(a38);

        a40 = new JTextField("");
        a40.setBounds(40, 235, 35, 35);
        a40.setBackground(Color.decode("#7FD8BE"));
        a40.setFont(new Font("Tahoma", Font.BOLD, 16));
        a40.setForeground(Color.WHITE);
        add(a40);

        a41 = new JTextField("");
        a41.setBounds(75, 235, 35, 35);
        a41.setBackground(Color.decode("#7FD8BE"));
        a41.setFont(new Font("Tahoma", Font.BOLD, 16));
        a41.setForeground(Color.WHITE);
        add(a41);

        a42 = new JTextField("");
        a42.setBounds(110, 235, 35, 35);
        a42.setBackground(Color.decode("#7FD8BE"));
        a42.setFont(new Font("Tahoma", Font.BOLD, 16));
        a42.setForeground(Color.WHITE);
        add(a42);

        a43 = new JTextField("");
        a43.setBounds(160, 235, 35, 35);
        a43.setBackground(Color.decode("#7FD8BE"));
        a43.setFont(new Font("Tahoma", Font.BOLD, 16));
        a43.setForeground(Color.WHITE);
        add(a43);

        a44 = new JTextField("");
        a44.setBounds(195, 235, 35, 35);
        a44.setBackground(Color.decode("#7FD8BE"));
        a44.setFont(new Font("Tahoma", Font.BOLD, 16));
        a44.setForeground(Color.WHITE);
        add(a44);

        a45 = new JTextField("");
        a45.setBounds(230, 235, 35, 35);
        a45.setBackground(Color.decode("#7FD8BE"));
        a45.setFont(new Font("Tahoma", Font.BOLD, 16));
        a45.setForeground(Color.WHITE);
        add(a45);

        a46 = new JTextField("");
        a46.setBounds(280, 235, 35, 35);
        a46.setBackground(Color.decode("#7FD8BE"));
        a46.setFont(new Font("Tahoma", Font.BOLD, 16));
        a46.setForeground(Color.WHITE);
        add(a46);

        a47 = new JTextField("");
        a47.setBounds(315, 235, 35, 35);
        a47.setBackground(Color.decode("#7FD8BE"));
        a47.setFont(new Font("Tahoma", Font.BOLD, 16));
        a47.setForeground(Color.WHITE);
        add(a47);

        a48 = new JTextField("");
        a48.setBounds(350, 235, 35, 35);
        a48.setBackground(Color.decode("#7FD8BE"));
        a48.setFont(new Font("Tahoma", Font.BOLD, 16));
        a48.setForeground(Color.WHITE);
        add(a48);

        a50 = new JTextField("");
        a50.setBounds(40, 270, 35, 35);
        a50.setBackground(Color.decode("#7FD8BE"));
        a50.setFont(new Font("Tahoma", Font.BOLD, 16));
        a50.setForeground(Color.WHITE);
        add(a50);

        a51 = new JTextField("");
        a51.setBounds(75, 270, 35, 35);
        a51.setBackground(Color.decode("#7FD8BE"));
        a51.setFont(new Font("Tahoma", Font.BOLD, 16));
        a51.setForeground(Color.WHITE);
        add(a51);

        a52 = new JTextField("");
        a52.setBounds(110, 270, 35, 35);
        a52.setBackground(Color.decode("#7FD8BE"));
        a52.setFont(new Font("Tahoma", Font.BOLD, 16));
        a52.setForeground(Color.WHITE);
        add(a52);

        a53 = new JTextField("");
        a53.setBounds(160, 270, 35, 35);
        a53.setBackground(Color.decode("#7FD8BE"));
        a53.setFont(new Font("Tahoma", Font.BOLD, 16));
        a53.setForeground(Color.WHITE);
        add(a53);

        a54 = new JTextField("");
        a54.setBounds(195, 270, 35, 35);
        a54.setBackground(Color.decode("#7FD8BE"));
        a54.setFont(new Font("Tahoma", Font.BOLD, 16));
        a54.setForeground(Color.WHITE);
        add(a54);

        a55 = new JTextField("");
        a55.setBounds(230, 270, 35, 35);
        a55.setBackground(Color.decode("#7FD8BE"));
        a55.setFont(new Font("Tahoma", Font.BOLD, 16));
        a55.setForeground(Color.WHITE);
        add(a55);

        a56 = new JTextField("");
        a56.setBounds(280, 270, 35, 35);
        a56.setBackground(Color.decode("#7FD8BE"));
        a56.setFont(new Font("Tahoma", Font.BOLD, 16));
        a56.setForeground(Color.WHITE);
        add(a56);

        a57 = new JTextField("");
        a57.setBounds(315, 270, 35, 35);
        a57.setBackground(Color.decode("#7FD8BE"));
        a57.setFont(new Font("Tahoma", Font.BOLD, 16));
        a57.setForeground(Color.WHITE);
        add(a57);

        a58 = new JTextField("");
        a58.setBounds(350, 270, 35, 35);
        a58.setBackground(Color.decode("#7FD8BE"));
        a58.setFont(new Font("Tahoma", Font.BOLD, 16));
        a58.setForeground(Color.WHITE);
        add(a58);

        a60 = new JTextField("");
        a60.setBounds(40, 320, 35, 35);
        a60.setBackground(Color.decode("#7FD8BE"));
        a60.setFont(new Font("Tahoma", Font.BOLD, 16));
        a60.setForeground(Color.WHITE);
        add(a60);

        a61 = new JTextField("");
        a61.setBounds(75, 320, 35, 35);
        a61.setBackground(Color.decode("#7FD8BE"));
        a61.setFont(new Font("Tahoma", Font.BOLD, 16));
        a61.setForeground(Color.WHITE);
        add(a61);

        a62 = new JTextField("");
        a62.setBounds(110, 320, 35, 35);
        a62.setBackground(Color.decode("#7FD8BE"));
        a62.setFont(new Font("Tahoma", Font.BOLD, 16));
        a62.setForeground(Color.WHITE);
        add(a62);

        a63 = new JTextField("");
        a63.setBounds(160, 320, 35, 35);
        a63.setBackground(Color.decode("#7FD8BE"));
        a63.setFont(new Font("Tahoma", Font.BOLD, 16));
        a63.setForeground(Color.WHITE);
        add(a63);

        a64 = new JTextField("");
        a64.setBounds(195, 320, 35, 35);
        a64.setBackground(Color.decode("#7FD8BE"));
        a64.setFont(new Font("Tahoma", Font.BOLD, 16));
        a64.setForeground(Color.WHITE);
        add(a64);

        a65 = new JTextField("");
        a65.setBounds(230, 320, 35, 35);
        a65.setBackground(Color.decode("#7FD8BE"));
        a65.setFont(new Font("Tahoma", Font.BOLD, 16));
        a65.setForeground(Color.WHITE);
        add(a65);

        a66 = new JTextField("");
        a66.setBounds(280, 320, 35, 35);
        a66.setBackground(Color.decode("#7FD8BE"));
        a66.setFont(new Font("Tahoma", Font.BOLD, 16));
        a66.setForeground(Color.WHITE);
        add(a66);

        a67 = new JTextField("");
        a67.setBounds(315, 320, 35, 35);
        a67.setBackground(Color.decode("#7FD8BE"));
        a67.setFont(new Font("Tahoma", Font.BOLD, 16));
        a67.setForeground(Color.WHITE);
        add(a67);

        a68 = new JTextField("");
        a68.setBounds(350, 320, 35, 35);
        a68.setBackground(Color.decode("#7FD8BE"));
        a68.setFont(new Font("Tahoma", Font.BOLD, 16));
        a68.setForeground(Color.WHITE);
        add(a68);

        a70 = new JTextField("");
        a70.setBounds(40, 355, 35, 35);
        a70.setBackground(Color.decode("#7FD8BE"));
        a70.setFont(new Font("Tahoma", Font.BOLD, 16));
        a70.setForeground(Color.WHITE);
        add(a70);

        a71 = new JTextField("");
        a71.setBounds(75, 355, 35, 35);
        a71.setBackground(Color.decode("#7FD8BE"));
        a71.setFont(new Font("Tahoma", Font.BOLD, 16));
        a71.setForeground(Color.WHITE);
        add(a71);

        a72 = new JTextField("");
        a72.setBounds(110, 355, 35, 35);
        a72.setBackground(Color.decode("#7FD8BE"));
        a72.setFont(new Font("Tahoma", Font.BOLD, 16));
        a72.setForeground(Color.WHITE);
        add(a72);

        a73 = new JTextField("");
        a73.setBounds(160, 355, 35, 35);
        a73.setBackground(Color.decode("#7FD8BE"));
        a73.setFont(new Font("Tahoma", Font.BOLD, 16));
        a73.setForeground(Color.WHITE);
        add(a73);

        a74 = new JTextField("");
        a74.setBounds(195, 355, 35, 35);
        a74.setBackground(Color.decode("#7FD8BE"));
        a74.setFont(new Font("Tahoma", Font.BOLD, 16));
        a74.setForeground(Color.WHITE);
        add(a74);

        a75 = new JTextField("");
        a75.setBounds(230, 355, 35, 35);
        a75.setBackground(Color.decode("#7FD8BE"));
        a75.setFont(new Font("Tahoma", Font.BOLD, 16));
        a75.setForeground(Color.WHITE);
        add(a75);

        a76 = new JTextField("");
        a76.setBounds(280, 355, 35, 35);
        a76.setBackground(Color.decode("#7FD8BE"));
        a76.setFont(new Font("Tahoma", Font.BOLD, 16));
        a76.setForeground(Color.WHITE);
        add(a76);

        a77 = new JTextField("");
        a77.setBounds(315, 355, 35, 35);
        a77.setBackground(Color.decode("#7FD8BE"));
        a77.setFont(new Font("Tahoma", Font.BOLD, 16));
        a77.setForeground(Color.WHITE);
        add(a77);

        a78 = new JTextField("");
        a78.setBounds(350, 355, 35, 35);
        a78.setBackground(Color.decode("#7FD8BE"));
        a78.setFont(new Font("Tahoma", Font.BOLD, 16));
        a78.setForeground(Color.WHITE);
        add(a78);

        a80 = new JTextField("");
        a80.setBounds(40, 390, 35, 35);
        a80.setBackground(Color.decode("#7FD8BE"));
        a80.setFont(new Font("Tahoma", Font.BOLD, 16));
        a80.setForeground(Color.WHITE);
        add(a80);

        a81 = new JTextField("");
        a81.setBounds(75, 390, 35, 35);
        a81.setBackground(Color.decode("#7FD8BE"));
        a81.setFont(new Font("Tahoma", Font.BOLD, 16));
        a81.setForeground(Color.WHITE);
        add(a81);

        a82 = new JTextField("");
        a82.setBounds(110, 390, 35, 35);
        a82.setBackground(Color.decode("#7FD8BE"));
        a82.setFont(new Font("Tahoma", Font.BOLD, 16));
        a82.setForeground(Color.WHITE);
        add(a82);

        a83 = new JTextField("");
        a83.setBounds(160, 390, 35, 35);
        a83.setBackground(Color.decode("#7FD8BE"));
        a83.setFont(new Font("Tahoma", Font.BOLD, 16));
        a83.setForeground(Color.WHITE);
        add(a83);

        a84 = new JTextField("");
        a84.setBounds(195, 390, 35, 35);
        a84.setBackground(Color.decode("#7FD8BE"));
        a84.setFont(new Font("Tahoma", Font.BOLD, 16));
        a84.setForeground(Color.WHITE);
        add(a84);

        a85 = new JTextField("");
        a85.setBounds(230, 390, 35, 35);
        a85.setBackground(Color.decode("#7FD8BE"));
        a85.setFont(new Font("Tahoma", Font.BOLD, 16));
        a85.setForeground(Color.WHITE);
        add(a85);

        a86 = new JTextField("");
        a86.setBounds(280, 390, 35, 35);
        a86.setBackground(Color.decode("#7FD8BE"));
        a86.setFont(new Font("Tahoma", Font.BOLD, 16));
        a86.setForeground(Color.WHITE);
        add(a86);

        a87 = new JTextField("");
        a87.setBounds(315, 390, 35, 35);
        a87.setBackground(Color.decode("#7FD8BE"));
        a87.setFont(new Font("Tahoma", Font.BOLD, 16));
        a87.setForeground(Color.WHITE);
        add(a87);

        a88 = new JTextField("");
        a88.setBounds(350, 390, 35, 35);
        a88.setBackground(Color.decode("#7FD8BE"));
        a88.setFont(new Font("Tahoma", Font.BOLD, 16));
        a88.setForeground(Color.WHITE);
        add(a88);

        solve = new JButton("SOLVE");
        solve.setBounds(150,440,120,30);
        solve.setFont(new Font("serif",Font.BOLD,15));
        solve.setBackground(Color.decode("#00A676"));
        solve.setForeground(Color.decode("#FCEFEF"));
        solve.addActionListener(this);
        add(solve);

        reset = new JButton("RESET");
        reset.setBounds(150,520,120,30);
        reset.setFont(new Font("serif",Font.BOLD,15));
        reset.setBackground(Color.decode("#00A676"));
        reset.setForeground(Color.decode("#FCEFEF"));
        reset.addActionListener(this);
        add(reset);

        close = new JButton("CLOSE");
        close.setBounds(150,480,120,30);
        close.setFont(new Font("serif",Font.BOLD,15));
        close.setBackground(Color.decode("#00A676"));
        close.setForeground(Color.decode("#FCEFEF"));
        add(close);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(303);
            }
        });

        getContentPane().setBackground(Color.decode("#E5FCF5"));
        setLocation(400, 0);
        setLayout(null);
        setSize(440, 600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==solve){
            try {

                int[][] sudoku = getInts();

                if(SudokuSolver(sudoku,0,0)) {
                    a00.setText("" + sudoku[0][0]);
                    a01.setText("" + sudoku[0][1]);
                    a02.setText("" + sudoku[0][2]);
                    a03.setText("" + sudoku[0][3]);
                    a04.setText("" + sudoku[0][4]);
                    a05.setText("" + sudoku[0][5]);
                    a06.setText("" + sudoku[0][6]);
                    a07.setText("" + sudoku[0][7]);
                    a08.setText("" + sudoku[0][8]);
                    a10.setText("" + sudoku[1][0]);
                    a11.setText("" + sudoku[1][1]);
                    a12.setText("" + sudoku[1][2]);
                    a13.setText("" + sudoku[1][3]);
                    a14.setText("" + sudoku[1][4]);
                    a15.setText("" + sudoku[1][5]);
                    a16.setText("" + sudoku[1][6]);
                    a17.setText("" + sudoku[1][7]);
                    a18.setText("" + sudoku[1][8]);
                    a20.setText("" + sudoku[2][0]);
                    a21.setText("" + sudoku[2][1]);
                    a22.setText("" + sudoku[2][2]);
                    a23.setText("" + sudoku[2][3]);
                    a24.setText("" + sudoku[2][4]);
                    a25.setText("" + sudoku[2][5]);
                    a26.setText("" + sudoku[2][6]);
                    a27.setText("" + sudoku[2][7]);
                    a28.setText("" + sudoku[2][8]);
                    a30.setText("" + sudoku[3][0]);
                    a31.setText("" + sudoku[3][1]);
                    a32.setText("" + sudoku[3][2]);
                    a33.setText("" + sudoku[3][3]);
                    a34.setText("" + sudoku[3][4]);
                    a35.setText("" + sudoku[3][5]);
                    a36.setText("" + sudoku[3][6]);
                    a37.setText("" + sudoku[3][7]);
                    a38.setText("" + sudoku[3][8]);
                    a40.setText("" + sudoku[4][0]);
                    a41.setText("" + sudoku[4][1]);
                    a42.setText("" + sudoku[4][2]);
                    a43.setText("" + sudoku[4][3]);
                    a44.setText("" + sudoku[4][4]);
                    a45.setText("" + sudoku[4][5]);
                    a46.setText("" + sudoku[4][6]);
                    a47.setText("" + sudoku[4][7]);
                    a48.setText("" + sudoku[4][8]);
                    a50.setText("" + sudoku[5][0]);
                    a51.setText("" + sudoku[5][1]);
                    a52.setText("" + sudoku[5][2]);
                    a53.setText("" + sudoku[5][3]);
                    a54.setText("" + sudoku[5][4]);
                    a55.setText("" + sudoku[5][5]);
                    a56.setText("" + sudoku[5][6]);
                    a57.setText("" + sudoku[5][7]);
                    a58.setText("" + sudoku[5][8]);
                    a60.setText("" + sudoku[6][0]);
                    a61.setText("" + sudoku[6][1]);
                    a62.setText("" + sudoku[6][2]);
                    a63.setText("" + sudoku[6][3]);
                    a64.setText("" + sudoku[6][4]);
                    a65.setText("" + sudoku[6][5]);
                    a66.setText("" + sudoku[6][6]);
                    a67.setText("" + sudoku[6][7]);
                    a68.setText("" + sudoku[6][8]);
                    a70.setText("" + sudoku[7][0]);
                    a71.setText("" + sudoku[7][1]);
                    a72.setText("" + sudoku[7][2]);
                    a73.setText("" + sudoku[7][3]);
                    a74.setText("" + sudoku[7][4]);
                    a75.setText("" + sudoku[7][5]);
                    a76.setText("" + sudoku[7][6]);
                    a77.setText("" + sudoku[7][7]);
                    a78.setText("" + sudoku[7][8]);
                    a80.setText("" + sudoku[8][0]);
                    a81.setText("" + sudoku[8][1]);
                    a82.setText("" + sudoku[8][2]);
                    a83.setText("" + sudoku[8][3]);
                    a84.setText("" + sudoku[8][4]);
                    a85.setText("" + sudoku[8][5]);
                    a86.setText("" + sudoku[8][6]);
                    a87.setText("" + sudoku[8][7]);
                    a88.setText("" + sudoku[8][8]);
                }else{
                    note.setText("Solution doesn't exists");
                    return;
                }
            }catch (Exception E){
                System.out.println(E.getMessage());
            }
        } else if (e.getSource()==reset) {
            try{
                int[][] sudoku = getInts();
                a00.setText("");a01.setText("");a02.setText("");a03.setText("");a04.setText("");a05.setText("");a06.setText("");a07.setText("");a08.setText("");
                a10.setText("");a11.setText("");a12.setText("");a13.setText("");a14.setText("");a15.setText("");a16.setText("");a17.setText("");a18.setText("");
                a20.setText("");a21.setText("");a22.setText("");a23.setText("");a24.setText("");a25.setText("");a26.setText("");a27.setText("");a28.setText("");
                a30.setText("");a31.setText("");a32.setText("");a33.setText("");a34.setText("");a35.setText("");a36.setText("");a37.setText("");a38.setText("");
                a40.setText("");a41.setText("");a42.setText("");a43.setText("");a44.setText("");a45.setText("");a46.setText("");a47.setText("");a48.setText("");
                a50.setText("");a51.setText("");a52.setText("");a53.setText("");a54.setText("");a55.setText("");a56.setText("");a57.setText("");a58.setText("");
                a60.setText("");a61.setText("");a62.setText("");a63.setText("");a64.setText("");a65.setText("");a66.setText("");a67.setText("");a68.setText("");
                a70.setText("");a71.setText("");a72.setText("");a73.setText("");a74.setText("");a75.setText("");a76.setText("");a77.setText("");a78.setText("");
                a80.setText("");a81.setText("");a82.setText("");a83.setText("");a84.setText("");a85.setText("");a86.setText("");a87.setText("");a88.setText("");

            }catch (Exception E)
            {
                E.printStackTrace();
            }
            finally
            {
                note.setText("");
            }
        }
    }

    private int[][] getInts() {
        String[][] inputStrings = new String[9][9];
        inputStrings[0] = new String[]{a00.getText(), a01.getText(), a02.getText(), a03.getText(), a04.getText(), a05.getText(), a06.getText(), a07.getText(), a08.getText()};
        inputStrings[1] = new String[]{a10.getText(), a11.getText(), a12.getText(), a13.getText(), a14.getText(), a15.getText(), a16.getText(), a17.getText(), a18.getText()};
        inputStrings[2] = new String[]{a20.getText(), a21.getText(), a22.getText(), a23.getText(), a24.getText(), a25.getText(), a26.getText(), a27.getText(), a28.getText()};
        inputStrings[3] = new String[]{a30.getText(), a31.getText(), a32.getText(), a33.getText(), a34.getText(), a35.getText(), a36.getText(), a37.getText(), a38.getText()};
        inputStrings[4] = new String[]{a40.getText(), a41.getText(), a42.getText(), a43.getText(), a44.getText(), a45.getText(), a46.getText(), a47.getText(), a48.getText()};
        inputStrings[5] = new String[]{a50.getText(), a51.getText(), a52.getText(), a53.getText(), a54.getText(), a55.getText(), a56.getText(), a57.getText(), a58.getText()};
        inputStrings[6] = new String[]{a60.getText(), a61.getText(), a62.getText(), a63.getText(), a64.getText(), a65.getText(), a66.getText(), a67.getText(), a68.getText()};
        inputStrings[7] = new String[]{a70.getText(), a71.getText(), a72.getText(), a73.getText(), a74.getText(), a75.getText(), a76.getText(), a77.getText(), a78.getText()};
        inputStrings[8] = new String[]{a80.getText(), a81.getText(), a82.getText(), a83.getText(), a84.getText(), a85.getText(), a86.getText(), a87.getText(), a88.getText()};

        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                try {
                    if (inputStrings[i][j].isEmpty()) {
                        sudoku[i][j] = 0;
                    } else {
                        sudoku[i][j] = Integer.parseInt(inputStrings[i][j]);
                    }
                } catch (NumberFormatException e) {
                    // Handle the case where input cannot be parsed into an integer
                    note.setText("Entered Data are Invalid! Please enter integers.");
                    return new int[0][0];
                }
            }
        }

        // Ensure that all entered numbers are within the valid range
        for (int[] row : sudoku) {
            for (int num : row) {
                if (num < 0 || num > 9) {
                    note.setText("Entered Numbers are Invalid! 0<Number<10");
                    return new int[0][0];
                }
            }
        }

        return sudoku;
    }

    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
        //column
        for (int i=0;i<=8;i++){
            if (sudoku[i][col]==digit){
                return false;
            }
        }
        //for rows
        for (int j = 0;j<=8;j++){
            if (sudoku[row][j]==digit){
                return false;
            }
        }
        //for grid
        int sr =(row/3)*3;
        int sc = (col/3)*3;
        for (int i=sr;i<sr+3;i++){
            for (int j = sc; j<sc+3;j++){
                if (sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean SudokuSolver(int[][] sudoku, int row, int col){
        //
        if (row==9&&col==0)
            return true;
        //
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow = row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return SudokuSolver(sudoku,nextrow,nextcol);
        }
        for (int digit = 1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku,nextrow,nextcol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new Sudoku_Solver();
    }
}
