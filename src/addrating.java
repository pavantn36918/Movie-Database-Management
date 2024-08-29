package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addrating extends JFrame implements ActionListener {

    JTextField tmovieid,trevstars;
    JButton add,back;
    addrating(){
        JLabel heading =new JLabel("ADD RATINGS");
        heading.setBounds(400,40,600,40);
        heading.setFont(new Font("Raleway",Font.BOLD,40));
        add(heading);

        JLabel id=new JLabel("MOVIE ID:");
        id.setBounds(400,150,150,30);
        id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(id);

        tmovieid=new JTextField();
        tmovieid.setBounds(525,150,200,30);
        tmovieid.setBackground(new Color(255,255,255));
        add(tmovieid);

        JLabel rev=new JLabel("REV STARS:");
        rev.setBounds(400,200,200,30);
        rev.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(rev);

        trevstars=new JTextField();
        trevstars.setBounds(525,200,200,30);
        trevstars.setBackground(new Color(255,255,255));
        add(trevstars);

        add =new JButton("ADD");
        add.setBounds(550,270,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back =new JButton("BACK");
        back.setBounds(700,270,100,30);
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
            String rev=trevstars.getText();


            try{
                conn c=new conn();
                String query="insert into rating values('"+id+"','"+rev+"')";
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
        new addrating();
    }
}
