package employee.management.system;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_calss extends JFrame {
   Main_calss(){



       JLabel heading =new JLabel("MOVIE DATABASE MANAGEMENT");
       heading.setBounds(265,40,700,40);
       heading.setFont(new Font("Raleway",Font.BOLD,40));
       add(heading);

       JButton add=new JButton("ADD DETAILS");
       add.setBounds(335,150,200,40);
       add.setForeground(Color.WHITE);
       add.setBackground(Color.black);
       add.setFont(new Font("Raleway",Font.BOLD,20));
       add.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new Add();

           }
       });

       add(add);

       JButton view=new JButton("VIEW DETAILS");
       view.setBounds(680,150,200,40);
       view.setForeground(Color.WHITE);
       view.setBackground(Color.black);
       view.setFont(new Font("Raleway",Font.BOLD,20));
       view.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new view();

           }
       });
       add(view);

       JButton rem=new JButton("REMOVE DETAILS");
       rem.setBounds(480,230,250,40);
       rem.setForeground(Color.WHITE);
       rem.setBackground(Color.black);
       rem.setFont(new Font("Raleway",Font.BOLD,20));
       rem.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new Remove();

           }
       });
       add(rem);


       JButton signup=new JButton("CREATE NEW USER");
       signup.setBounds(480,300,250,40);
       signup.setForeground(Color.WHITE);
       signup.setBackground(Color.BLUE);
       signup.setFont(new Font("Raleway",Font.BOLD,20));
       signup.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
               new signup();

           }
       });
       add(signup);

       JButton logout=new JButton("LOG OUT");
       logout.setBounds(530,350,150,40);
       logout.setForeground(Color.WHITE);
       logout.setBackground(Color.BLUE);
       logout.setFont(new Font("Raleway",Font.BOLD,20));
       logout.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               setVisible(false);
               new Login();

           }
       });
       add(logout);

       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dassbord.jpg"));
       Image i2=i1.getImage().getScaledInstance(1160,650, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(0,0,1160,650);
       add(image);


       setSize(1170,650);
       setLocation(100,20);
       setVisible(true);
   }

    public static void main(String[] args) {
        new Main_calss();
    }
}
