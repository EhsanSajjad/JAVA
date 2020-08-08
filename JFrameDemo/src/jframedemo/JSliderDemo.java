
package jframedemo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame implements ChangeListener{
    
    private Container c;
    private JLabel redLbl, greenLbl, blueLbl, previewLabel;
    private JSlider redSldr, greenSldr, blueSldr;
    private JTextField redtf, greentf, bluetf;
    private JPanel panel;
    
    JSliderDemo()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        this.setBounds(500, 150, 800, 300);
        
        redLbl = new JLabel("Red");
        redLbl.setBounds(50, 30, 60, 45);
        c.add(redLbl);
        
        greenLbl = new JLabel("Green");
        greenLbl.setBounds(50, 95, 60, 45);
        c.add(greenLbl);
        
        blueLbl = new JLabel("Blue");
        blueLbl.setBounds(50, 155, 60, 45);
        c.add(blueLbl);
        
        redSldr = new JSlider(0, 250, 0);
        redSldr.setBounds(120, 30, 250, 45);
        redSldr.setMinorTickSpacing(10);
        redSldr.setMajorTickSpacing(50);
        redSldr.setPaintTicks(true);  // ticks gulo paint korbe.ie. choto choto dag aka hobe
        redSldr.setPaintLabels(true);  // Label paint korbe.ie. number paint korbe niche
        redSldr.setBackground(Color.orange);
        c.add(redSldr);
        
        greenSldr = new JSlider(0, 250, 0);
        greenSldr.setBounds(120, 95, 250, 45);
        greenSldr.setMinorTickSpacing(10);
        greenSldr.setMajorTickSpacing(50);
        greenSldr.setPaintTicks(true);  // ticks gulo paint korbe.ie. choto choto dag aka hobe
        greenSldr.setPaintLabels(true);  // Label paint korbe.ie. number paint korbe niche
        greenSldr.setBackground(Color.orange);
        c.add(greenSldr);
        
        blueSldr = new JSlider(0, 250, 0);
        blueSldr.setBounds(120, 155, 250, 45);
        blueSldr.setMinorTickSpacing(10);
        blueSldr.setMajorTickSpacing(50);
        blueSldr.setPaintTicks(true);  // ticks gulo paint korbe.ie. choto choto dag aka hobe
        blueSldr.setPaintLabels(true);  // Label paint korbe.ie. number paint korbe niche
        blueSldr.setBackground(Color.orange);
        c.add(blueSldr);
        
        redtf = new JTextField();
        redtf.setBounds(410, 40, 60, 30);
        redtf.setHorizontalAlignment(JTextField.CENTER);
        c.add(redtf);
        
        greentf = new JTextField();
        greentf.setBounds(410, 105, 60, 30);
        greentf.setHorizontalAlignment(JTextField.CENTER);
        c.add(greentf);
        
        bluetf = new JTextField();
        bluetf.setBounds(410, 165, 60, 30);
        bluetf.setHorizontalAlignment(JTextField.CENTER);
        c.add(bluetf);
        
        panel = new JPanel();
        panel.setBounds(550, 60, 170, 110);
        c.add(panel);
        
        previewLabel = new JLabel("Preview");
        previewLabel.setBounds(610, 180, 60, 30);
        c.add(previewLabel);
        
        redSldr.addChangeListener(this);
        greenSldr.addChangeListener(this);
        blueSldr.addChangeListener(this);
        
    }
    
    public void stateChanged(ChangeEvent e) {
        
        int redValue = redSldr.getValue();
        int greenValue = greenSldr.getValue();
        int blueValue = blueSldr.getValue();
        
        redtf.setText(""+redValue);
        greentf.setText(""+greenValue);
        bluetf.setText(""+blueValue);
        
        Color clr = new Color(redValue, greenValue, blueValue); // Color class e 3 ta paramiter pass kora jay(red,green,blue)
        // panel.setBackground(clr);
        c.setBackground(clr);
        
    }
    
    
    public static void main(String[] args) {
        
        JSliderDemo frame = new JSliderDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JSliderDemo.DISPOSE_ON_CLOSE);
        frame.setTitle("Color");
        
    }

    
}
