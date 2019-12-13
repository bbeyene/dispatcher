package com.beyene.manifestmaker;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class XSSFRead
{
    private String filename;


    public XSSFRead(String filename)
    {
        this.filename = filename;
    }

    public ArrayList<ArrayList> populate(ArrayList<String> colArray, int sheetStart, int rowStart) throws Exception
    {
        int i;
        int rowNum = 0;
        int keyCount = 0;

        FileInputStream excelInputStream = new FileInputStream(new File(filename));
        Workbook workbook = new XSSFWorkbook(excelInputStream);
        Sheet sheet = workbook.getSheetAt(sheetStart);

        Iterator<Row> rowItr = sheet.iterator();
        Row row = rowItr.next();
        for(i = 1; i < rowStart; ++i)
            row = rowItr.next();

        Iterator<Cell> cellItr = row.iterator();
        Cell cell;


        while (cellItr.hasNext())
        {
            Cell keyCell = row.getCell(keyCount, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            colArray.add(keyCell.toString());
            keyCell = cellItr.next();
            ++keyCount;
        }

        ArrayList<ArrayList> allArray = new ArrayList<ArrayList>(keyCount);

        for(i = 0; i < keyCount; ++i)
        {
            int j;
            rowItr = sheet.iterator();
            for(j = 1; j < rowStart + 1; ++j)
                row = rowItr.next();

            ArrayList<String> tmpList = new ArrayList<String>();
            for(rowNum = 1; rowItr.hasNext(); ++rowNum)
            {
                row = rowItr.next();
                cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                tmpList.add(cell.toString());
            }
            allArray.add(tmpList);
            rowItr = sheet.iterator();
            row = rowItr.next();
        }
        workbook.close();
        excelInputStream.close();

        return allArray;
    }
}
