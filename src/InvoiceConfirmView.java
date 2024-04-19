import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InvoiceConfirmView {
	private JPanel titlePanel;
	private JPanel mainPanel;
	private JTable ticketList;
	private JPanel invoiceConfirmView;
	private JButton confirmButton;
	private JButton cancelButton;
	private JPanel bottomActionPanel;

	public InvoiceConfirmView() {
		String[] columnNames = {"No.", "Seat", "Price"};

		// Create a default table model with the column names and zero rows
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		// Set the model to the resultTable
		ticketList.setModel(model);
	}

	public JPanel getInvoiceConfirmView() {
		return invoiceConfirmView;
	}
}
