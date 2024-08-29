package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class view extends JFrame {

    view(){
        JLabel heading =new JLabel("MOVIE DATABASE MANAGEMENT");
        heading.setBounds(265,40,700,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JButton viewactor=new JButton("VIEW ACTOR");
        viewactor.setBounds(300,120,200,40);
        viewactor.setForeground(Color.WHITE);
        viewactor.setBackground(Color.black);
        viewactor.setFont(new Font("Raleway",Font.BOLD,20));
        viewactor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new viewactor();

            }
        });
        add(viewactor);

        JButton viewdirector=new JButton("VIEW DIRECTOR");
        viewdirector.setBounds(650,120,220,40);
        viewdirector.setForeground(Color.WHITE);
        viewdirector.setBackground(Color.black);
        viewdirector.setFont(new Font("Raleway",Font.BOLD,20));
        viewdirector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new viewdirector();

            }
        });
        add(viewdirector);

        JButton viewmovies=new JButton("VIEW MOVIES");
        viewmovies.setBounds(300,180,200,40);
        viewmovies.setForeground(Color.WHITE);
        viewmovies.setBackground(Color.black);
        viewmovies.setFont(new Font("Raleway",Font.BOLD,20));
        viewmovies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new viewmovies();

            }
        });
        add(viewmovies);

        JButton viewmoviecast=new JButton("VIEW MOVIE CAST");
        viewmoviecast.setBounds(650,180,220,40);
        viewmoviecast.setForeground(Color.WHITE);
        viewmoviecast.setBackground(Color.black);
        viewmoviecast.setFont(new Font("Raleway",Font.BOLD,20));
        viewmoviecast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new viewmoviecast();

            }
        });
        add(viewmoviecast);

        JButton viewrating=new JButton("VIEW RATING");
        viewrating.setBounds(300,240,200,40);
        viewrating.setForeground(Color.WHITE);
        viewrating.setBackground(Color.black);
        viewrating.setFont(new Font("Raleway",Font.BOLD,20));
        viewrating.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new viewrating();

            }
        });
        add(viewrating);


        JButton viewgeneres=new JButton("VIEW GENERES");
        viewgeneres.setBounds(650,240,220,40);
        viewgeneres.setForeground(Color.WHITE);
        viewgeneres.setBackground(Color.black);
        viewgeneres.setFont(new Font("Raleway",Font.BOLD,20));
        viewgeneres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new viewgeneres();

            }
        });
        add(viewgeneres);

        JButton back=new JButton("BACK");
        back.setBounds(500,300,200,40);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.black);
        back.setFont(new Font("Raleway",Font.BOLD,20));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Main_calss();

            }
        });
        add(back);


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
        new view();
    }
}
