
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Main extends JFrame {

    // Initialize JLabel
    JLabel id = new JLabel("Enter your ID:");
    JLabel name = new JLabel("Enter your name");
    JLabel salary = new JLabel("Salary");

    // Initialize JTextField
    JTextField txtID = new JTextField();
    JTextField txtName = new JTextField();
    JTextField txtSalary = new JTextField();

    // Initialize JButton
    JButton btnAdd = new JButton("Add");
    JButton btnRemove = new JButton("Remove");
    JButton btnClear = new JButton("Clear");
    JButton btnUpdate = new JButton("Update");

    Main() {

        // Create a table model and set a Column Identifiers to this model
        Object[] columns = {"Id", "First Name", "Salary"};

        // Create a table model and set a Column Identifiers to this model
        Object[] row = new Object[4];
        JTable table = new JTable();
        JScrollPane pane = new JScrollPane(table);

        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columns);
        table.setModel(model1);

        // Button Add
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a = txtID.getText();
                String b = txtName.getText();
                String c = txtSalary.getText();
                row[0] = a;
                row[1] = b;
                row[2] = c;

                // Add row to the model
                model1.addRow(row);
            }
        });

        // Button Clear
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtID.setText("");
                txtName.setText("");
                txtSalary.setText("");
            }
        });


        // Button Remove
        btnRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();
                if (i >= 0) {
                    // remove a row from jtable
                    model1.removeRow(i);
                } else {
                    System.out.println("Delete Error");
                }
            }
        });


        table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int i = table.getSelectedRow();
                Object a = model1.getValueAt(i, 0);
                txtID.setText(a.toString());
                Object b = model1.getValueAt(i, 1);
                txtName.setText(b.toString());
                Object c = model1.getValueAt(i, 2);
                txtSalary.setText(c.toString());
            }
        });

        // Button Update
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // i = the index of the selected row
                int i = table.getSelectedRow();
                Object a = model1.getValueAt(i, 0);
                txtID.setText(a.toString());
                Object b = model1.getValueAt(i, 1);
                txtID.setText(b.toString());
                Object c = model1.getValueAt(i, 2);
                txtID.setText(c.toString());

                if (i >= 0) {
                    model1.setValueAt(txtID.getText(), i, 0);
                    model1.setValueAt(txtName.getText(), i, 1);
                    model1.setValueAt(txtSalary.getText(), i, 2);

                } else {
                    System.out.println("Update Error");
                }
            }
        });

        setTitle("Customer");

        id.setBounds(50, 50, 160, 30);
        txtID.setBounds(200, 50, 160, 30);
        name.setBounds(50, 120, 160, 30);
        txtName.setBounds(200, 120, 160, 30);
        salary.setBounds(50, 190, 160, 30);
        txtSalary.setBounds(200, 190, 160, 30);

        add(id);
        add(txtID);
        add(name);
        add(txtName);
        add(salary);
        add(txtSalary);

        pane.setBounds(50, 260, 300, 300);

        // Button
        btnAdd.setBounds(50, 560, 80, 60);
        btnClear.setBounds(150, 560, 80, 60);
        btnRemove.setBounds(250, 560, 80, 60);
        btnUpdate.setBounds(350, 560, 80, 60);

        // Add to frame
        add(pane);
        add(btnAdd);
        add(btnClear);
        add(btnRemove);
        add(btnUpdate);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(500, 1000);

    }

   public static void main(String args[]) {
        new Main();
    }

}


