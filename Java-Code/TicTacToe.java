import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe {
	
	public static boolean turn = true;
	public static JFrame frameX;
	public static Player p;
	public static Player p2;
//	public static Computer c;
	public static ArrayList <Square> square;
	public static int game;
	public static int gameStyle;
	public static int tournament;
	
	
	public TicTacToe(){
		if (tournament==-1){
		gameStyle = 0;
		game = 0;
		frameX = new JFrame();
		this.square = new ArrayList<Square>();
        ImageIcon gameGrid = new ImageIcon("board.jpg");
       int n = JOptionPane.showConfirmDialog(
       		frameX,
       		"Would you like to play Tic Tac Toe?",
       		"Tic Tac Oh no!",
       		JOptionPane.YES_NO_OPTION);
       if (n==1){
       	 game = 1;
       }
       else {
       
       String[] options = new String[] {"Tournament", "Two Player"};

       int x = JOptionPane.showOptionDialog(frameX, "How would you like to play?", 
    		   "Game Modes",
           JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
           null, options, options[0]);
       
//        Add , "Solo" to the String options
//       if (x==2){
//    	   gameStyle = 2;
//       	String s = (String)JOptionPane.showInputDialog(
//                   frameX,
//                   "Input a username!",
//                   "Customized Dialog",
//                   JOptionPane.PLAIN_MESSAGE);
//       	this.p = new Player(s);
//       	this.c = new Computer();
//       	
//       }
       
       if (x==1){
    	   gameStyle = 1;
       	String s = (String)JOptionPane.showInputDialog(
                   frameX,
                   "Input a username!",
                   "Customized Dialog",
                   JOptionPane.PLAIN_MESSAGE);
       	this.p = new Player(s);
       	s = (String)JOptionPane.showInputDialog(
                   frameX,
                   "Input a username!",
                   "Customized Dialog",
                   JOptionPane.PLAIN_MESSAGE);
       	this.p2 = new Player(s);
       }
       	if (x==0){
       		String y = (String)JOptionPane.showInputDialog(
                    frameX,
                    "Input a username for player 1!",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE);
        	this.p = new Player(y);
        	String s = (String)JOptionPane.showInputDialog(
                    frameX,
                    "Input a username for player 2!",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE);
        	this.p2 = new Player(s);
        	tournament = Integer.parseInt(JOptionPane.showInputDialog(
                    frameX,
                    "How many games should we play?",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE));
        	
        	gameStyle = 0;
       	}
       }
       
       if (n!=1){
    	   Grid grid = new Grid();
       }
       
       
		}
		else{
			
		    frameX = new JFrame();
			this.square = new ArrayList<Square>();
	        ImageIcon gameGrid = new ImageIcon("board.jpg");
			Grid grid = new Grid(); 
		       
			
			
		}
	}
	


	public void actionPerformed(ActionEvent e){
		
	}
	public static void main(String[]args){
		tournament = -1;
		game = 0;
		if ((game != 1)){
			TicTacToe t = new TicTacToe();
			
		}
		
		
		
	}
}
