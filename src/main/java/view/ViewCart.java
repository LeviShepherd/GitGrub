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
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import model.Customer;
import model.Order;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JLayeredPane;
import javax.swing.JProgressBar;


public class ViewCart extends JFrame {
	
	private static Customer c = new Customer();
	private static Order order = new Order();
	private JEditorPane textPane;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLayeredPane layeredPane;
	private static JProgressBar progressBar;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCart frame = new ViewCart(order, c);
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
	public ViewCart(Order order, Customer c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 244, 239);
		contentPane.add(layeredPane);
		layeredPane.hide();
		
		progressBar = new JProgressBar();
		progressBar.setBounds(46, 132, 146, 14);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		layeredPane.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("Your order status:");
		lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(46, 89, 146, 14);
		layeredPane.add(lblNewLabel_1);
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setAction(action);
		btnCheckout.setBounds(290, 227, 89, 23);
		contentPane.add(btnCheckout);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 11, 244, 239);
		contentPane.add(textPane);
		
		lblNewLabel = new JLabel("Thank you for your order!");
		lblNewLabel.setFont(new Font("Candara", Font.PLAIN, 15));
		lblNewLabel.setBounds(264, 75, 160, 98);
		contentPane.add(lblNewLabel);
		
		// used to input strings into text doc
		Document doc = textPane.getDocument();
		
		// header string for top of the doc
		String textString = "Order Details:\n";
		try {
			// insert string with order data
			doc.insertString(doc.getLength(), textString, null);
			String s = order.toString();
			doc.insertString(doc.getLength(), s, null);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Checkout");
			putValue(SHORT_DESCRIPTION, "Goes to order status menu");
		}
		public void actionPerformed(ActionEvent e) {
			// hide original pane, show layered pane w/ progress bar
			textPane.hide();
			layeredPane.show();
			// fill the progress bar
			fill();
			
		}
	}
	
	/**
	 * This method gives the progress bar an initial value, then calls a function
	 * to finish filling the bar based on progress.
	 */
	public static void fill() {
		progressBar.setValue(10);
		// used to fill up the rest of the progress bar
		//fillUp();
	}
	
	/**
	 * This method is used to finish filling the progress bar to 100%
	 */
	public static void fillUp() {
		int i = 10;
        try {
            while (i <= 100) {
                // fill the menu bar
                progressBar.setValue(i + 10);
 
                // delay the thread
                Thread.sleep(1000);
                i += 20;
            }
        }
        catch (Exception e) {
        }
	}
}
