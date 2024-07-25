import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DownloadAndSelect{

    private File file = new File("C:/Users/user/IdeaProjects/GallowsGame/Data Basik/BD.xlsx");
    private FileInputStream fl = new FileInputStream(file);
    private XSSFWorkbook work = new XSSFWorkbook(fl);
    private XSSFSheet sheet;
    private String frukt;

    public DownloadAndSelect() throws IOException {
        getSheet(0);
        int random = (int)(Math.random()*sheet.getLastRowNum());
        XSSFCell cell = sheet.getRow(random).getCell(0);//row - ряд, cell- ячейка в ряду, в нашем случае получается ряд рандомнай, ячейка нулевая
        String sagadanFruck = cell.toString();
        frukt = sagadanFruck.toUpperCase();
    }

    private void getSheet (int in){//открывает лист, номер листа вводишь сам
        sheet = work.getSheetAt(in);
    }

    private void setValueInCell(int row, int cell, String str){//записать в определеную ячейку новое значение
        XSSFCell cl = sheet.getRow(row).createCell(cell);
        cl.setCellValue(str);
    }

    private void closeFile() throws IOException {//после записи файл нужно закрыть, закрывает
        fl.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        work.write(fileOutputStream);
        fileOutputStream.close();
    }

    public String getFrukt() {
        return frukt;
    }

    //        System.out.println("row: " + sheet.getLastRowNum());//выводит сколько в ряду занято ячеек
//        System.out.println("cell:" + sheet.getRow(0).getLastCellNum());//выводит сколько занято рядов
}