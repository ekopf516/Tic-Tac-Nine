import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button {

	private String text;
	private ImageIcon img;
	private JButton j;

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public Button(ImageIcon img, String text){
		this.text = text;
		this.img = img;
//		JButton b = new JButton(img);
		JButton b = new JButton(text);
		this.j=b;

	}

	public JButton getJ() {
		return j;
	}

	public void setJ(JButton j) {
		this.j = j;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ArrayList<Button> updateButton(int x, ArrayList<Button> j){

		j.get(x);
		Button p = new Button(null,"X");
		Button c = new Button(null,"O");
		Button m = new Button(null,"");
		ArrayList<Button> y = j;
		j.clear();
		for (int i=0; i<j.size();i++){
			Button t = y.get(i);
			String s = y.get(i).getText();
			if ((i==x) && (t.getText().equals(""))){
				j.add(p);
			}
			if ((i!=x) && ((t.getText().equals(s)))){
				m.setText(s);
				j.add(m);
			}
			if ((i!=x) && ((t.getText().equals("")))) {
				p = new Button(null,"");
				j.add(p);
			}
		}
		return j;
	}

}
