import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    JLabel label_goodPlane=new JLabel();
    JButton button_left=new JButton();
    JButton button_right=new JButton();
    JButton button_up=new JButton();
    JButton button_down=new JButton();
    int x,y;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label_goodPlane.setBounds(x,y+=10,128,128);
                    myPanel.repaint();
                }
            }
        });


    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_goodPlane.setIcon(new ImageIcon(imgURL));
        label_goodPlane.setBounds(100,100,128,128);
        myPanel.add(label_goodPlane);



        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
