package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import view.CreateCustomer;

import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 5, 2021
 */

public class StartProgram {

	private JFrame frmGitgrub;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartProgram window = new StartProgram();
					window.frmGitgrub.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGitgrub = new JFrame();
		frmGitgrub.setTitle("GitGrub");
		frmGitgrub.setBounds(100, 100, 450, 300);
		frmGitgrub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGitgrub.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.setAction(action);
		btnStart.setBounds(172, 213, 89, 23);
		frmGitgrub.getContentPane().add(btnStart);
		
		JLabel lblNewLabel = new JLabel("GitGrub");
		lblNewLabel.setFont(new Font("Candara", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 48, 293, 126);
		frmGitgrub.getContentPane().add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Start");
			putValue(SHORT_DESCRIPTION, "Starts the program");
		}
		public void actionPerformed(ActionEvent e) {
			frmGitgrub.dispose();
			CreateCustomer cc = new CreateCustomer();
			cc.setVisible(true);
		}
	}
}
