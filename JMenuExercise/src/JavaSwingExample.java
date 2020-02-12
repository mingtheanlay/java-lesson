import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

public class JavaSwingExample extends JFrame implements ActionListener {

    JMenu fileMenu, editMenu, aboutMenu, linkMenu;
    JMenuBar menuBar = new JMenuBar();
    JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem,
            copyMenuItem, cutMenuItem, pasteMenuItem;
    JCheckBox showAboutChk = new JCheckBox("Show About",true);
    JRadioButton showLinksRad = new JRadioButton("Show Links",true);
    JLabel showSelected = new JLabel();

    public JavaSwingExample() {

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        aboutMenu = new JMenu("About");
        linkMenu = new JMenu("Links");

        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");
        copyMenuItem = new JMenuItem("Copy");
        cutMenuItem = new JMenuItem("Cut");
        pasteMenuItem = new JMenuItem("Paste");

        newMenuItem.setMnemonic('N');

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(showAboutChk);
        fileMenu.addSeparator();
        fileMenu.add(showLinksRad);
        fileMenu.addSeparator();

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(linkMenu);
        menuBar.add(aboutMenu);
        setJMenuBar(menuBar);

        new JFrame("Java Swing Examples");

        showSelected.setBounds(100,100,10,10);
        add(showSelected);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        showAboutChk.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                aboutMenu.setVisible(showAboutChk.isSelected());
            }
        });

        showLinksRad.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                linkMenu.setVisible(showLinksRad.isSelected());
            }
        });

        cutMenuItem.addActionListener(this::actionPerformed);
        pasteMenuItem.addActionListener(this::actionPerformed);
        copyMenuItem.addActionListener(this::actionPerformed);
        newMenuItem.addActionListener(this::actionPerformed);
        openMenuItem.addActionListener(this::actionPerformed);
        saveMenuItem.addActionListener(this::actionPerformed);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        showSelected.setText(e.getActionCommand() + " is selected");
    }

    public static void main(String[] args) {
        new JavaSwingExample();
    }
}
