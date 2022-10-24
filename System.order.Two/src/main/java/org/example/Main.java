package org.example;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import static java.lang.Integer.*;
import javax.swing.JFrame;
import java.awt.event.*;
public class Main {

    static class MyFrame extends JFrame {
        MyFrame() {
            JFrame wnd = new JFrame("Title");
            // вместо двух команд по залажению панели можно использвать set.Bounds (250,250,300,200)
            wnd.setSize(300, 200);
            wnd.setLocation(250, 250);
            //окна постоянных размеров
            wnd.setResizable(false);
            //Реакция на щелчок системной пинтограммы
            wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Отображение окна на экране
            wnd.setVisible(true);
            setLayout(null);
            JLabel lbl = new JLabel("Click is close");
            // position and size point
            lbl.setBounds(10, 30, 280, 50);
            add(lbl);
            //creating button
            JButton btn = new JButton("Close okno");
            // положение и размер кнопки
            btn.setBounds(50, 120, 200, 300);
            // создание обработчика в кнопке
            // происходязего прри щелчке мыши
            MyHandler hdn = new MyHandler();
            // registering obrabotchika in button
            btn.addActionListener(hdn);
            // add btn to panel
            add(btn);
            // working window
            setVisible(true);
        }
        class MyHandler implements  ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        //Main class
        class WindowWithButtonDemo{
            public static void main(String[] args) {
                 new MyFrame();
            }
        }
    }
}




