import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        class MyFrame extends  JFrame{
            //constructor
            MyFrame(String name){
                //calling superconductor
                super(name);
                //position window
                setBounds(250,250,300,200);
                //static windows
                setResizable(false);
                //reaction on click system pictogram
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                //power of manager composition
                setLayout(null);
                //creating object point
                JLabel lbl = new JLabel("Blur text",JLabel.CENTER);
                //position sites
                lbl.setBounds(10,30,280,50);
                //blur color for sites
                lbl.setForeground(Color.BLUE);
                //hacky around point
                lbl.setBorder(BorderFactory.createEtchedBorder());
                // adding point on window
                add(lbl);
                //creating object button
                JButton btn = new JButton("Close window");
                btn.setBounds(50,120,200,30);
                btn.setFocusPainted(false);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        System.exit(0);
                    }
                });
                   add(btn);
                   setVisible(true);

        }
    }
    class AnonimusHandlerDemo{
        //Main Void
        public  void main(String[] args) {
            new MyFrame("Ananimni obrabotchik");
            }
        }
    }
}
