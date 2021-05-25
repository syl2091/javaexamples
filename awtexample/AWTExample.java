package awtexample;

import java.awt.*;

/**
 * @ClassName:AWTExample
 * @Description: TODO
 * @Author:86177
 * @Date: 2021/5/25 9:55
 */
public class AWTExample extends Frame {
    AWTExample(){
        Button b = new Button("button!!");
        b.setBounds(50,50,50,50);
        this.add(b);
        this.setSize(500,300);
        this.setTitle("This is my first AWT example");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    public static  void main(String[] args){
        AWTExample awtExample = new AWTExample();
    }
}
