package GUITextbook;
import javax.swing.*;
public class GUI {

    public static void main(String[] args){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Press");
        frame.getContentPane().add(button1);
        JButton button2 = new JButton("Press");
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }

}
