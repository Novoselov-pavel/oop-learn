package org.example.servise;

import org.example.servise.report.ReportService;
import org.example.servise.report.impl.ReportServiceImpl;

public class PrimaryServiceImpl {
    /**
     * В spring привязка осуществляется с помощью dependency Injection
     */
    private ReportService service = new ReportServiceImpl();


    /**
     * Сюда собственно происходит привязка контроллра
     * @param archiveName пераметр запроса
     * @return ссылка на файл
     */
    public String getReportLink(String archiveName){
        return service.getReport(archiveName).getRef();
    }

}
