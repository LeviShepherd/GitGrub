/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import controller.BusinessHelper;
import model.Business;
import model.Customer;
import model.Order;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.Action;

public class SelectBusiness extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxBusiness;
	private JButton btnSubmit;
	private JLabel lblHeader;
	private final Action action = new SwingAction();
	private static Customer c = new Customer();
	private static Order order = new Order();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectBusiness frame = new SelectBusiness(c);
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
	public SelectBusiness(Customer c) {
		setTitle("GitGrub - Select Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHeader = new JLabel("Select from a local business:");
		lblHeader.setBounds(10, 32, 209, 14);
		contentPane.add(lblHeader);
		
		comboBoxBusiness = new JComboBox();
		comboBoxBusiness.setBounds(210, 28, 173, 22);
		contentPane.add(comboBoxBusiness);
		
		// Populate the comboBoxBusiness with businesses
		BusinessHelper bh = new BusinessHelper();
		List<Business> allBus = new ArrayList<>();
		allBus = bh.getBusinesses();
		
		// loop to add businesses from ArrayList of business objects
		for(int i = 0; i < allBus.size(); i++) {
			comboBoxBusiness.addItem(allBus.get(i).getName());
		}
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setAction(action);
		btnSubmit.setBounds(35, 102, 89, 23);
		contentPane.add(btnSubmit);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit");
			putValue(SHORT_DESCRIPTION, "Submit selection for business");
		}
		public void actionPerformed(ActionEvent e) {
			//Gather the window to dispose and bring up the next window
			JComponent comp = (JComponent) e.getSource();
			Window win = SwingUtilities.getWindowAncestor(comp);
			
			BusinessHelper bh = new BusinessHelper();
			List<Business> allBus = new ArrayList<>();
			allBus = bh.getBusinesses();
			
			
			String selectedBusName = (String)comboBoxBusiness.getSelectedItem();
			
			for(int i = 0; i < allBus.size(); i++) {
				String name = allBus.get(i).getName();
				if(!name.equals(selectedBusName)) {
					
				} else {
					try {
						int busId = allBus.get(i).getId();
						order.setBusId(busId);
					}
					catch(Exception selectionEx) {
						JOptionPane.showMessageDialog(win, "No Business selection detected.");
					}
				}	
			}
			
			
			win.dispose();
			ViewMenuItems vmi = new ViewMenuItems(order, c);
			vmi.setVisible(true);
		}
	}
}
