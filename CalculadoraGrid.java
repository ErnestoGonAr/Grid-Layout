import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class CalculadoraGrid extends JFrame{

	JButton ki=new JButton("de");
//	ki.addMouseListener(this);
	public CalculadoraGrid(){
	super("Calculadora");
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	FlowLayout p= new FlowLayout();
//	JPanel f2= new JPanel();
//	f2.setLayout(p);
	JPanel f= new JPanel();
	GridLayout num= new GridLayout(5,3);
	f.setLayout(num);
	JTextField j=new JTextField();
	f.add(j);
	JButton more=new JButton("+");
	f.add(more);
	JButton noMore=new JButton("-");
	f.add(noMore);
	JButton one= new JButton("1");
	f.add(one);
//	ki.addMouseListener(this);
//	one.addActionListener(new ActionListener(){
//		public void actionPerfomed(ActionEvent e){
//		System.exit(0);}});
	
	JButton two= new JButton("2");
	f.add(two);
	JButton three=new JButton("3");
	f.add(three);
	JButton four=new JButton("4");
	f.add(four);
	JButton five=new JButton("5");
	f.add(five);
	JButton six=new JButton("6");
	f.add(six);
	JButton seven=new JButton("7");
	f.add(seven);
	JButton eigth=new JButton("8");
	f.add(eigth);
	JButton nine=new JButton("9");
	f.add(nine);
	JButton point=new JButton(".");
	f.add(point);
	JButton cero=new JButton("0");
	f.add(cero);
	JButton igual=new JButton("=");
	f.add(igual);
	add(f);
//	add(f2);
	setVisible(true);
}
/*	public void actionPerformed(ActionEvent e){
	if(e.getSourse()==ki){
	System.exit(0);
	}
	}
	public void mouseClicked(MouseEvent e){
	if(e.getSourse()==ki){
	j.setText("hey");}
	}*/

	public float suma(float a,float b){
		float r;
		r=a+b;
		return r; 
	}
	public float resta(float a,float b){
		float r;
		r=a-b;
		return r;
	}
	public static void main(String ar[]){

	CalculadoraGrid c=new CalculadoraGrid();
}
}
