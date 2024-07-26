import javax.swing.*;

public class CreateWindow {

    private static JFrame jf;
    private final int WIDTH_PANEL_IMG_PLAY = 200;//размеры(ширина) панели где будет размещена картинка
    private final int HEIGH_PANEL_IMG_PLAY = 300;//размеры(высота) панели где будет размещена картинка и игровое поле
    private final int WIDTH_PANEL_PlAY;//ширина панели где будет размещена игровое поле
    private  final int WIDHT_HEIGH_LABEN = 30; //размеры квадратов куда помещены буквы угадываемого слова

    public CreateWindow() {
        WIDTH_PANEL_PlAY = widthPanelPlay();
        creatWindow();
        whitePanels();
    }

    private void creatWindow(){
        jf = new JFrame("Висилиница (игра головоломка)");
        jf.setSize(WIDTH_PANEL_IMG_PLAY + WIDTH_PANEL_PlAY + 14, HEIGH_PANEL_IMG_PLAY + 37);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(true);
        jf.setVisible(true);
    }

    private void whitePanels(){
        new Panel_Img(jf, WIDTH_PANEL_IMG_PLAY, HEIGH_PANEL_IMG_PLAY);//панель рисует картинку
        new PanelPlay(jf, WIDTH_PANEL_IMG_PLAY, HEIGH_PANEL_IMG_PLAY, WIDTH_PANEL_PlAY, WIDHT_HEIGH_LABEN);//панель рисует где загаданы бук
        new PanekKeyboard(jf, WIDTH_PANEL_IMG_PLAY, HEIGH_PANEL_IMG_PLAY, WIDTH_PANEL_PlAY);//панель клавиатуры
    }

    private int widthPanelPlay(){
        return 60 + WIDHT_HEIGH_LABEN * GamePlayers.wordes.length + WIDHT_HEIGH_LABEN * (GamePlayers.wordes.length - 1);//60-это расстояние между краями до букв с двух сторон по 30
    }

    public static void closeWindow(){
        jf.setVisible(false);
    }
}
