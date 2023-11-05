import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class smile extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.black);
        g.fillOval(155, 175, 10, 20);
        g.fillOval(230, 175, 10, 20);
        g.drawArc(150, 220, 100, 50, 180, 180);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("SmileyApplet Frame");

        smile applet = new smile();

        frame.add(applet);
        applet.init();

        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
