import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        // เซ็ต Layout Manager เป็น null เพื่อให้สามารถกำหนดตำแหน่งขององค์ประกอบได้เอง
        frame.setLayout(null);

        // โค้ดส่วนที่ใช้เพิ่มภาพเป็น Background
        ImageIcon backgroundImage = new ImageIcon(Main.class.getResource("/resources/warhammer40k.gif"));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        // กำหนดขนาดของ JLabel เท่ากับขนาดของ JFrame
        backgroundLabel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        frame.setContentPane(backgroundLabel);

        // สร้าง JLabel และเพิ่มขนาด Font
        JLabel texttop = new JLabel("Take notes");
        // กำหนดขนาด Font เป็น 24
        texttop.setFont(new Font("Bauhaus 93", Font.PLAIN, 50));
        // กำหนดตำแหน่งและขนาดของ JLabel
        texttop.setBounds(150,10,400,200);
        // เปลี่ยนสีของข้อความเป็นสีแดง
        texttop.setForeground(Color.white);
        frame.add(texttop);

        //สร้าง BUTTON
        JButton savemessage = new JButton("Save a message");
        savemessage.setBounds(150,150,240,40);
        savemessage.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
        savemessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //สร้าง BUTTON
        JButton Tont = new JButton("Turn on note taking");
        Tont.setBounds(125,210,300,40);
        Tont.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
        Tont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        frame.setResizable(false);
        frame.add(savemessage);
        frame.add(Tont);
        frame.setVisible(true);
    }
}
