import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelReader {

    static FileInputStream fis;

    public FileInputStream getFileInputStream(String path){
        String filePath = System.getProperty("user.dir")+"/"+path;
        File srcFile = new File(filePath);
        try {
            fis = new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR occurred"+e.getMessage());
        }
        return fis;
    }

    public Object [][]  getExcelData(int sheetNum,int cols, String path) throws IOException {
        fis = getFileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(sheetNum);
        int numberOfRows = (sheet.getLastRowNum()+1);
        int numberOfColumns = cols;


        String[][] arrayExcelData = new String[numberOfRows][numberOfColumns];

        for(int i =0;i<numberOfRows;i++){
            for (int j=0; j<numberOfColumns;j++){
                XSSFRow row = sheet.getRow(i);
                arrayExcelData[i][j] = row.getCell(j).toString();
            }
        }
        wb.close();
        return arrayExcelData;
    }

}
