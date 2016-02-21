import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ActionClassButton implements ActionListener {

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed = (JButton)(e.getSource());
        String text = pressed.getText();
        int c = 0;
        for (int i = 9; i < 12; i ++){
			if (pressed.equals(ActionClass.B.get(9))){
				c = 1;
				Grid.frame.dispose();
				ActionClass.j.dispose();
				TicTacToe.frameX.dispose();
				TicTacToe t = new TicTacToe();
			}
			if (pressed.equals(ActionClass.B.get(11))){
				Grid.frame.dispose();
				ActionClass.j.dispose();
				c = 1;
			}
			if (pressed.equals(ActionClass.B.get(10))){
				pressed.setText("Sorry, I do nothing");
				c = 1;
			}
		}
        if ( c == 0 ){
	        if (text.equals("O") || text.equals("X")) {
	            return;
	        }
	        else if (TicTacToe.turn == true) {
	            pressed.setText("O");
	            pressed.setForeground(Color.red);
	            pressed.setFont(new Font("Arial", Font.PLAIN, 60));
	       //     TicTacToe.turn = false;
	        } else {
	            pressed.setText("X");
	            pressed.setForeground(Color.blue);
	            pressed.setFont(new Font("Arial", Font.PLAIN, 60));
	       //     TicTacToe.turn = true;
	        }
	        gameCheck(ActionClass.getB(), pressed);
        }
        else{
        	
        }
    }
    
    public void endRound(){
    	if (TicTacToe.turn == true){
			if (TicTacToe.gameStyle == 1){
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p.getName() + " is the WINNER!");
				Square sq = new Square(ActionClass.buttonNumber, "O");
				TicTacToe.square.add(sq);
				ActionClass.j.dispose();
				Grid.updateFrame(TicTacToe.square);
			}
			if (TicTacToe.gameStyle == 0) {
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p.getName() + " is the WINNER!");
				Square sq = new Square(ActionClass.buttonNumber, "O");
				TicTacToe.square.add(sq);
				ActionClass.j.dispose();
				Grid.updateFrame(TicTacToe.square);
			}
			if (TicTacToe.gameStyle == 2){
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p.getName() + " is the WINNER!");
				Square sq = new Square(ActionClass.buttonNumber, "O");
				TicTacToe.square.add(sq);
				ActionClass.j.dispose();
				Grid.updateFrame(TicTacToe.square);
			}
			
		}
		else {
			if (TicTacToe.gameStyle == 1){
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p2.getName() + " is the WINNER!");
				Square sq = new Square(ActionClass.buttonNumber, "X");
				TicTacToe.square.add(sq);
				ActionClass.j.dispose();
				Grid.updateFrame(TicTacToe.square);
			}
			if (TicTacToe.gameStyle == 0) {
				JOptionPane.showMessageDialog(ActionClass.getFrame(), "The COMPUTER is the WINNER!");
				Square sq = new Square(ActionClass.buttonNumber, "X");
				TicTacToe.square.add(sq);
				ActionClass.j.dispose();
				Grid.updateFrame(TicTacToe.square);
			}
			if (TicTacToe.gameStyle == 2){
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p2.getName() + " is the WINNER!");
				Square sq = new Square(ActionClass.buttonNumber, "X");
				TicTacToe.square.add(sq);
				ActionClass.j.dispose();
				Grid.updateFrame(TicTacToe.square);
		}
		
	}
    }
    public void turnChange(){
    	if (TicTacToe.turn == true){
    		TicTacToe.turn = false;
    	}
    	else{
    		TicTacToe.turn = true;
    	}
    }
    
    public void gameCheck(ArrayList<JButton> B, JButton pressed){
		String b1 = B.get(0).getText();
		String b2 = B.get(1).getText();
		String b3 = B.get(2).getText();
		String b4 = B.get(3).getText();
		String b5 = B.get(4).getText();
		String b6 = B.get(5).getText();
		String b7 = B.get(6).getText();
		String b8 = B.get(7).getText();
		String b9 = B.get(8).getText();
		if (b1.equals(b2) && b2.equals(b3) && b3.equals(b1)){
			if (b1.equals("")){
			}
			else{
				endRound();
				}
			
		}
		if (b1.equals(b4) && b4.equals(b7) && b7.equals(b1)){
			if (b1.equals("")){
			}
			else{
				endRound();
				}
		}
		if (b1.equals(b5) && b5.equals(b9) && b9.equals(b1)){
			if (b1.equals("")){
			}
			else{
				endRound();
				}
		}
		if (b8.equals(b2) && b2.equals(b5) && b5.equals(b8)){
			if (b8.equals("")){
			}
			else{
				endRound();
				}
		}
		if (b6.equals(b9) && b9.equals(b3) && b3.equals(b6)){
			if (b6.equals("")){
			}
			else{
				endRound();
				}
		}
		if (b4.equals(b5) && b5.equals(b6) && b6.equals(b4)){
			if (b4.equals("")){
			}
			else{
				endRound();
				}
		}
		if (b7.equals(b8) && b8.equals(b9) && b9.equals(b7)){
			if (b7.equals("")){
			}
			else{
				endRound();
				}
		}
		if (b5.equals(b7) && b7.equals(b3) && b3.equals(b5)){
			if (b5.equals("")){
			}
			else{
				endRound();
				}
		}
		if ((b1!=("")) && (b2!=("")) && (b3!=("")) && (b4!=("")) && (b5!=("")) && (b6!=("")) && (b7!=("")) && (b8!=("")) && (b9!=(""))){
			if (TicTacToe.turn == false){
				if (TicTacToe.gameStyle == 1){
					JOptionPane.showMessageDialog(ActionClass.getFrame(), "You tied, so " + TicTacToe.p.getName() + " is the WINNER!");
					Square sq = new Square(ActionClass.buttonNumber, "O");
					TicTacToe.square.add(sq);
					ActionClass.j.dispose();
					Grid.updateFrame(TicTacToe.square);
				}
				if (TicTacToe.gameStyle == 0) {
					JOptionPane.showMessageDialog(ActionClass.getFrame(), "You tied, so " + TicTacToe.p.getName() + " is the WINNER!");
					Square sq = new Square(ActionClass.buttonNumber, "O");
					TicTacToe.square.add(sq);
					ActionClass.j.dispose();
					Grid.updateFrame(TicTacToe.square);
				}
				if (TicTacToe.gameStyle == 2){
					JOptionPane.showMessageDialog(ActionClass.getFrame(), "You tied, so " + TicTacToe.p.getName() + " is the WINNER!");
					Square sq = new Square(ActionClass.buttonNumber, "O");
					TicTacToe.square.add(sq);
					ActionClass.j.dispose();
					Grid.updateFrame(TicTacToe.square);
				}
				
			}
			else {
				if (TicTacToe.gameStyle == 1){
					JOptionPane.showMessageDialog(ActionClass.getFrame(), "You tied, so " + TicTacToe.p2.getName() + " is the WINNER!");
					Square sq = new Square(ActionClass.buttonNumber, "X");
					TicTacToe.square.add(sq);
					ActionClass.j.dispose();
					Grid.updateFrame(TicTacToe.square);
				}
				if (TicTacToe.gameStyle == 0) {
					JOptionPane.showMessageDialog(ActionClass.getFrame(), "You tied, so the COMPUTER is the WINNER!");
					Square sq = new Square(ActionClass.buttonNumber, "X");
					TicTacToe.square.add(sq);
					ActionClass.j.dispose();
					Grid.updateFrame(TicTacToe.square);
				}
				if (TicTacToe.gameStyle == 2){
					JOptionPane.showMessageDialog(ActionClass.getFrame(), "You tied, so " + TicTacToe.p2.getName() + " is the WINNER!");
					Square sq = new Square(ActionClass.buttonNumber, "X");
					TicTacToe.square.add(sq);
					ActionClass.j.dispose();
					Grid.updateFrame(TicTacToe.square);
			}
				
		}
			
	}		
		/*
		if (((TicTacToe.gameStyle == 0))&& (TicTacToe.turn = true) ){
			
			TicTacToe.c.move();
			turnChange();
		}
		else {
			turnChange();
		}
		*/
    turnChange();
    }
}

