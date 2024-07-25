import javax.crypto.spec.PSource;
import javax.swing.*;
import java.awt.*;

public class Panel_Img extends JPanel {

    CreatPanel creatPanel = new CreatPanel();

    public Panel_Img(JFrame jf, int widthPanelImg, int heighPanelImgAndPlay) {
        creatPanel.createPanel(jf, this,0,0,widthPanelImg,heighPanelImgAndPlay, new Color(20, 240,230));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (GamePlayers.live < 10){
            g.drawLine(20,280,180,280);
        }
        if (GamePlayers.live < 9){
            g.drawLine(60,280,60,20);
        }
        if (GamePlayers.live < 8){
            g.drawLine(60,20,140,20);
        }
        if (GamePlayers.live < 7){
            g.drawLine(140,20,140,50);
        }
        if (GamePlayers.live < 6){
            g.drawOval(120,50,40,40);
        }
        if (GamePlayers.live < 5){
            g.drawOval(120,90,40,70);
        }
        if (GamePlayers.live < 4){
            g.drawLine(124,105,84,130);
        }
        if (GamePlayers.live < 3){
            g.drawLine(156,105,196,130);
        }
        if (GamePlayers.live < 2){
            g.drawLine(130,155,115,210);
        }
        if (GamePlayers.live < 1){
            g.drawLine(148,155,160,210);
        }
        repaint();
    }

}

