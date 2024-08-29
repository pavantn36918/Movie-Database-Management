package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame {
    Add(){

        JLabel heading =new JLabel("MOVIE DATABASE MANAGEMENT");
        heading.setBounds(265,40,700,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JButton addactor=new JButton("ADD ACTOR");
        addactor.setBounds(300,120,200,40);
        addactor.setForeground(Color.WHITE);
        addactor.setBackground(Color.black);
        addactor.setFont(new Font("Raleway",Font.BOLD,20));
        addactor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new addactor();
            }
        });
        add(addactor);

        JButton adddirector=new JButton("ADD DIRECTOR");
        adddirector.setBounds(650,120,200,40);
        adddirector.setForeground(Color.WHITE);
        adddirector.setBackground(Color.black);
        adddirector.setFont(new Font("Raleway",Font.BOLD,20));
        adddirector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new adddirector();
            }
        });
        add(adddirector);

        JButton addmovies=new JButton("ADD MOVIES");
        addmovies.setBounds(300,180,200,40);
        addmovies.setForeground(Color.WHITE);
        addmovies.setBackground(Color.black);
        addmovies.setFont(new Font("Raleway",Font.BOLD,20));
        addmovies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new addmovies();
            }
        });
        add(addmovies);

        JButton addmoviecast=new JButton("ADD MOVIE CAST");
        addmoviecast.setBounds(650,180,205,40);
        addmoviecast.setForeground(Color.WHITE);
        addmoviecast.setBackground(Color.black);
        addmoviecast.setFont(new Font("Raleway",Font.BOLD,20));
        addmoviecast.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new addmoviecast();
            }
        });
        add(addmoviecast);

        JButton addrating=new JButton("ADD RATING");
        addrating.setBounds(300,240,200,40);
        addrating.setForeground(Color.WHITE);
        addrating.setBackground(Color.black);
        addrating.setFont(new Font("Raleway",Font.BOLD,20));
        addrating.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new addrating();
            }
        });
        add(addrating);


        JButton addgeneres=new JButton("ADD GENERES");
        addgeneres.setBounds(650,240,200,40);
        addgeneres.setForeground(Color.WHITE);
        addgeneres.setBackground(Color.black);
        addgeneres.setFont(new Font("Raleway",Font.BOLD,20));
        addgeneres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new addgeneres();
            }
        });
        add(addgeneres);

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
        new Add();
    }
}
