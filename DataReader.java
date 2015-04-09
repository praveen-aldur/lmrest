package lmRestApi;

  import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;

  import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.poifs.filesystem.*;

  public class DataReader{
   
  public static int RowSize,ColumSize;
  public  String[][]ReadEXCEL(int sheetNum) throws IOException{
   String fileName = "ReferenceFiles\\DataSheet.xls";
   FileInputStream myInput = new FileInputStream(fileName);
   POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
   HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
   HSSFSheet mySheet = myWorkBook.getSheetAt(sheetNum);
   
   RowSize= (mySheet.getLastRowNum());
   HSSFRow myRow = mySheet.getRow(0);
   ColumSize=(myRow.getLastCellNum());
   String ExcelData[][]=new String[RowSize][ColumSize];
   
   try{
    
    for(int i=1;i<=RowSize;i++){
     myRow= mySheet.getRow(i);
     for(int j=0;j<ColumSize;j++){
      HSSFCell C2 = myRow.getCell(j);
       if(C2 !=null)
        ExcelData[i-1][j]=C2.toString();
       else
        ExcelData[i-1][j]=""; 
       }
      }
    
    }catch(NullPointerException e){
     e.printStackTrace();
    }
    
    
   myInput.close();
   return ExcelData;
  }

  }
