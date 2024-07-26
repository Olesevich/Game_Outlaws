import javax.swing.*;
import java.awt.*;

public class CreateLaben extends JLabel {

    public CreateLaben(JPanel panel, int w_h_room, int j) {
        creatLab(panel,w_h_room,j);
    }

    private void creatLab(JPanel panel, int w_h_room, int j){
        panel.add(this);
        setBounds(30 + j, 80, w_h_room,w_h_room);
        setOpaque(true);
        setBackground(ColorsUsed.colorLabel);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setFont(new Font("Times New Roman", Font.PLAIN, 20));
        setText("-");
        setVisible(true);
    }
}
