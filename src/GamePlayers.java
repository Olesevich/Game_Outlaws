import javax.swing.*;
import java.io.IOException;

public class GamePlayers {

    private String words;
    private String [] wordis;//массив с заданым словом.
    public static String [] wordes;
    public static int win;
    public static int live;// количество жизней

    public GamePlayers() {
        downloadWrodsEnvisioned();
        wordis = translatiomStringInMassivString();
        setWin();
        getWordis();
        live = 10;
        new CreateWindow();
    }

    private void downloadWrodsEnvisioned(){
        try {
            DownloadAndSelect das = new DownloadAndSelect();
            words = das.getFrukt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String [] translatiomStringInMassivString(){
        return words.split("");
    }

    private String [] getWordis(){
        return wordes = wordis;
    }

    private int setWin(){
        return win = wordis.length;
    }

    public static void proverkaOfWinner(){
        if (win == 0){
            windowWinnerOfTheEnd("Вы угадали", "Поздравляю");
        }
        else if (live == 0){
            windowWinnerOfTheEnd("Вы проиграли", "не расстраивайтесь");
        }
    }

    private static void windowWinnerOfTheEnd(String message, String title){
        int res = JOptionPane.showConfirmDialog(null,message + ", начать заново?",title,JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION){
            CreateWindow.closeWindow();
            new GamePlayers();
        }
        else if (res == JOptionPane.NO_OPTION){
            System.exit(1);
        }
    }
}
