import javax.swing.*;

public class JavaSwingExample extends JFrame {

    JMenu fileMenu, editMenu, aboutMenu, linkMenu;
    JMenuBar menuBar = new JMenuBar();
    JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem,
            copyMenuItem, cutMenuItem, pasteMenuItem;
    JCheckBox showAboutChk = new JCheckBox("Show About",true);
    JRadioButton showLinksRad = new JRadioButton("Show Links",true);

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
        menuBar.add(aboutMenu);
        menuBar.add(linkMenu);
        setJMenuBar(menuBar);

        new JFrame("Java Swing Examples");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JavaSwingExample();
    }
}
