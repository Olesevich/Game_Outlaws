import javax.swing.*;
import java.awt.*;

public class CreatPanel {

    protected void createPanel(JFrame jf, JPanel pan, int x, int y, int w, int h, Color color){
        jf.add(pan);
        pan.setLayout(null);
        pan.setBounds(x, y, w, h);
        pan.setBackground(color);
        pan.setVisible(true);
    }
}
