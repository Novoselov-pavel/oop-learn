package org.example.common.driver.impl;

import org.example.common.driver.WordDriver;
import org.example.object.FileLink;
import org.example.object.reportdata.ReportData;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class WordDriverImpl implements WordDriver {
    @Override
    public FileLink writeReport(ReportData reportData) throws IOException {
        // чистая симуляция, тут по идее объект, в который мы можем писать, XWPFDocument например
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        ///Блок сохраннения частей отчета в объект
        writeParagraph1(reportData,stream);
        writeParagraph2(reportData,stream);
        writeTable1(reportData,stream);
        writeTable2(reportData,stream);
        ///Блок сохраннения собственно объекта
        stream.write(null);
        return null;
    }

    private void writeParagraph1(ReportData reportData, ByteArrayOutputStream stream) {

    }
    private void writeParagraph2(ReportData reportData, ByteArrayOutputStream stream) {

    }

    private void writeTable1(ReportData reportData, ByteArrayOutputStream stream) {

    }

    private void writeTable2(ReportData reportData, ByteArrayOutputStream stream) {

    }


}
