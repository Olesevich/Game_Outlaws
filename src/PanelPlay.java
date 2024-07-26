import javax.swing.*;
import java.awt.*;

public class PanelPlay extends JPanel {

    CreatPanel creatPanel = new CreatPanel();
    private static JLabel [] labels;

    public PanelPlay(JFrame jf, int widthPanelImg, int heighPanelImgAndPlay, int widthPanelPlay, int widhtHeighLaben) {
        creatPanel.createPanel(jf, this,widthPanelImg,0,widthPanelPlay,heighPanelImgAndPlay/2, ColorsUsed.colorPanelPlay);
        createLab(widhtHeighLaben);
        creatTextCondition(widthPanelPlay);
    }

    private void createLab(int widhtHeighLaben){
        labels = new JLabel[GamePlayers.wordes.length];
        for (int i = 0, j = 0; i < GamePlayers.wordes.length; i++, j+= (2 * widhtHeighLaben)) {
            labels[i] = new CreateLaben(this, widhtHeighLaben,j);
        }
    }

    public static void setLabels(int i,String str) {
        labels[i].setText(str);
    }

    private void creatTextCondition(int widthPanelPlay){
        JLabel jLabel = new JLabel("Угадайте фрукт, который загадан!");
        add(jLabel);
        jLabel.setBounds( (widthPanelPlay-200)/2,0,200,80);
    }
}
