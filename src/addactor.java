package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addactor extends JFrame implements ActionListener {

    JComboBox boxgender;
    JTextField tactorid,tactorname;
    JButton add,back;
    addactor(){

        JLabel heading =new JLabel("ADD ACTOR DETAILS");
        heading.setBounds(400,40,600,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JLabel id=new JLabel("ACTOR ID:");
        id.setBounds(400,150,150,30);
        id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(id);

        tactorid=new JTextField();
        tactorid.setBounds(575,150,200,30);
        tactorid.setBackground(new Color(255,255,255));
        add(tactorid);

        JLabel name=new JLabel("ACTOR NAME:");
        name.setBounds(400,200,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);

        tactorname=new JTextField();
        tactorname.setBounds(575,200,200,30);
        tactorname.setBackground(new Color(255,255,255));
        add(tactorname);

        JLabel gender=new JLabel("ACTOR GENDER:");
        gender.setBounds(400,250,200,30);
        gender.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(gender);


        String[] a={"Male","Female","Others"};
        boxgender=new JComboBox<>(a);
        boxgender.setBackground(new Color(255,255,255));
        boxgender.setBounds(575,250,200,30);
        add(boxgender);

        add =new JButton("ADD");
        add.setBounds(550,320,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back =new JButton("BACK");
        back.setBounds(700,320,100,30);
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
            String id=tactorid.getText();
            String name=tactorname.getText();
            String gender=(String) boxgender.getSelectedItem();

            try{
                conn c=new conn();
                String query="insert into actor values('"+id+"','"+name+"','"+gender+"')";
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
        new addactor();
    }
}
