package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class removerating extends JFrame implements ActionListener {
    Choice choicemovieid;
    JButton delete,back;
    removerating(){
        JLabel heading =new JLabel("REMOVE RATING");
        heading.setBounds(400,60,700,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JLabel id=new JLabel("MOVIE ID:");
        id.setBounds(400,150,120,30);
        id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(id);

        choicemovieid=new Choice();
        choicemovieid.setBounds(600,150,150,40);
        add(choicemovieid);

        try{
            conn c=new conn();
            ResultSet res=c.stmt.executeQuery("select * from rating");
            while(res.next()){
                choicemovieid.add(res.getString("movie_id"));
            }
        }catch(Exception E){
            E.printStackTrace();
        }


        JLabel rev=new JLabel("REV STARS:");
        rev.setBounds(400,200,150,30);
        rev.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(rev);

        JLabel textrev=new JLabel();
        textrev.setBounds(600,200,150,30);
        textrev.setFont(new Font("Raleway",Font.BOLD,20));
        add(textrev);




        try{
            conn c=new conn();
            ResultSet res=c.stmt.executeQuery("select * from rating where movie_id='"+choicemovieid.getSelectedItem()+"'");
            while(res.next()){
                textrev.setText(res.getString("rev_stars"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        choicemovieid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    conn c=new conn();
                    ResultSet res=c.stmt.executeQuery("select * from rating where movie_id='"+choicemovieid.getSelectedItem()+"'");
                    while(res.next()){

                        textrev.setText(res.getString("role"));
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
                String query="delete from rating where movie_id='"+choicemovieid.getSelectedItem()+"'";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rating Deleted Successfully");
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
            new removerating();
    }
}
