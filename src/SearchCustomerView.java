import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchCustomerView {
	private JPanel searchCustomerView;
	private JPanel titlePanel;
	private JPanel mainPanel;
	private JTextField textField1;
	private JComboBox comboBox1;
	private JTable resultTable;
	private JButton searchButton;
	private JButton nextButton;
	private JButton cancelButton;

	public SearchCustomerView() {
		String[] columnNames = {"No.", "Id", "Full name", "Age", "Phone"};

		// Create a default table model with the column names and zero rows
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		// Set the model to the resultTable
		resultTable.setModel(model);
	}

	public JPanel getSearchCustomerView() {
		return searchCustomerView;
	}
}
