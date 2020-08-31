package common;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelLib 
{
	public static Sheet wrkSheetObj;
    public static Workbook wrkBookObj =null;
    
    /**
     * 
     * @param inputDataFilePath
     * @param SheetName
     * @return
     * @throws Exception
     */
    public static  Sheet getSheetObject(String inputDataFilePath, String SheetName) throws Exception
	{
		FileInputStream file = new FileInputStream(new File(inputDataFilePath));
		Workbook wrkBookObj = new HSSFWorkbook(file);
		Sheet wrkSheetObj= wrkBookObj.getSheet(SheetName);		
		return wrkSheetObj;
	}
    
    /**
     * 
     * @param sSheet
     * @param sColumnName
     * @param iRowCount
     * @return
     * @throws Exception
     */
    public static String getSheetCellData(String sColumnName, int iRowCount) throws Exception
	{
    	/*String cellData=null;
		int SheetColCount=wrkSheetObj.getlas
		for(int Colcnt=0;Colcnt<SheetColCount;Colcnt++)
		{
			if((Actiondriver.objInputSheet.getCell(Colcnt,0).getContents()).equals(sColumnName))
			{
				cellData=Actiondriver.objInputSheet.getCell(Colcnt, iRowCount).getContents();
				return cellData;
			}			
		}	*/			
		return null;
	}

}
