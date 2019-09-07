import java.awt.*;
import java.io.PrintWriter;
import javax.swing.*;

@SuppressWarnings("serial")
public class ShowPNG extends JFrame {

	public ShowPNG(String[] argx) {
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("ShowPNG");
		JPanel panel = new JPanel();

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		panel.setBackground(Color.CYAN);
		
		ImageIcon[] icon = new ImageIcon[argx.length];
		JLabel[] label = new JLabel[argx.length];

		for (int i=0; i < argx.length; i++) {
			icon[i] = new ImageIcon(argx[i]);
			label[i] = new JLabel(icon[i]);
			panel.add(label[i]);
		}
		Dimension mysize = panel.getPreferredSize();
		this.setSize(new Dimension(mysize.width+10,mysize.height+40));
	
		this.getContentPane().add(panel);
	}

	public static void main(String[] args) throws Exception {
		if (args.length <= 1) {
			return;
		}
		long pid = ProcessHandle.current().pid();
		PrintWriter writer = new PrintWriter(args[0]+"/pid.txt", "UTF-8");
		writer.println(pid);
		writer.close();
		String[] pngs = new String[args.length-1];
		for (int i=1; i<args.length; i++) {
			pngs[i-1] = args[0]+"/"+args[i];
		}
		new ShowPNG(pngs).setVisible(true);
	}

}
