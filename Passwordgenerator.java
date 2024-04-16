import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.util.Random;


import java.awt.*;

public class Passwordgenerator {
    static JFrame w;
    static JTextArea t;
    static JPanel p;
    static Label l,l1,l2,l3;
    static JButton b,b1;
    static double x;
    public static void main(String[] args) {
        w = new JFrame("Password Generator");
        w.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/andre/Downloads/key.png"));
        w.setSize(400, 350);
        t = new JTextArea();
        t.setPreferredSize(new Dimension(350,100));
        b = new JButton( "       Generate       ");
        b1 = new JButton("       Copy       ");
        p = new JPanel();
        l = new Label("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        l1 = new Label("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        l2 = new Label("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        l3 = new Label("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        p.setLayout(new FlowLayout()); 
        p.setBackground(Color.GRAY);
        p.setMaximumSize(new Dimension(400,350));
        p.add(t);
        p.add(l);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(b);
        p.add(b1);
        w.add(p);
        w.setResizable(false);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Random r = new Random();
        int a = r.nextInt(52);
        int b = r.nextInt(52);
        int c = r.nextInt(52);
        int d = r.nextInt(6);
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] ss = {'!', '#' , '$' ,'%','&','*'};
                String v = String.valueOf(c);
                String g = String.valueOf(d);
                String s = String.valueOf(chars[a]);
                String vx = String.valueOf(ss[d]);
                String w = String.valueOf(a);
                String x = String.valueOf(chars[a]);
                String y = String.valueOf(b);
                String z = String.valueOf(chars[b]);
                String f = String.valueOf(chars[c]);
        t.setText(f + s + w + x + y + z + v + vx + g);
            }
        });

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                StringSelection selection = new StringSelection(t.getText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, selection);
                t.setText("Succesfully copied ! "  + " You can generate another one after copy ! ");
            }
        });

       }
    }

