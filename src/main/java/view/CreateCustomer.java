/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.Customer;

import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

import javax.swing.Action;


public class CreateCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;
	private JButton btnSubmit;
	private JLabel lblHeader;
	private final Action action = new SwingAction();
	private static Customer c = new Customer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCustomer frame = new CreateCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateCustomer() {
		setTitle("GitGrub - Create Customer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(22, 64, 48, 14);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(22, 90, 48, 14);
		contentPane.add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone #");
		lblPhone.setBounds(22, 115, 48, 14);
		contentPane.add(lblPhone);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(98, 61, 132, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setBounds(98, 87, 132, 20);
		contentPane.add(textFieldAddress);
		textFieldAddress.setColumns(10);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(98, 112, 96, 20);
		contentPane.add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setAction(action);
		btnSubmit.setBounds(98, 155, 89, 23);
		contentPane.add(btnSubmit);
		
		lblHeader = new JLabel("Please enter your contact information:");
		lblHeader.setBounds(22, 35, 260, 18);
		contentPane.add(lblHeader);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit");
			putValue(SHORT_DESCRIPTION, "Submit customer information");
		}
		public void actionPerformed(ActionEvent e) {
			//Gather the window to dispose and bring up the next window
			JComponent comp = (JComponent) e.getSource();
			Window win = SwingUtilities.getWindowAncestor(comp);
			
			// Create a new customer
			Customer c = new Customer();
			
			// regex for NA phone numbers
			String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
			
			boolean valid = false;
			
			// check if name is blank
			if(textFieldName.getText().isBlank()) {
				JOptionPane.showMessageDialog(win, "Please enter your Name!");
			}
			// check if address is blank
			else if(textFieldAddress.getText().isBlank()) {
				JOptionPane.showMessageDialog(win, "Please enter your Address!");
			}
			// check if phone is blank
			else if(textFieldPhone.getText().isBlank()) {
				JOptionPane.showMessageDialog(win, "Please enter your Phone number!");
			}
			// compare text to phone number regex
			else if(!textFieldPhone.getText().matches(regex)) {
				JOptionPane.showMessageDialog(win, "Please enter a valid Phone number!");
			}
			// all validations confirmed true
			else {
				valid = true;
			}
			
			//  assign validated data to customer
			c.setId(1);
			String name = textFieldName.getText();
			c.setName(name);
			String address = textFieldAddress.getText();
			c.setAddress(address);
			String phone = textFieldPhone.getText();
			c.setPhone(phone);
			
			// continue to next window
			if(valid) {
				win.dispose();
				SelectBusiness sb = new SelectBusiness(c);
				sb.setVisible(true);
			}
		}
	}
}
