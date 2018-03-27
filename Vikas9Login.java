import java.awt.*;
 class Vikas9Login extends Frame
{
	TextField t1,t2;
	Button b1,b2;
	Label l1,l2;
	public static void main(String a[])
	{
		Vikas9Login b=new Vikas9Login();
	}
public Vikas9Login()
{
	super("awt window with buttons");
	
	setLayout(new FlowLayout());
	t1=new TextField(20);
	t2=new TextField(20);
	b1=new Button("login");
	l1=new Label("username");
	l2=new Label("password");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
setSize(270,150);
setVisible(true);
}
}
