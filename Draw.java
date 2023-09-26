import java.awt.*;
import javax.swing.*;
public class Draw extends JFrame {

    Draw(String title) {
            super(title);
            setLayout(null);
            setSize(530,330);
            setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public void paint(Graphics my_picture){
            my_picture.setColor(Color.BLACK);
            my_picture.fillRect(0, 0, 530, 330);
            my_picture.setColor(Color.WHITE);
            my_picture.drawRect(50, 150, 150, 150);
            my_picture.drawRect(75, 200, 50,  50);
            my_picture.drawLine(25, 175, 125, 75);
            my_picture.drawLine(225, 175, 125, 75);
            my_picture.drawLine(150, 100, 150, 75);
            my_picture.drawLine(150, 75, 175, 75);
            my_picture.drawLine(175, 75, 175, 125);
            my_picture.drawLine(337, 248, 337, 300);
            my_picture.drawLine(363, 248, 363, 300);
            my_picture.drawArc(275, 50, 150, 200, 280, 340);
        }
        public static void main(String[] args) {
            new Draw("Graphics");
        }
    }
