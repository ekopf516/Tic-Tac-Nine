import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.*;

public class Grid {
	
public static JFrame Frame;
public static ArrayList<JButton> Button;
public static JFrame frame;

public static void setVisible(Boolean b){
	frame.setVisible(b);
	if (b==false){
		frame.dispose();
	}
	
}

   public  Grid() {
        this.frame = new JFrame(); 
        ActionClass actionEvent = new ActionClass();
        ImageIcon gameGrid = new ImageIcon("board.jpg");
        Image img = gameGrid.getImage();
        BufferedImage buff = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = buff.createGraphics();
        g.drawImage(img, 70, 70, 160, 160, null);
        ImageIcon newGrid = new ImageIcon(buff);
        
        JButton one = new JButton(newGrid);
        JButton two = new JButton(newGrid);
        JButton three = new JButton(newGrid);
        JButton four = new JButton(newGrid);
        JButton five = new JButton(newGrid);
        JButton six = new JButton(newGrid);
        JButton seven = new JButton(newGrid);
        JButton eight = new JButton(newGrid);
        JButton nine = new JButton(newGrid);
        JButton restart = new JButton("RESTART");
        JButton filler = new JButton("+");
        JButton quit = new JButton("QUIT");
        ArrayList<JButton> j = new ArrayList<JButton>();
        
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
        this.Button = j;
        
        one.addActionListener(actionEvent);
        two.addActionListener(actionEvent);
        three.addActionListener(actionEvent);
        four.addActionListener(actionEvent);
        five.addActionListener(actionEvent);
        six.addActionListener(actionEvent);
        seven.addActionListener(actionEvent);
        eight.addActionListener(actionEvent);
        nine.addActionListener(actionEvent);
        restart.addActionListener(actionEvent);
        quit.addActionListener(actionEvent);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(restart);
        frame.add(filler);
        frame.add(quit);
        frame.setLayout(new GridLayout(4,3, 10, 10));
        frame.setSize(500,700);
        frame.setVisible(true);
        Frame = frame;
    }
   
   public static  void updateFrame(ArrayList<Square> s){
	   frame = new JFrame(); 
       ActionClass actionEvent = new ActionClass();
       ImageIcon gameGrid = new ImageIcon("board.jpg");
       Image img = gameGrid.getImage();
       BufferedImage buff = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
       Graphics g = buff.createGraphics();
       g.drawImage(img, 70, 70, 160, 160, null);
       ImageIcon newGrid = new ImageIcon(buff);
       JButton one = new JButton(newGrid);
       JButton two = new JButton(newGrid);
       JButton three = new JButton(newGrid);
       JButton four = new JButton(newGrid);
       JButton five = new JButton(newGrid);
       JButton six = new JButton(newGrid);
       JButton seven = new JButton(newGrid);
       JButton eight = new JButton(newGrid);
       JButton nine = new JButton(newGrid);
       JButton restart = new JButton("RESTART");
       JButton filler = new JButton("+");
       JButton quit = new JButton("QUIT");
       
       for (int v = 0; v < 9; v++){
    	   for (int i = 0; i < s.size(); i++ ){
    		   if (v==s.get(i).getX()){
    			   JButton x = new JButton(s.get(i).getS());
    			   if (v==0){
    				   one = x;
    			   }
    			   if (v==1){
    				   two = x;
    			   }
    			   if (v==2){
    				   three = x;
    			   }
    			   if (v==3){
    				   four = x;
    			   }
    			   if (v==4){
    				   five = x;
    			   }
    			   if (v==5){
    				   six = x;
    			   }
    			   if (v==6){
    				   seven = x;
    			   }
    			   if (v==7){
    				   eight = x;
    			   }
    			   if (v==8){
    				   nine = x;
    			   }
    		   }   
    	   }
       }
       ArrayList<JButton> j = new ArrayList<JButton>();
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
       Button = j;
       one.addActionListener(actionEvent);
       two.addActionListener(actionEvent);
       three.addActionListener(actionEvent);
       four.addActionListener(actionEvent);
       five.addActionListener(actionEvent);
       six.addActionListener(actionEvent);
       seven.addActionListener(actionEvent);
       eight.addActionListener(actionEvent);
       nine.addActionListener(actionEvent);
       restart.addActionListener(actionEvent);
       filler.addActionListener(actionEvent);
       quit.addActionListener(actionEvent);
       frame.add(one);
       frame.add(two);
       frame.add(three);
       frame.add(four);
       frame.add(five);
       frame.add(six);
       frame.add(seven);
       frame.add(eight);
       frame.add(nine);
       frame.add(restart);
       frame.add(filler);
       frame.add(quit);
       frame.setLayout(new GridLayout(4,3, 10, 10));
       frame.setSize(500,700);
       frame.setVisible(true);
       gameCheck(Button);
   }
   
   
   
   public static void endRound(){
   	if (TicTacToe.turn == true){
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p.getName() + " is the WINNER!");
				if (TicTacToe.gameStyle==0){
					TicTacToe.p.setGamesWon();
					if (TicTacToe.tournament>1){
						TicTacToe.tournament=TicTacToe.tournament-1;
						JOptionPane.showMessageDialog (null, "You have " + TicTacToe.tournament + " game(s) remaining!",
						"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
						TicTacToe t = new TicTacToe();
						}
					else{
						if (TicTacToe.p.getGamesWon()>TicTacToe.p.getGamesLost()){
							JOptionPane.showMessageDialog (null, TicTacToe.p.getName() + " is the WINNER!",
									"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
						}
						if (TicTacToe.p.getGamesWon()<TicTacToe.p.getGamesLost()){
							JOptionPane.showMessageDialog (null, TicTacToe.p2.getName() + " is the WINNER!",
									"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);					
						}
						if (TicTacToe.p.getGamesWon()==TicTacToe.p.getGamesLost()){
							JOptionPane.showMessageDialog (null, TicTacToe.p.getName() + " and " + TicTacToe.p2.getName() + " have TIED!",
									"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
						}
						int n = JOptionPane.showConfirmDialog(
					       		frame,
					       		"Would you like to play again?",
					       		"Tic Tac Oh no!",
					       		JOptionPane.YES_NO_OPTION);
					        if (n==1){
					       	 	TicTacToe.game = 1;
					       	 	setVisible(false);
					        }
					        else {
					    	   TicTacToe t = new TicTacToe();
					        }
					}
				}
				else {
					int n = JOptionPane.showConfirmDialog(
			       		frame,
			       		"Would you like to play again?",
			       		"Tic Tac Oh no!",
			       		JOptionPane.YES_NO_OPTION);
			        if (n==1){
			       	 	TicTacToe.game = 1;
			       	 	setVisible(false);
			        }
			        else {
			    	   TicTacToe t = new TicTacToe();
			        }
			}
		}
		else {
			if (TicTacToe.gameStyle == 1){
				JOptionPane.showMessageDialog(ActionClass.getFrame(), TicTacToe.p2.getName() + " is the WINNER!");
				int n = JOptionPane.showConfirmDialog(
			       		frame,
			       		"Would you like to play again?",
			       		"Tic Tac Oh no!",
			       		JOptionPane.YES_NO_OPTION);
			        if (n==1){
			       	 	TicTacToe.game = 1;
			       	 	setVisible(false);
			        }
			        else {
			    	   TicTacToe t = new TicTacToe();
			        }
			}
			if (TicTacToe.gameStyle == 2) {
				JOptionPane.showMessageDialog(ActionClass.getFrame(), "The COMPUTER is the WINNER!");
				int n = JOptionPane.showConfirmDialog(
			       		frame,
			       		"Would you like to play again?",
			       		"Tic Tac Oh no!",
			       		JOptionPane.YES_NO_OPTION);
			        if (n==1){
			       	 	TicTacToe.game = 1;
			       	 	setVisible(false);
			        }
			        else {
			    	   TicTacToe t = new TicTacToe();
			        }
			}
			if (TicTacToe.gameStyle == 0){
				TicTacToe.p.setGamesLost();
				if (TicTacToe.tournament>1){
					TicTacToe.tournament=TicTacToe.tournament-1;
					JOptionPane.showMessageDialog (null, "You have " + TicTacToe.tournament + " game(s) remaining!",
					"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
					TicTacToe t = new TicTacToe();
				}
				else{
				TicTacToe.p.setGamesLost();
				JOptionPane.showMessageDialog(ActionClass.getFrame(), "The COMPUTER is the WINNER!");
				if (TicTacToe.tournament>1){
					TicTacToe.tournament=TicTacToe.tournament-1;
					JOptionPane.showMessageDialog (null, "You have " + TicTacToe.tournament + " game(s) remaining!",
					"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
					TicTacToe t = new TicTacToe();
					}
				else{
					if (TicTacToe.p.getGamesWon()>TicTacToe.p.getGamesLost()){
						JOptionPane.showMessageDialog (null, TicTacToe.p.getName() + " is the WINNER!",
								"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
					}
					if (TicTacToe.p.getGamesWon()<TicTacToe.p.getGamesLost()){
						JOptionPane.showMessageDialog (null, TicTacToe.p2.getName() + " is the WINNER!",
								"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);					
					}
					if (TicTacToe.p.getGamesWon()==TicTacToe.p.getGamesLost()){
						JOptionPane.showMessageDialog (null, TicTacToe.p.getName() + " and " + TicTacToe.p2.getName() + " have TIED!",
								"Tournament Mode", JOptionPane.INFORMATION_MESSAGE);
					}
					int n = JOptionPane.showConfirmDialog(
				       		frame,
				       		"Would you like to play again?",
				       		"Tic Tac Oh no!",
				       		JOptionPane.YES_NO_OPTION);
				        if (n==1){
				       	 	TicTacToe.game = 1;
				       	 	setVisible(false);
				        }
				        else {
				    	   TicTacToe t = new TicTacToe();
				        }
				}
				}
				
		}
		
	}
   }
   public static void gameCheck(ArrayList<JButton> B){
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
			else{endRound();}
		}
		if (b1.equals(b5) && b5.equals(b9) && b9.equals(b1)){
			if (b1.equals("")){
			}
			else{endRound();}
		}
		if (b8.equals(b2) && b2.equals(b5) && b5.equals(b8)){
			if (b8.equals("")){
			}
			else{endRound();}
		}
		if (b6.equals(b9) && b9.equals(b3) && b3.equals(b6)){
			if (b6.equals("")){
			}
			else{endRound();}
		}
		if (b4.equals(b5) && b5.equals(b6) && b6.equals(b4)){
			if (b4.equals("")){
			}
			else{endRound();}
		}
		if (b7.equals(b8) && b8.equals(b9) && b9.equals(b7)){
			if (b7.equals("")){
			}
			else{endRound();}
		}
		if (b5.equals(b7) && b7.equals(b3) && b3.equals(b5)){
			if (b5.equals("")){
			}
			else{endRound();}
		}
		if ((b1!=("")) && (b2!=("")) && (b3!=("")) && (b4!=("")) && (b5!=("")) && (b6!=("")) && (b7!=("")) && (b8!=("")) && (b9!=(""))){
			JOptionPane.showMessageDialog(ActionClass.getFrame(), "You Tied!");
			
			if (TicTacToe.gameStyle==2){
				if (TicTacToe.tournament>1){
					TicTacToe t = new TicTacToe();
				}
				else {

					if (TicTacToe.p.getGamesWon()>TicTacToe.p.getGamesLost()){
						int n = JOptionPane.showConfirmDialog(
					       		frame,
					       		"You Won! Would you like to play again?",
					       		"Tic Tac Oh no!",
					       		JOptionPane.YES_NO_OPTION);
					       if (n==1){
					       	 TicTacToe.game = 1;
					       	setVisible(false);
					       }
					       else {
					    	   TicTacToe t = new TicTacToe();
					       }
					}
					if (TicTacToe.p.getGamesWon()<TicTacToe.p.getGamesLost()){
						int n = JOptionPane.showConfirmDialog(
					       		frame,
					       		"You lost! Would you like to play again?",
					       		"Tic Tac Oh no!",
					       		JOptionPane.YES_NO_OPTION);
					       if (n==1){
					       	 TicTacToe.game = 1;
					       	setVisible(false);
					       }
					       else {
					    	   TicTacToe t = new TicTacToe();
					       }			
					}
					if (TicTacToe.p.getGamesWon()==TicTacToe.p.getGamesLost()){
						int n = JOptionPane.showConfirmDialog(
					       		frame,
					       		"You tied! Would you like to play again?",
					       		"Tic Tac Oh no!",
					       		JOptionPane.YES_NO_OPTION);
					       if (n==1){
					       	 TicTacToe.game = 1;
					       	setVisible(false);
					       }
					       else {
					    	   TicTacToe t = new TicTacToe();
					       }
					}
				
				}
			}
			else{
				int n = JOptionPane.showConfirmDialog(
		       		frame,
		       		"Would you like to play again?",
		       		"Tic Tac Oh no!",
		       		JOptionPane.YES_NO_OPTION);
		       if (n==1){
		       	 TicTacToe.game = 1;
		       	setVisible(false);
		       }
		       else {
		    	   TicTacToe t = new TicTacToe();
		       }
			}
			
			
		}
	}
   
   public static void main(String[]  args) {
	   new Grid();
   }
}
