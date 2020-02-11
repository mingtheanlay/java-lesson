import javax.swing.*;
import java.awt.*;

public class SubMenuTest extends JFrame {

    JMenu fileMenu, optionMenu, formatMenu;
    JMenuItem itemOne, itemTwo, itemThree;
    JMenuBar menuBar = new JMenuBar();
    JCheckBox chkShow;
    JRadioButton radShow;

    public SubMenuTest() {
        fileMenu = new JMenu("File");
        optionMenu = new JMenu("Option");
        formatMenu = new JMenu("Format");

        itemOne = new JMenuItem("Item One");
        itemTwo = new JMenuItem("Item Two");
        itemThree = new JMenuItem("Item Three");

        chkShow = new JCheckBox("Show One", true);
        radShow = new JRadioButton("Radio Show");

        menuBar.add(fileMenu);
        menuBar.add(optionMenu);
        menuBar.add(formatMenu);

        fileMenu.add(itemOne);
        fileMenu.addSeparator();
        fileMenu.add(itemTwo);
        fileMenu.addSeparator();
        fileMenu.add(itemThree);

        optionMenu.add(chkShow);
        optionMenu.add(radShow);

        menuBar.add(fileMenu);
        menuBar.add(optionMenu);
        menuBar.add(formatMenu);
        setJMenuBar(menuBar);

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
	    new SubMenuTest();
    }
}
