import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanekKeyboard extends JPanel {

    CreatPanel creatPanel = new CreatPanel();
    private JButton [] button = new JButton[32];
    private String abc = new String("ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ");

    public PanekKeyboard(JFrame jf, int widthPanelImg, int heighPanelImgAndPlay, int widthPanelPlay) {
        creatPanel.createPanel(jf, this,widthPanelImg,heighPanelImgAndPlay/2,widthPanelPlay,
                heighPanelImgAndPlay/2, ColorsUsed.colorKeyboard);
        buttons(widthPanelPlay, heighPanelImgAndPlay/2);
    }

    private void buttons(int widthPanelPlay, int heighPanelImgAndPlay){
        for (int i = 0, x = 4, y = (heighPanelImgAndPlay / 3 - widthPanelPlay / 13) / 2; i < button.length; i++, x +=widthPanelPlay/13 + 2 ) {
            if (i == 12){
                y += (150 / 3 - widthPanelPlay / 13) + widthPanelPlay / 13;
                x = 4 + widthPanelPlay/13/2;
                creatBut(i,x,y,widthPanelPlay);
            }
            else if(i == 23){
                y += (150 / 3 - widthPanelPlay / 13) + widthPanelPlay / 13;
                x = 4 + widthPanelPlay/8;
                creatBut(i,x,y,widthPanelPlay);
            }
            else {
                creatBut(i,x,y,widthPanelPlay);
            }
        }
    }

    private void creatBut(int i, int x, int y, int widthPanelPlay){
        button[i] = new CreateButtons(this, x, y, widthPanelPlay / 13);
        button[i].setText(abc.substring(i, i + 1));
        pushButtons(button[i]);
    }

    private void pushButtons(JButton but){
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                proverkaWords(but);
                GamePlayers.proverkaOfWinner();
            }
        });
    }

    private void proverkaWords(JButton button){
        int a = 0;
        for (int i = 0; i < GamePlayers.wordes.length ; i++) {
            if (button.getText().equals(GamePlayers.wordes[i])){
                pushButton(button, ColorsUsed.colorPushKeyboardRight);
                PanelPlay.setLabels(i,button.getText());
                GamePlayers.win--;
                a++;
            }
        }
        if (a == 0){
            pushButton(button, ColorsUsed.colorPushKeyboardWrong);
            GamePlayers.live--;
        }
    }

    private void pushButton(JButton button, Color color){
        button.setBackground((color));
        button.setEnabled(false);
    }

}
