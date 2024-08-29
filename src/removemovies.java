package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class removemovies extends JFrame implements ActionListener {

    Choice choiceactorid;
    JButton delete,back;
    removemovies(){

        JLabel heading =new JLabel("REMOVE MOVIES");
        heading.setBounds(400,40,700,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JLabel id=new JLabel("MOVIE ID:");
        id.setBounds(400,100,200,30);
        id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(id);

        choiceactorid=new Choice();
        choiceactorid.setBounds(600,100,150,40);
        add(choiceactorid);

        try{
            conn c=new conn();
            ResultSet res=c.stmt.executeQuery("select * from movies");
            while(res.next()){
                choiceactorid.add(res.getString("movie_id"));
            }
        }catch(Exception E){
            E.printStackTrace();
        }

        JLabel name=new JLabel("MOVIE TITLE:");
        name.setBounds(400,150,200,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);

        JLabel texttitle=new JLabel();
        texttitle.setBounds(600,150,300,30);
        texttitle.setFont(new Font("Raleway",Font.BOLD,20));
        add(texttitle);

        JLabel year=new JLabel("MOVIE YEAR:");
        year.setBounds(400,200,200,30);
        year.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(year);

        JLabel textyear=new JLabel();
        textyear.setBounds(600,200,150,30);
        textyear.setFont(new Font("Raleway",Font.BOLD,20));
        add(textyear);

        JLabel lang=new JLabel("MOVIE LANGUAGE:");
        lang.setBounds(400,250,200,30);
        lang.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(lang);

        JLabel textlang=new JLabel();
        textlang.setBounds(600,250,300,30);
        textlang.setFont(new Font("Raleway",Font.BOLD,20));
        add(textlang);

        JLabel dirid=new JLabel("DIRECTOR ID:");
        dirid.setBounds(400,300,200,30);
        dirid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(dirid);

        JLabel textdirid=new JLabel();
        textdirid.setBounds(600,300,300,30);
        textdirid.setFont(new Font("Raleway",Font.BOLD,20));
        add(textdirid);


        try{
            conn c=new conn();
            ResultSet res=c.stmt.executeQuery("select * from movies where movie_id='"+choiceactorid.getSelectedItem()+"'");
            while(res.next()){
                texttitle.setText(res.getString("movie_title"));
                textyear.setText(res.getString("movie_year"));
                textlang.setText(res.getString("movie_language"));
                textdirid.setText(res.getString("director_id"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        choiceactorid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    conn c=new conn();
                    ResultSet res=c.stmt.executeQuery("select * from movies where movie_id='"+choiceactorid.getSelectedItem()+"'");
                    while(res.next()){
                        texttitle.setText(res.getString("movie_title"));
                        textyear.setText(res.getString("movie_year"));
                        textlang.setText(res.getString("movie_language"));
                        textdirid.setText(res.getString("director_id"));
                    }
                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        delete =new JButton("DELETE");
        delete.setBounds(550,350,100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);


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
        if(e.getSource()==delete){
            try{
                conn c=new conn();
                String query="delete from movies where movie_id='"+choiceactorid.getSelectedItem()+"'";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Movie Deleted Successfully");
                setVisible(false);
                new Remove();
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }
        if(e.getSource()==back){
            setVisible(false);
            new Remove();

        }

    }

    public static void main(String[] args) {
        new removemovies();
    }
}
