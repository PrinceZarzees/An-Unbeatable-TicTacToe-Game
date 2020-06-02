package Java;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class tictactoe implements ActionListener{
	private char gameboard[][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
	private int pc1=0,pc2=0,angle=0,pcfirst=0,youfirst=0;
	private int count=0;
private JFrame window=new JFrame("Tic-Tac-Toe");
private JButton button1=new JButton("");
private JButton button2=new JButton("");
private JButton button3=new JButton("");
private JButton button4=new JButton("");
private JButton button5=new JButton("");
private JButton button6=new JButton("");
private JButton button7=new JButton("");
private JButton button8=new JButton("");
private JButton button9=new JButton("");
private JButton button10=new JButton("PC TURN");
private JButton button11=new JButton("Pc First");
private JButton button12=new JButton("You First");
private JButton button13=new JButton("Reset");
private JButton button14=new JButton("");
private JButton button15=new JButton("");

public void actionPerformed(ActionEvent a) {
	if (a.getSource()==button13)
	{gameboard[0][0]=' ';gameboard[0][1]=' ';gameboard[0][2]=' ';
	gameboard[1][0]=' ';gameboard[1][1]=' ';gameboard[1][2]=' ';
	gameboard[2][0]=' ';gameboard[2][1]=' ';gameboard[2][2]=' ';
	pc1=0;pc2=0;angle=0;pcfirst=0;youfirst=0;
	count=0;
		button1.setText("");button1.setEnabled(true);
		button2.setText("");button2.setEnabled(true);
		button3.setText("");button3.setEnabled(true);
		button4.setText("");button4.setEnabled(true);
		button5.setText("");button5.setEnabled(true);
		button6.setText("");button6.setEnabled(true);
		button7.setText("");button7.setEnabled(true);
		button8.setText("");button8.setEnabled(true);
		button9.setText("");button9.setEnabled(true);
		button14.setText("");
		button15.setText("");
	}
	else if (!checkwin() && !allfill(gameboard))
	{if (count==0 && a.getSource()==button11)
	{pcfirst=1;
	count+=1;
	}
	else if (count==0 && a.getSource()==button12)
	{
		youfirst=1;
		count+=1;
	}
	else if (count%2==0 && pcfirst==1 || count%2==1 && youfirst==1)
	{if (a.getSource()==button1)
	{
		gameboard[0][0]='O';button1.setText("O"); button1.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button2)
	{
		gameboard[0][1]='O';button2.setText("O"); button2.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button3)
	{
		gameboard[0][2]='O';button3.setText("O"); button3.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button4)
	{
		gameboard[1][0]='O';button4.setText("O"); button4.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button5)
	{
		gameboard[1][1]='O';button5.setText("O"); button5.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button6)
	{
		gameboard[1][2]='O';button6.setText("O"); button6.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button7)
	{
		gameboard[2][0]='O';button7.setText("O"); button7.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button8)
	{
		gameboard[2][1]='O';button8.setText("O"); button8.setEnabled(false);
		count+=1;
	}
	else if (a.getSource()==button9)
	{
		gameboard[2][2]='O';button9.setText("O"); button9.setEnabled(false);
		count+=1;
	}
		
	}
	else if (a.getSource()==button10 && (count%2==1 && pcfirst==1|| count%2==0 && youfirst==1))
			
		{if (pcfirst==1)
		pcf(gameboard);
		else
			pcs(gameboard);
		count+=1;
		}}
	else 
	{if (checkwin())
		button14.setText("PC WIN");
	else
		button15.setText("Draw");
		
	}
	
}
public boolean checkwin()
{if (gameboard[0][0]+gameboard[0][1]+gameboard[0][2]==264 ||
		gameboard[1][0]+gameboard[1][1]+gameboard[1][2]==264 ||
		gameboard[2][0]+gameboard[2][1]+gameboard[2][2]==264 ||
	gameboard[0][0]+gameboard[1][0]+gameboard[2][0]==264 ||
			gameboard[0][1]+gameboard[1][1]+gameboard[2][1]==264 ||
					gameboard[0][2]+gameboard[1][2]+gameboard[2][2]==264 ||
	gameboard[0][0]+gameboard[1][1]+gameboard[2][2]==264 ||
			gameboard[0][2]+gameboard[1][1]+gameboard[2][0]==264
	)
	return true;
	
else
	return false;
}
public void board()
{
window.setSize(300,300);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setLayout(new GridLayout(5,3));
window.add(button1);
window.add(button2);
window.add(button3);
window.add(button4);
window.add(button5);
window.add(button6);
window.add(button7);
window.add(button8);
window.add(button9);
window.add(button10);
window.add(button11);
window.add(button12);
window.add(button13);
window.add(button14);
window.add(button15);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);
button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
button8.addActionListener(this);
button9.addActionListener(this);
button10.addActionListener(this);
button11.addActionListener(this);
button12.addActionListener(this);
button13.addActionListener(this);
window.setVisible(true);
}
public  boolean allfill(char a[][])
{
	for(int i=0;i<a.length;i++)
	for(int j=0;j<a[i].length;j++)
		if (a[i][j]==' ') return false;
return true;
}

	

public int searchchance(char gameboard[][])
{int flag=1;
	if (gameboard[0][0]+gameboard[0][1]+gameboard[0][2]==208)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);
	}
	else if (gameboard[0][1]==' ') {gameboard[0][1]='X'; button2.setText("X");
	button2.setEnabled(false);}
	else if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	}
	else if (gameboard[1][0]+gameboard[1][1]+gameboard[1][2]==208)
	{if (gameboard[1][0]==' ') {gameboard[1][0]='X'; button4.setText("X");
	button4.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[1][2]==' ') {gameboard[1][2]='X';  button6.setText("X");
	button6.setEnabled(false);}
		
	}
	else if (gameboard[2][0]+gameboard[2][1]+gameboard[2][2]==208)
	{if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}
	else if (gameboard[2][1]==' ') {gameboard[2][1]='X'; button8.setText("X");
	button8.setEnabled(false);}
	else if (gameboard[2][2]==' ') {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][0]+gameboard[1][0]+gameboard[2][0]==208)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);}
	else if (gameboard[1][0]==' ') {gameboard[1][0]='X'; button4.setText("X");
	button4.setEnabled(false);}
	else if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}}
	else if (gameboard[0][1]+gameboard[1][1]+gameboard[2][1]==208)
	{if (gameboard[0][1]==' ') {gameboard[0][1]='X'; button2.setText("X");
	button2.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[2][1]==' ') {gameboard[2][1]='X'; button8.setText("X");
	button8.setEnabled(false);}}
	else if (gameboard[0][2]+gameboard[1][2]+gameboard[2][2]==208)
	{if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	else if (gameboard[1][2]==' ') {gameboard[1][2]='X'; button6.setText("X");
	button6.setEnabled(false);}
	else if (gameboard[2][2]==' ') { gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][0]+gameboard[1][1]+gameboard[2][2]==208)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[2][2]==' ') {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][2]+gameboard[1][1]+gameboard[2][0]==208)
	{if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}}
	else
		flag=0;
	return flag;
	
}
public void pc11(char a[][],int c,int angle)
{
if (c==3)
{if (angle==0)
	{a[0][1]='X';
	button2.setText("X");
	button2.setEnabled(false);
	}
if (angle==90) {a[1][2]='X';
button6.setText("X");
button6.setEnabled(false);
}
if (angle==180) {a[2][1]='X';
button8.setText("X");
button8.setEnabled(false);
}
if (angle==270) {a[1][0]='X';
button4.setText("X");
button4.setEnabled(false);
}

}
if (c==5)
{if (angle==0)
	{a[1][0]='X';button4.setText("X");
	button4.setEnabled(false);
	}
if (angle==90)
	{a[0][1]='X';button2.setText("X");
	button2.setEnabled(false);
	}
if (angle==180)
	{a[1][2]='X';
	button6.setText("X");
	button6.setEnabled(false);
	}
	
if (angle==270)
	{a[2][1]='X';button8.setText("X");
	button8.setEnabled(false);
	}
}
if (c==7)
{if (angle==0)
	{a[0][2]='X';button3.setText("X");
	button3.setEnabled(false);
	}
if (angle==90)
	{a[2][2]='X';button9.setText("X");
	button9.setEnabled(false);
	}
if (angle==180)
	{a[2][0]='X';button7.setText("X");
	button7.setEnabled(false);
	}
if (angle==270)
	{a[0][0]='X';button1.setText("X");
	button1.setEnabled(false);
	}

}
if (c==9)
{if (angle==0)
	{a[2][2]='X';button9.setText("X");
	button9.setEnabled(false);
	}
if (angle==90)
	{a[2][0]='X';button7.setText("X");
	button7.setEnabled(false);
	}
if (angle==180)
	{a[0][0]='X';button1.setText("X");
	button1.setEnabled(false);
	}
if (angle==270)
	{a[0][2]='X';button3.setText("X");
	button3.setEnabled(false);
	}
}
}
public void pc12(char a[][],int c,int angle)
{
if (c==3) 
{if (angle==0)
{a[1][0]='X';button4.setText("X");
button4.setEnabled(false);
}
if (angle==90)
{a[0][1]='X';button2.setText("X");
button2.setEnabled(false);
}
if (angle==180)
{a[1][2]='X';
button6.setText("X");
button6.setEnabled(false);
}

if (angle==270)
{a[2][1]='X';button8.setText("X");
button8.setEnabled(false);
}
}
if (c==5) 
{if (angle==0)
{a[2][0]='X';button7.setText("X");
button7.setEnabled(false);
}
if (angle==90)
{a[0][0]='X';button1.setText("X");
button1.setEnabled(false);
}
if (angle==180)
{a[0][2]='X';button3.setText("X");
button3.setEnabled(false);
}
if (angle==270)
{a[2][2]='X';button9.setText("X");
button9.setEnabled(false);
}
}
if (c==7) {
	if (angle==0)
	{if (a[0][2]==' '){a[0][2]='X';button3.setText("X");
	button3.setEnabled(false);
	}
	else if (a[0][0]==' ') {a[0][0]='X';button1.setText("X");
	button1.setEnabled(false);
	}
	}
	if (angle==90)
	{if (a[2][2]==' ') {a[2][2]='X';button9.setText("X");
	button9.setEnabled(false);
	}
	else if (a[0][2]==' ') {a[0][2]='X';button3.setText("X");
	button3.setEnabled(false);
	}
	}
	if (angle==180)
	{if (a[2][0]==' ') {a[2][0]='X';button7.setText("X");
	button7.setEnabled(false);
	}
	else if (a[2][2]==' ') {a[2][2]='X';button9.setText("X");
	button9.setEnabled(false);
	}
	}
	if (angle==270)
	{if (a[0][0]==' ') {a[0][0]='X';button1.setText("X");
	button1.setEnabled(false);
	}
	else if (a[2][0]==' ')  {a[2][0]='X';button7.setText("X");
	button7.setEnabled(false);
	}
	}
	
}
}
public void pcf(char gameboard[][])
{
	if (count==1)
	{gameboard[1][1]='X';
	button5.setText("X");
	button5.setEnabled(false);
	}

else if (count==3)
	{
	if (gameboard[0][1]=='O') {pc12(gameboard,count,0); pc2=1; angle=0;}
	else if (gameboard[1][2]=='O') {pc12(gameboard,count,90);pc2=1; angle=90;}
	else if (gameboard[2][1]=='O') {pc12(gameboard,count,180);pc2=1; angle=180;}
	else if (gameboard[1][0]=='O') {pc12(gameboard,count,270);pc2=1; angle=270;}
	else if (gameboard[0][0]=='O') {pc11(gameboard,count,0);pc1=1; angle=0;}
	else if (gameboard[0][2]=='O') {pc11(gameboard,count,90);pc1=1; angle=90;}
	else if (gameboard[2][2]=='O') {pc11(gameboard,count,180);pc1=1; angle=180;}
	else if (gameboard[2][0]=='O') {pc11(gameboard,count,270);pc1=1; angle=270;}
	}
	
else if (count%2==1)
	{if (searchchance(gameboard)==0)
	if (pc1==1) pc11(gameboard,count,angle);
	else if (pc2==1) pc12(gameboard,count,angle);
	
	}
}
public void check(char gameboard[][])
{
	if (gameboard[0][0]+gameboard[0][1]+gameboard[0][2]==190)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);
	}
	else if (gameboard[0][1]==' ') {gameboard[0][1]='X'; button2.setText("X");
	button2.setEnabled(false);}
	else if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	}
	else if (gameboard[1][0]+gameboard[1][1]+gameboard[1][2]==190)
	{if (gameboard[1][0]==' ') {gameboard[1][0]='X'; button4.setText("X");
	button4.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[1][2]==' ') {gameboard[1][2]='X';  button6.setText("X");
	button6.setEnabled(false);}
		
	}
	else if (gameboard[2][0]+gameboard[2][1]+gameboard[2][2]==190)
	{if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}
	else if (gameboard[2][1]==' ') {gameboard[2][1]='X'; button8.setText("X");
	button8.setEnabled(false);}
	else if (gameboard[2][2]==' ') {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}
	}
	else if (gameboard[0][0]+gameboard[1][0]+gameboard[2][0]==190)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);}
	else if (gameboard[1][0]==' ') {gameboard[1][0]='X'; button4.setText("X");
	button4.setEnabled(false);}
	else if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}
	}
	else if (gameboard[0][1]+gameboard[1][1]+gameboard[2][1]==190)
	{if (gameboard[0][1]==' ') {gameboard[0][1]='X'; button2.setText("X");
	button2.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[2][1]==' ') {gameboard[2][1]='X'; button8.setText("X");
	button8.setEnabled(false);}}
	else if (gameboard[0][2]+gameboard[1][2]+gameboard[2][2]==190)
	{if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	else if (gameboard[1][2]==' ') {gameboard[1][2]='X'; button6.setText("X");
	button6.setEnabled(false);}
	else if (gameboard[2][2]==' ') { gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][0]+gameboard[1][1]+gameboard[2][2]==190)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[2][2]==' ') {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][2]+gameboard[1][1]+gameboard[2][0]==190)
	{if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	else if (gameboard[1][1]==' ') {gameboard[1][1]='X'; button5.setText("X");
	button5.setEnabled(false);}
	else if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}}
	else if (gameboard[0][1]=='O' && gameboard[1][0]=='O' && gameboard[0][0]==' ' && count==4)
	{gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);
	}
	else if (gameboard[0][1]=='O' && gameboard[1][2]=='O' && gameboard[0][2]==' ' && count==4)
	{gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);
	}
	else if (gameboard[1][2]=='O' && gameboard[2][1]=='O' && gameboard[2][2]==' ' && count==4)
	{gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);
	}
	else if (gameboard[1][0]=='O' && gameboard[2][1]=='O' && gameboard[2][0]==' ' && count==4)
	{gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);
	}
	
	else if (gameboard[0][0]+gameboard[0][1]+gameboard[0][2]==' '*3)
	{gameboard[0][1]='X'; button2.setText("X");
	button2.setEnabled(false);
	}
	
	else if (gameboard[2][0]+gameboard[2][1]+gameboard[2][2]==' '*3)
	{ gameboard[2][1]='X'; button8.setText("X");
	button8.setEnabled(false);
	}
	else if (gameboard[0][0]+gameboard[1][0]+gameboard[2][0]==' '*3)
	{gameboard[1][0]='X'; button4.setText("X");
	button4.setEnabled(false);
	}
	else if (gameboard[0][2]+gameboard[1][2]+gameboard[2][2]==' '*3)
	{gameboard[1][2]='X'; button6.setText("X");
	button6.setEnabled(false);}
	else if (gameboard[2][0]+gameboard[2][1]+gameboard[2][2]==152)
	{if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}

	else if (gameboard[2][2]==' ') {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][0]+gameboard[1][0]+gameboard[2][0]==152)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);}
	else if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}}
	else if (gameboard[0][1]+gameboard[1][1]+gameboard[2][1]==152)
	{if (gameboard[0][1]==' ') {gameboard[0][1]='X'; button2.setText("X");
	button2.setEnabled(false);}
	else if (gameboard[2][1]==' ') {gameboard[2][1]='X'; button8.setText("X");
	button8.setEnabled(false);}}
	else if (gameboard[0][2]+gameboard[1][2]+gameboard[2][2]==152)
	{if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	else if (gameboard[2][2]==' ')  {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][0]+gameboard[1][1]+gameboard[2][2]==152)
	{if (gameboard[0][0]==' ') {gameboard[0][0]='X'; button1.setText("X");
	button1.setEnabled(false);}
	else if (gameboard[2][2]==' ') {gameboard[2][2]='X'; button9.setText("X");
	button9.setEnabled(false);}}
	else if (gameboard[0][2]+gameboard[1][1]+gameboard[2][0]==152)
	{if (gameboard[0][2]==' ') {gameboard[0][2]='X'; button3.setText("X");
	button3.setEnabled(false);}
	else if (gameboard[2][0]==' ') {gameboard[2][0]='X'; button7.setText("X");
	button7.setEnabled(false);}}
else
{
	for(int i=0;i<3;i++)
	for(int j=0;j<3;j++)
	{if (gameboard[i][j]==' ')
		{gameboard[i][j]='X';
	if (i==0 && j==0) {button1.setText("X"); button1.setEnabled(false);}
	if (i==0 && j==1) {button2.setText("X");button2.setEnabled(false);}
	if (i==0 && j==2) {button3.setText("X");button3.setEnabled(false);}
	if (i==1 && j==0) {button4.setText("X");button4.setEnabled(false);}
	if (i==1 && j==1) {button5.setText("X");button5.setEnabled(false);}
	if (i==1 && j==2) {button6.setText("X");button6.setEnabled(false);}
	if (i==2 && j==0) {button7.setText("X");button7.setEnabled(false);}
	if (i==2 && j==1) {button8.setText("X");button8.setEnabled(false);}
	if (i==2 && j==2) {button9.setText("X");button9.setEnabled(false);}
	return;
		}
		
	}
}
}
public  void pcs(char gameboard[][])
{

if (count==2)
{if (gameboard[1][1]=='O')
	{gameboard[0][0]='X';
	button1.setText("X"); button1.setEnabled(false);
	}
else {gameboard[1][1]='X';
button5.setText("X"); button5.setEnabled(false);
}
}

else if (count%2==0)
{if (searchchance(gameboard)==0)
	check(gameboard);
	
}
}

public static void main(String args[])
{
tictactoe t=new tictactoe();
t.board();
}
	
}





