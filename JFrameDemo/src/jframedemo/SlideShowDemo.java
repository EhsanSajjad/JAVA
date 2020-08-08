package jframedemo;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShowDemo extends JFrame implements ActionListener {

    private Container c;
    private JPanel jp;
    private JButton preBtn, nxtBtn;
    private ImageIcon img;
    private JLabel L1;
    private CardLayout card;

    SlideShowDemo() {
        initComponent();
        showImage();
    }

    public void showImage() {
        String[] imgName = {"attendance_logo.gif", "mul.gif", "overseas.jpg"};
        for (String n : imgName) {
            img = new ImageIcon("src/images/" + n);
            Image image = img.getImage();
            Image newImage = image.getScaledInstance(jp.getWidth(), jp.getHeight(), Image.SCALE_SMOOTH);
            img = new ImageIcon(newImage);

            L1 = new JLabel(img);
            jp.add(L1);
        }
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(400, 200, 500, 400);

        card = new CardLayout();

        jp = new JPanel(card);
        jp.setBounds(20, 20, 440, 280);
        c.add(jp);

        preBtn = new JButton("Previous");
        preBtn.setBounds(12, 330, 90, 20);
        c.add(preBtn);

        nxtBtn = new JButton("Next");
        nxtBtn.setBounds(380, 330, 90, 20);
        c.add(nxtBtn);
        
        preBtn.addActionListener(this);
        nxtBtn.addActionListener(this);
        
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == nxtBtn)
            card.next(jp);
        else
            card.previous(jp);
        
    }
        
    public static void main(String[] args) {

        SlideShowDemo frame = new SlideShowDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(SlideShowDemo.DISPOSE_ON_CLOSE);
        frame.setTitle("Slide Show Demo");

    }

}
