import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ChooseSeatView {
	private JPanel titlePanel;
	private JCheckBox a1CheckBox;
	private JCheckBox a2CheckBox;
	private JCheckBox a3CheckBox;
	private JCheckBox a4CheckBox;
	private JCheckBox a5CheckBox;
	private JCheckBox b1CheckBox;
	private JCheckBox b2CheckBox;
	private JCheckBox b3CheckBox;
	private JCheckBox b4CheckBox;
	private JCheckBox b5CheckBox;
	private JCheckBox c1CheckBox;
	private JCheckBox c2CheckBox;
	private JCheckBox c3CheckBox;
	private JCheckBox c4CheckBox;
	private JCheckBox c5CheckBox;
	private JPanel chooseSeatView;
	private JCheckBox d1CheckBox;
	private JCheckBox d2CheckBox;
	private JCheckBox d3CheckBox;
	private JCheckBox d4CheckBox;
	private JCheckBox d5CheckBox;
	private JCheckBox e1CheckBox;
	private JCheckBox e2CheckBox;
	private JCheckBox e3CheckBox;
	private JCheckBox e4CheckBox;
	private JCheckBox e5CheckBox;
	private JCheckBox f1CheckBox;
	private JCheckBox f2CheckBox;
	private JCheckBox f3CheckBox;
	private JCheckBox f4CheckBox;
	private JCheckBox f5CheckBox;
	private JPanel chooseSeatPanel;
	private JCheckBox g1CheckBox;
	private JCheckBox g2CheckBox;
	private JCheckBox g3CheckBox;
	private JCheckBox g4CheckBox;
	private JCheckBox g5CheckBox;
	private JCheckBox a6CheckBox;
	private JCheckBox b6CheckBox;
	private JCheckBox c6CheckBox;
	private JCheckBox d6CheckBox;
	private JCheckBox e6CheckBox;
	private JCheckBox f6CheckBox;
	private JCheckBox g6CheckBox;
	private JCheckBox h1CheckBox;
	private JCheckBox h2CheckBox;
	private JCheckBox h3CheckBox;
	private JCheckBox h4CheckBox;
	private JCheckBox h5CheckBox;
	private JCheckBox h6CheckBox;
	private JCheckBox i1CheckBox;
	private JCheckBox i2CheckBox;
	private JCheckBox i3CheckBox;
	private JCheckBox i4CheckBox;
	private JCheckBox i5CheckBox;
	private JCheckBox i6CheckBox;
	private JList list1;
	private JPanel ticketPreviewPanel;
	private JTable ticketList;
	private JButton nextButton;
	private JButton cancelButton;
	private JPanel bottomActionPanel;

	public ChooseSeatView() {
		String[] columnNames = {"No.", "Seat", "Price"};

		// Create a default table model with the column names and zero rows
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		// Set the model to the resultTable
		ticketList.setModel(model);
	}

	public JPanel getChooseSeatView() {
		return chooseSeatView;
	}
}
