import javax.swing.*;
import java.awt.*;

public class CreateButtons extends JButton {

    public CreateButtons(JPanel jPanel, int x, int y, int w_h) {
        createBut(jPanel,x,y,w_h);
    }

    private void createBut(JPanel jPanel, int x, int y, int w_h){
        jPanel.add(this);
        setBounds(x, y, w_h, w_h);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setMargin(new Insets(1,1,1,1));
        setFont(new Font("Times New Roman", Font.PLAIN, 10));
        setBackground(Color.pink);
        setFocusPainted(false);
        setVisible(true);
    }
}
