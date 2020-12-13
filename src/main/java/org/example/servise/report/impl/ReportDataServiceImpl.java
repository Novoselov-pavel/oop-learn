package org.example.servise.report.impl;

import org.example.object.reportdata.*;
import org.example.servise.report.Paragraph1Service;
import org.example.servise.report.ReportDataService;
import org.example.servise.report.impl.Paragraph1ServiceImpl;

public class ReportDataServiceImpl implements ReportDataService {
    Paragraph1Service service = new Paragraph1ServiceImpl();

    @Override
    public ReportData getReportData(String archiveName) {
        Paragraph1 paragraph1 = service.getParagraph1();
        /// аналогично получаем все остальные части отчета, тут пропущено
        Paragraph2 paragraph2 = new Paragraph2();
        Table1 table1 = new Table1();
        Table2 table2 = new Table2();
        return new ReportData(archiveName, paragraph1,paragraph2,table1,table2);
    }
}
