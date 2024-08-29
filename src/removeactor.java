package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class removeactor extends JFrame implements ActionListener {

    Choice choiceactorid;
    JButton delete,back;
    removeactor(){
        JLabel heading =new JLabel("REMOVE ACTOR");
        heading.setBounds(400,60,700,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JLabel id=new JLabel("ACTOR ID:");
        id.setBounds(400,150,120,30);
        id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(id);

        choiceactorid=new Choice();
        choiceactorid.setBounds(600,150,150,40);
        add(choiceactorid);

        try{
            conn c=new conn();
            ResultSet res=c.stmt.executeQuery("select * from actor");
            while(res.next()){
                choiceactorid.add(res.getString("actor_id"));
            }
        }catch(Exception E){
            E.printStackTrace();
        }

        JLabel name=new JLabel("ACTOR NAME:");
        name.setBounds(400,200,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);

        JLabel textName=new JLabel();
        textName.setBounds(600,200,300,30);
        textName.setFont(new Font("Raleway",Font.BOLD,20));
        add(textName);

        JLabel gender=new JLabel("ACTOR GENDER:");
        gender.setBounds(400,250,200,30);
        gender.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(gender);

        JLabel textgender=new JLabel();
        textgender.setBounds(600,250,300,30);
        textgender.setFont(new Font("Raleway",Font.BOLD,20));
        add(textgender);


        try{
            conn c=new conn();
            ResultSet res=c.stmt.executeQuery("select * from actor where actor_id='"+choiceactorid.getSelectedItem()+"'");
            while(res.next()){
                textName.setText(res.getString("actor_name"));
                textgender.setText(res.getString("actor_gender"));
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
                    ResultSet res=c.stmt.executeQuery("select * from actor where actor_id='"+choiceactorid.getSelectedItem()+"'");
                    while(res.next()){
                        textName.setText(res.getString("actor_name"));
                        textgender.setText(res.getString("actor_gender"));
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
                String query="delete from actor where actor_id='"+choiceactorid.getSelectedItem()+"'";
                c.stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Actor Deleted Successfully");
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
        new removeactor();
    }
}
