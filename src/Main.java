import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
	JPanel contentPane = new JPanel();
	CardLayout cl = new CardLayout();
	LoginView loginView = new LoginView();
	ReceptionistHomeView receptionistHomeView = new ReceptionistHomeView();
	SellTicketView sellTicketView = new SellTicketView();
	ChooseSeatView chooseSeatView = new ChooseSeatView();
	SearchCustomerView searchCustomerView = new SearchCustomerView();
	CustomerDetailView customerDetailView = new CustomerDetailView();
	AddCustomerView addCustomerView = new AddCustomerView();
	InvoiceConfirmView invoiceConfirmView = new InvoiceConfirmView();

	public Main() {
		setTitle("Sell Tickets");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 650);
		setLocationRelativeTo(null);

		contentPane.setLayout(cl);

		contentPane.add(loginView.getLoginView(), "loginView");
		contentPane.add(receptionistHomeView.getReceptionistHomeView(), "receptionistHomeView");
		contentPane.add(sellTicketView.getSellTicketView(), "sellTicketView");
		contentPane.add(chooseSeatView.getChooseSeatView(), "chooseSeatView");
		contentPane.add(searchCustomerView.getSearchCustomerView(), "searchCustomerView");
		contentPane.add(customerDetailView.getCustomerDetailView(), "customerDetailView");
		contentPane.add(addCustomerView.getAddCustomerView(), "addCustomerView");
		contentPane.add(invoiceConfirmView.getInvoiceConfirmView(), "invoiceConfirmView");
		cl.show(contentPane, "invoiceConfirmView");

		add(contentPane);

		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Main::new);
	}

}