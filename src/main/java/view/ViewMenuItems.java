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
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import controller.ItemHelper;
import controller.OrderHelper;
import model.Customer;
import model.Item;
import model.Order;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Action;


public class ViewMenuItems extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldItem1Qty;
	private JTextField textFieldItem2Qty;
	private JTextField textFieldItem3Qty;
	private JTextField textFieldItem4Qty;
	private JTextField textFieldItem5Qty;
	private JTextField textFieldItem6Qty;
	private JTextField textFieldItem7Qty;
	private JTextField textFieldItem8Qty;
	private JLabel lblName1;
	private JLabel lblName2;
	private JLabel lblName3;
	private JLabel lblName4;
	private JLabel lblName5;
	private JLabel lblName6;
	private JLabel lblName7;
	private JLabel lblName8;
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
					Order order = new Order();
					ViewMenuItems frame = new ViewMenuItems(order, c);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param c 
	 */
	public ViewMenuItems(Order order, Customer c) {
		setTitle("GitGrub - Menu Items");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		// prepare item data for plugging into labels
		int busId = order.getBusId();
		ItemHelper ih = new ItemHelper();
		List<Item> allItems = new ArrayList<>();
		allItems = ih.getItems(busId);
		
		// create items for use in labels
		Item i1 = allItems.get(0);
		Item i2 = allItems.get(1);
		Item i3 = allItems.get(2);
		Item i4 = allItems.get(3);
		Item i5 = allItems.get(4);
		Item i6 = allItems.get(5);
		Item i7 = allItems.get(6);
		Item i8 = allItems.get(7);
		
		lblName1 = new JLabel(i1.getName().toString());
		contentPane.add(lblName1, "2, 2");
		
		String s1 = String.valueOf(i1.getPrice());
		JLabel lblPrice1 = new JLabel("$" + s1);
		contentPane.add(lblPrice1, "4, 2, right, default");
		
		textFieldItem1Qty = new JTextField("0");
		contentPane.add(textFieldItem1Qty, "6, 2, left, default");
		textFieldItem1Qty.setColumns(10);
		
		lblName2 = new JLabel(i2.getName().toString());
		contentPane.add(lblName2, "2, 4");
		
		String s2 = String.valueOf(i2.getPrice());
		JLabel lblPrice2 = new JLabel("$" + s2);
		contentPane.add(lblPrice2, "4, 4, right, default");
		
		textFieldItem2Qty = new JTextField("0");
		contentPane.add(textFieldItem2Qty, "6, 4, left, default");
		textFieldItem2Qty.setColumns(10);
		
		lblName3 = new JLabel(i3.getName().toString());
		contentPane.add(lblName3, "2, 6");
		
		String s3 = String.valueOf(i3.getPrice());
		JLabel lblPrice3 = new JLabel("$" + s3);
		contentPane.add(lblPrice3, "4, 6, right, default");
		
		textFieldItem3Qty = new JTextField("0");
		contentPane.add(textFieldItem3Qty, "6, 6, left, default");
		textFieldItem3Qty.setColumns(10);
		
		lblName4 = new JLabel(i4.getName().toString());
		contentPane.add(lblName4, "2, 8");
		
		String s4 = String.valueOf(i4.getPrice());
		JLabel lblPrice4 = new JLabel("$" + s4);
		contentPane.add(lblPrice4, "4, 8, right, default");
		
		textFieldItem4Qty = new JTextField("0");
		contentPane.add(textFieldItem4Qty, "6, 8, left, default");
		textFieldItem4Qty.setColumns(10);
		
		lblName5 = new JLabel(i5.getName().toString());
		contentPane.add(lblName5, "2, 10");
		
		String s5 = String.valueOf(i5.getPrice());
		JLabel lblPrice5 = new JLabel("$" + s5);
		contentPane.add(lblPrice5, "4, 10, right, default");
		
		textFieldItem5Qty = new JTextField("0");
		contentPane.add(textFieldItem5Qty, "6, 10, left, default");
		textFieldItem5Qty.setColumns(10);
		
		lblName6 = new JLabel(i6.getName().toString());
		contentPane.add(lblName6, "2, 12");
		
		String s6 = String.valueOf(i6.getPrice());
		JLabel lblPrice6 = new JLabel("$" + s6);
		contentPane.add(lblPrice6, "4, 12, right, default");
		
		textFieldItem6Qty = new JTextField("0");
		contentPane.add(textFieldItem6Qty, "6, 12, left, default");
		textFieldItem6Qty.setColumns(10);
		
		lblName7 = new JLabel(i7.getName().toString());
		contentPane.add(lblName7, "2, 14");
		
		String s7 = String.valueOf(i7.getPrice());
		JLabel lblPrice7 = new JLabel("$" + s7);
		contentPane.add(lblPrice7, "4, 14, right, default");
		
		textFieldItem7Qty = new JTextField("0");
		contentPane.add(textFieldItem7Qty, "6, 14, left, default");
		textFieldItem7Qty.setColumns(10);
		
		lblName8 = new JLabel(i8.getName().toString());
		contentPane.add(lblName8, "2, 16");
		
		String s8 = String.valueOf(i8.getPrice());
		JLabel lblPrice8 = new JLabel("$" + s8);
		contentPane.add(lblPrice8, "4, 16, right, default");
		
		textFieldItem8Qty = new JTextField("0");
		contentPane.add(textFieldItem8Qty, "6, 16, left, default");
		textFieldItem8Qty.setColumns(10);
		
		JButton btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setAction(action);
		contentPane.add(btnAddToCart, "6, 18, left, default");
	}

	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Add To Cart");
			putValue(SHORT_DESCRIPTION, "Add items to the customers cart");
		}
		public void actionPerformed(ActionEvent e) {
			//Gather the window to dispose and bring up the next window
			JComponent comp = (JComponent) e.getSource();
			Window win = SwingUtilities.getWindowAncestor(comp);
			
			OrderHelper oh = new OrderHelper();
			
			// parse quantity
			int item1qty = Integer.parseInt(textFieldItem1Qty.getText());
			int item2qty = Integer.parseInt(textFieldItem2Qty.getText());
			int item3qty = Integer.parseInt(textFieldItem3Qty.getText());
			int item4qty = Integer.parseInt(textFieldItem4Qty.getText());
			int item5qty = Integer.parseInt(textFieldItem5Qty.getText());
			int item6qty = Integer.parseInt(textFieldItem6Qty.getText());
			int item7qty = Integer.parseInt(textFieldItem7Qty.getText());
			int item8qty = Integer.parseInt(textFieldItem8Qty.getText());
			
			// gather business id from labels
			if(lblName1.getText().equals("Cheeseburger")) {
				order.setBusId(1);
			}
			else if(lblName1.getText().equals("Spaghetti")) {
				order.setBusId(2);
			}
			else if(lblName1.getText().equals("Chicken Taco")) {
				order.setBusId(3);
			}
			else if(lblName1.getText().equals("Hamburger")) {
				order.setBusId(4);
			}
			else if(lblName1.getText().equals("Buffalo Wings")) {
				order.setBusId(5);
			}
			else if(lblName1.getText().equals("Fish Taco")) {
				order.setBusId(6);
			}
			else {
				order.setBusId(0);
			}
			
			// repopulate allItems with list of menu items
			int busId = order.getBusId();
			ItemHelper ih = new ItemHelper();
			List<Item> allItems = new ArrayList<>();
			allItems = ih.getItems(busId);
			
			// assign individual items to objects
			Item i1 = allItems.get(0);
			Item i2 = allItems.get(1);
			Item i3 = allItems.get(2);
			Item i4 = allItems.get(3);
			Item i5 = allItems.get(4);
			Item i6 = allItems.get(5);
			Item i7 = allItems.get(6);
			Item i8 = allItems.get(7);
			
			// store a running total
			double orderTotal = 0;
			
			// calculate the total
			orderTotal += oh.getItemTotal(i1, item1qty);
			orderTotal += oh.getItemTotal(i2, item2qty);
			orderTotal += oh.getItemTotal(i3, item3qty);
			orderTotal += oh.getItemTotal(i4, item4qty);
			orderTotal += oh.getItemTotal(i5, item5qty);
			orderTotal += oh.getItemTotal(i6, item6qty);
			orderTotal += oh.getItemTotal(i7, item7qty);
			orderTotal += oh.getItemTotal(i8, item8qty);
			
			// add the total to the order
			order.setAmount(orderTotal);
			
			// create a linked list of items for order object
			LinkedList<Item> items = new LinkedList<Item>();
			
			// take quantities and assign to items then add to linked list
			if(item1qty > 0) {
				i1.setQuantity(item1qty);
				items.add(i1);
			}
			if(item2qty > 0) {
				i2.setQuantity(item2qty);
				items.add(i2);
			}
			if(item3qty > 0) {
				i3.setQuantity(item3qty);
				items.add(i3);
			}
			if(item4qty > 0) {
				i4.setQuantity(item4qty);
				items.add(i4);
			}
			if(item5qty > 0) {
				i5.setQuantity(item5qty);
				items.add(i5);
			}
			if(item6qty > 0) {
				i6.setQuantity(item6qty);
				items.add(i6);
			}
			if(item7qty > 0) {
				i7.setQuantity(item7qty);
				items.add(i7);
			}
			if(item8qty > 0) {
				i8.setQuantity(item8qty);
				items.add(i8);
			}
			
			// assign the linked list of items to the order obj
			order.setItems(items);
			
			// destroy frame, grab new frame passing order and customer
			win.dispose();
			ViewCart vc = new ViewCart(order, c);
			vc.setVisible(true);
		}
	}
}
