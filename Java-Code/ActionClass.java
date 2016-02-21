import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ActionClass implements ActionListener {

	public static ArrayList<JButton> B;
	public static JFrame j;
	public static int buttonNumber;
	
	ActionClassButton action = new ActionClassButton();
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	JButton one = new JButton("");
	JButton two = new JButton("");
	JButton three = new JButton("");
	JButton four = new JButton("");
	JButton five = new JButton("");
	JButton six = new JButton("");
	JButton seven = new JButton("");
	JButton eight = new JButton("");
	JButton nine = new JButton("");
	JButton restart = new JButton("RESTART");
    JButton filler = new JButton("+");
    JButton quit = new JButton("QUIT");

	public static ArrayList<JButton> B2 = new ArrayList<JButton>();
	
	public static ArrayList<JButton> getB(){
		return B;
	}
	public static JFrame getFrame(){
		return j;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		one.setBackground(Color.WHITE);
		two.setBackground(Color.WHITE);
		three.setBackground(Color.WHITE);
		four.setBackground(Color.WHITE);
		five.setBackground(Color.WHITE);
		six.setBackground(Color.WHITE);
		seven.setBackground(Color.WHITE);
		eight.setBackground(Color.WHITE);
		nine.setBackground(Color.WHITE);
		
		
		buttonNumber = 0;
		JButton pressed = (JButton)(e.getSource());
		if (pressed.getText()!= ""){
			return;
		}
		for (int i = 9; i < 12; i ++){
			if (pressed.equals(Grid.Button.get(9))){
				buttonNumber = 1;
				Grid.frame.dispose();
				TicTacToe t = new TicTacToe();
			}
			if (pressed.equals(Grid.Button.get(11))){
				Grid.frame.dispose();
				buttonNumber = 1;
			}
		}
		if (buttonNumber == 0){
		for (int i = 0; i < 9; i ++){
			if (pressed.equals(Grid.Button.get(i))){
				buttonNumber = i ;
			}
		}
		pressed = new JButton("");
		Grid.setVisible(false);
		j = new JFrame("Tic Tac Nine!");
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(restart);
		buttons.add(filler);
		buttons.add(quit);
		this.B = buttons;
		
		if (TicTacToe.turn = false){
			replaceWithB();
			this.B = B2;
		}
		else {
			this.B = buttons;
		}
		
		j.add(one);
		j.add(two);
		j.add(three);
		j.add(four);
		j.add(five);
		j.add(six);
		j.add(seven);
		j.add(eight);
		j.add(nine);
		j.add(restart);
		j.add(filler);
		j.add(quit);
		j.setLayout(new GridLayout(4,3, 10, 10));
		j.setSize(500,700);
		j.setVisible(true);
	    one.addActionListener(action);
		two.addActionListener(action);
		three.addActionListener(action);
		four.addActionListener(action);
		five.addActionListener(action);
		six.addActionListener(action);
		seven.addActionListener(action);
		eight.addActionListener(action);
		nine.addActionListener(action);
		restart.addActionListener(action);
		filler.addActionListener(action);
		quit.addActionListener(action);
		}
		else {
			
		}
	}

	private void replaceWithB() {
		one = B.get(0);
		two = B.get(1);
		three = B.get(2);
		four = B.get(3);
		five = B.get(4);
		six = B.get(5);
		seven = B.get(6);
		eight = B.get(7);
		nine = B.get(8);
	}
	
	public static boolean nowPress(int x){
		
			if (x == 0){
				if (B.get(0).getText() == ""){
					B.get(0).setText("X");
					B.get(0).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 1){
				if (B.get(1).getText() == ""){
					B.get(1).setText("X");
					B.get(1).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 2){
				if (B.get(2).getText() == ""){
					B.get(2).setText("X");
					B.get(2).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 3){
				if (B.get(3).getText() == ""){
					B.get(3).setText("X");
					B.get(3).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 4){
				if (B.get(4).getText() == ""){
					B.get(4).setText("X");
					B.get(4).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 5){
				if (B.get(5).getText() == ""){
					B.get(5).setText("X");
					B.get(5).setForeground(Color.BLUE);
					return true;
				}
							}
			if (x == 6){
				if (B.get(6).getText() == ""){
					B.get(6).setText("X");
					B.get(6).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 7){
				if (B.get(7).getText() == ""){
					B.get(7).setText("X");
					B.get(7).setForeground(Color.BLUE);
					return true;
				}
				
			}
			if (x == 8){
				if (B.get(8).getText() == ""){
					B.get(8).setText("X");
					B.get(8).setForeground(Color.BLUE);
					return true;
				}
				
			}
			
				return false;
			
		
	}
	
}


