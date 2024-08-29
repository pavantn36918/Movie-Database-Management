package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addmovies extends JFrame implements ActionListener {
    JComboBox boxyear;
    JTextField tmovieid,tmovietitle,tmovieyear,tmovlang,tdirectorid2;
    JButton add,back;
    addmovies(){
        JLabel heading =new JLabel("ADD MOVIE DETAILS");
        heading.setBounds(400,40,600,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JLabel id=new JLabel("MOVIE ID:");
        id.setBounds(400,100,150,30);
        id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(id);

        tmovieid=new JTextField();
        tmovieid.setBounds(600,100,200,30);
        tmovieid.setBackground(new Color(255,255,255));
        add(tmovieid);

        JLabel title=new JLabel("MOVIE TITLE:");
        title.setBounds(400,150,200,30);
        title.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(title);

        tmovietitle=new JTextField();
        tmovietitle.setBounds(600,150,200,30);
        tmovietitle.setBackground(new Color(255,255,255));
        add(tmovietitle);

        JLabel year=new JLabel("MOVIE YEAR:");
        year.setBounds(400,200,200,30);
        year.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(year);

        tmovieyear=new JTextField();
        tmovieyear.setBounds(600,200,200,30);
        tmovieyear.setBackground(new Color(255,255,255));
        add(tmovieyear);

        JLabel lang=new JLabel("MOVIE LANGUAGE:");
        lang.setBounds(400,250,200,30);
        lang.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(lang);

        tmovlang=new JTextField();
        tmovlang.setBounds(600,250,200,30);
        tmovlang.setBackground(new Color(255,255,255));
        add(tmovlang);

        JLabel dirid=new JLabel("DIRECTOR ID:");
        dirid.setBounds(400,300,200,30);
        dirid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(dirid);

        tdirectorid2=new JTextField();
        tdirectorid2.setBounds(600,300,200,30);
        tdirectorid2.setBackground(new Color(255,255,255));
        add(tdirectorid2);


        add =new JButton("ADD");
        add.setBounds(550,350,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back =new JButton("BACK");
        back.setBounds(700,350,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String id=tmovieid.getText();
            String title=tmovietitle.getText();
            String year=tmovieyear.getText();
            String lang=tmovlang.getText();
            String dirid=tdirectorid2.getText();


            try{
                conn c=new conn();
                String query="insert into movies values('"+id+"','"+title+"','"+year+"','"+lang+"','"+dirid+"')";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                setVisible(false);
                new Add();
            }
            catch(Exception E){
                E.printStackTrace();
                JOptionPane.showMessageDialog(null,"Error "+E.getMessage());
            }

        }
        if(e.getSource()==back){
            setVisible(false);
            new Add();

        }
    }

    public static void main(String[] args) {
        new addmovies();
    }
}
