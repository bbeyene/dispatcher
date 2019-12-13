package com.beyene.manifestmaker;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class HSSFRead
{
    private String filename;


    public HSSFRead(String filename)
    {
        this.filename = filename;
    }

    public ArrayList<ArrayList> populate(ArrayList<String> colArray) throws Exception
    {
        int i, c, r, rows, cols;
        int keyCount = 0;
        FileInputStream excelInputStream = new FileInputStream(new File(filename));
        HSSFWorkbook workbook = new HSSFWorkbook(excelInputStream);
        HSSFSheet sheet = workbook.getSheetAt(1);

        rows = sheet.getLastRowNum();
        HSSFRow row = sheet.getRow(2);
        cols = row.getLastCellNum();
        HSSFCell cell;

        for(c = 0; c < cols; ++c)
        {
            cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            colArray.add(cell.toString());
            ++keyCount;
        }

        ArrayList<ArrayList> allArray = new ArrayList<ArrayList>(keyCount);
        for(i = 0; i < keyCount; ++i)
        {
            ArrayList<String> tmpList = new ArrayList<String>();
            for(r = 3; r < rows; ++r)
            {
                row = sheet.getRow(r);
                if(row != null)
                {
                    cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    tmpList.add(cell.toString());
                }
            }
            allArray.add(tmpList);
        }
        workbook.close();
        excelInputStream.close();

        return allArray;
    }
}
