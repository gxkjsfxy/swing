import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
        label_list.add(new JLabel());
        label_list.add(new JLabel());
        label_list.add(new JLabel());

        java.net.URL imgURL = App.class.getResource("img/ball.png");

        label_list.get(0).setIcon(new ImageIcon(imgURL));
        label_list.get(0).setBounds(0,100,800,500);
        myPanel.add(label_list.get(0));

        label_list.get(1).setIcon(new ImageIcon(imgURL));
        label_list.get(1).setBounds(65,100,800,500);
        myPanel.add(label_list.get(1));

        label_list.get(2).setIcon(new ImageIcon(imgURL));
        label_list.get(2).setBounds(128,100,800,500);
        myPanel.add(label_list.get(2));

    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
