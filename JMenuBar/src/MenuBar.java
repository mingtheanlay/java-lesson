import javax.swing.*;

public class MenuBar extends JFrame{

    JMenu fileMenu, editMenu, formatMenu, optionMenu;
    JMenuBar menuBar = new JMenuBar();
    ImageIcon fileIcon;

    public MenuBar() {

        // Set JMenu according to their name

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');

        editMenu = new JMenu("Edit");
        editMenu.setMnemonic('E');

        formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('F');

        optionMenu = new JMenu("Option");
        optionMenu.setMnemonic('O');

        // Add all JMenu component to JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(optionMenu);
        setJMenuBar(menuBar);

        setSize(300,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuBar();
    }
}
