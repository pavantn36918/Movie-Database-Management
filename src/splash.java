
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.lang.*;
public class splash extends JFrame {

splash(){

   ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front2.png"));
   Image i2=i1.getImage().getScaledInstance(1160,610, Image.SCALE_DEFAULT);
   ImageIcon i3=new ImageIcon(i2);
   JLabel image=new JLabel(i3);
   image.setBounds(0,0,1160,610);
add(image);

    setSize(1170,650);
    setLocation(110,20);
    setLayout(null);
    setVisible(true);

    try{
        Thread.sleep(4000);
        setVisible(false);
        new Login();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
    public static void main(String[] args){
        new splash();
    }
}
