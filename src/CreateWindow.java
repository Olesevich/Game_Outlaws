import javax.swing.*;

public class CreateWindow {

    private static JFrame jf;
    private int widthPanelImg = 200;//размеры(ширина) панели где будет размещена картинка
    private int heighPanelImgAndPlay = 300;//размеры(высота) панели где будет размещена картинка и игровое поле
    private int widthPanelPlay;//ширина панели где будет размещена игровое поле
    private int widhtHeighLaben = 30; //размеры квадратов куда помещены буквы угадываемого слова

    public CreateWindow() {
        widthPanelPlay = widthPanelPlay();
        creatWindow();
        whitePanels();
    }

    private void creatWindow(){
        jf = new JFrame("Висилиница (игра головоломка)");
        jf.setSize(widthPanelImg + widthPanelPlay + 14, heighPanelImgAndPlay + 37);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(true);
        jf.setVisible(true);
    }

    private void whitePanels(){
        new Panel_Img(jf,widthPanelImg,heighPanelImgAndPlay);//панель рисует картинку
        new PanelPlay(jf,widthPanelImg,heighPanelImgAndPlay,widthPanelPlay, widhtHeighLaben);//панель рисует где загаданы бук
        new PanekKeyboard(jf,widthPanelImg,heighPanelImgAndPlay,widthPanelPlay);//панель клавиатуры
    }

    private int widthPanelPlay(){
        return 60 + widhtHeighLaben * GamePlayers.wordes.length + widhtHeighLaben * (GamePlayers.wordes.length - 1);//60-это расстояние между краями до букв с двух сторон по 30
    }

    public static void closeWindow(){
        jf.setVisible(false);
    }
}
