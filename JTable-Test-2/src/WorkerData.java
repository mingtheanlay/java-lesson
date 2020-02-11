import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class WorkerData {

    // Initialize JLabel
    JLabel lbID = new JLabel("Enter your ID");
    JLabel lbName = new JLabel("Enter your Name");
    JLabel lbSalary = new JLabel("Enter Your Salary");

    // Initialize TextField
    JTextField txtID = new JTextField();
    JTextField txtName = new JTextField();
    JTextField txtSalary= new JTextField();

    // Initialize JButton
    JButton btnSave = new JButton("Save");
    JButton btnUpdate = new JButton("Update");
    JButton btnRemove = new JButton("Remove");
    JButton btnClear = new JButton("Clear");

    WorkerData() {

        // Initialize Object for column and row
        Object[] column = {"ID","Name","Salary"};
        Object[] row = new Object[4];

        // Initialize JTable, JDefaultModel and JScrollPane
        JTable workerTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(workerTable);
        DefaultTableModel tableModel = new DefaultTableModel()
    }

    public static void main(String[] args) {
	// write your code here
    }
}
