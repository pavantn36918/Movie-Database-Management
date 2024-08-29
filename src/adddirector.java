package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adddirector extends JFrame implements ActionListener {


    JTextField tdirectorid,tdirectorname,tphone;
    JButton add,back;
    adddirector(){



            JLabel heading =new JLabel("ADD DIRECTOR DETAILS");
            heading.setBounds(400,40,600,40);
            heading.setFont(new Font("Raleway",Font.BOLD,40));
            add(heading);

            JLabel id=new JLabel("DIRECTOR ID:");
            id.setBounds(400,150,150,30);
            id.setFont(new Font("SAN_SERIF",Font.BOLD,20));
            add(id);

            tdirectorid=new JTextField();
            tdirectorid.setBounds(575,150,200,30);
            tdirectorid.setBackground(new Color(255,255,255));
            add(tdirectorid);

            JLabel name=new JLabel("DIRECTOR NAME:");
            name.setBounds(400,200,200,30);
            name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
            add(name);

            tdirectorname=new JTextField();
            tdirectorname.setBounds(575,200,200,30);
            tdirectorname.setBackground(new Color(255,255,255));
            add(tdirectorname);

            JLabel phone=new JLabel("PHONE NUMBER:");
            phone.setBounds(400,250,200,30);
            phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
            add(phone);

            tphone=new JTextField();
            tphone.setBounds(575,250,200,30);
            tphone.setBackground(new Color(255,255,255));
            add(tphone);


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
                String id=tdirectorid.getText();
                String name=tdirectorname.getText();
                String phone=tphone.getText();

                try{
                    conn c=new conn();
                    String query="insert into director values('"+id+"','"+name+"','"+phone+"')";
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
        new adddirector();
    }
}
