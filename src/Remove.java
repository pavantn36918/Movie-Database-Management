package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Remove extends JFrame {
    Remove(){
        JLabel heading =new JLabel("MOVIE DATABASE MANAGEMENT");
        heading.setBounds(265,40,700,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JButton removeactor=new JButton("REMOVE ACTOR");
        removeactor.setBounds(300,120,230,40);
        removeactor.setForeground(Color.WHITE);
        removeactor.setBackground(Color.black);
        removeactor.setFont(new Font("Raleway",Font.BOLD,20));
        removeactor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new removeactor();
            }
        });
        add(removeactor);

        JButton removedirector=new JButton("REMOVE DIRECTOR");
        removedirector.setBounds(650,120,250,40);
        removedirector.setForeground(Color.WHITE);
        removedirector.setBackground(Color.black);
        removedirector.setFont(new Font("Raleway",Font.BOLD,20));
        removedirector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new removedirector();

            }
        });
        add(removedirector);

        JButton removemovies=new JButton("REMOVE MOVIES");
        removemovies.setBounds(300,180,230,40);
        removemovies.setForeground(Color.WHITE);
        removemovies.setBackground(Color.black);
        removemovies.setFont(new Font("Raleway",Font.BOLD,20));
        removemovies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new removemovies();

            }
        });
        add(removemovies);

        JButton removemoviecast=new JButton("REMOVE MOVIE CAST");
        removemoviecast.setBounds(650,180,250,40);
        removemoviecast.setForeground(Color.WHITE);
        removemoviecast.setBackground(Color.black);
        removemoviecast.setFont(new Font("Raleway",Font.BOLD,20));
        removemoviecast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new removemoviecast();

            }
        });
        add(removemoviecast);

        JButton removerating=new JButton("REMOVE RATING");
        removerating.setBounds(300,240,230,40);
        removerating.setForeground(Color.WHITE);
        removerating.setBackground(Color.black);
        removerating.setFont(new Font("Raleway",Font.BOLD,20));
        removerating.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new removerating();

            }
        });
        add(removerating);


        JButton removegeneres=new JButton("REMOVE GENERES");
        removegeneres.setBounds(650,240,250,40);
        removegeneres.setForeground(Color.WHITE);
        removegeneres.setBackground(Color.black);
        removegeneres.setFont(new Font("Raleway",Font.BOLD,20));
        removegeneres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new removegeneres();

            }
        });
        add(removegeneres);

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
        new Remove();
    }
}
