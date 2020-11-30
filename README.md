# Swing Tutorial
##  201任务戳→:  [Excel OL](https://docs.qq.com/sheet/DYXB3cE9XVXVHQVN4)
##  202任务戳→:  [Excel OL](https://docs.qq.com/sheet/DYVd4cWFSWlJ2dmdU)


```
import javax.swing.*;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    //构造方法
    public App() {

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
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
```
