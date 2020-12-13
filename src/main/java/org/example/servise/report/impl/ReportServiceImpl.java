package org.example.servise.report.impl;

import org.example.common.driver.WordDriver;
import org.example.common.driver.impl.WordDriverImpl;
import org.example.object.FileLink;
import org.example.object.reportdata.ReportData;
import org.example.servise.report.ReportDataService;
import org.example.servise.report.ReportService;
import org.example.servise.report.impl.ReportDataServiceImpl;

import java.io.IOException;

public class ReportServiceImpl implements ReportService {

    /**
     * В spring привязка осуществляется с помощью dependency Injection
     */
    private ReportDataService reportDataService = new ReportDataServiceImpl();
    /**
     * В spring привязка осуществляется с помощью dependency Injection
     */
    private WordDriver wordDriver = new WordDriverImpl();

    @Override
    public FileLink getReport(String archiveName) {
        ReportData reportData = reportDataService.getReportData(archiveName);
        try {
            return wordDriver.writeReport(reportData);
        } catch (IOException e) {
            //тут по идее мы бросаем свое не проверяемое исключение, "не удалось записать файл".
            //Логгируем и т.п.
            throw new IllegalStateException(e);
        }
    }
}
