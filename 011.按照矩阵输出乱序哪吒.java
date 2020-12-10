import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    int map[][]={
        {1,3,2},
        {4,7,6},
        {9,8,5},
        {10,11,0}
    };
    int cell=128;
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
//网格
        java.net.URL imgURL999 = App.class.getResource("img/foreground.png");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,384,512);
        myPanel.add(label_foreground);

        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(map[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
            }
        }



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
        frame.setBounds(400,150,384,530);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);//禁止用户修改大小
    }
    public static void main(String[] args) {
        new App().go();
    }
}
