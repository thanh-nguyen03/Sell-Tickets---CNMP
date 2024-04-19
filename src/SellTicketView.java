import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SellTicketView {
	private JPanel sellTicketView;
	private JPanel titlePanel;
	private JPanel mainPanel;
	private JTextField textField1;
	private JComboBox comboBox1;
	private JButton searchButton;
	private JTable resultTable;
	private JButton nextButton;
	private JButton cancelButton;

	public SellTicketView() {
		// Define column names
		String[] columnNames = {"No.", "Name", "Date", "Time", "Room", "Movie Type"};

		// Create a default table model with the column names and zero rows
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		// Set the model to the resultTable
		resultTable.setModel(model);
	}

	public JPanel getSellTicketView() {
		return sellTicketView;
	}
}
