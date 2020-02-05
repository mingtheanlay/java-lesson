import javafx.scene.control.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

public class Main extends JFrame {

    static JFrame frame;
    static JSlider slide;
    static JLabel label;

    public static void SliderNumber() {

        label = new JLabel();
        slide = new JSlider(0,200,100);
        JPanel panel = new JPanel();
        frame = new JFrame("Slider");

        slide.setPaintTicks(true);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);

        slide.setMajorTickSpacing(50);
        slide.setMinorTickSpacing(5);

        panel.add(slide);
        panel.add(label);

        frame.add(panel);

        label.setText("Value of Slider is: " + slide.getValue());

        frame.setSize(300,300);
        frame.setVisible(true);

        slide.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("Value of Slider is: " + slide.getValue());
            }
        });
    }

    public static void main(String[] args) {
        SliderNumber();
    }

}
