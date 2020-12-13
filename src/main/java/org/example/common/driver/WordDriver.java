package org.example.common.driver;

import org.example.object.FileLink;
import org.example.object.reportdata.ReportData;

import java.io.IOException;

public interface WordDriver {

    /**
     * Записывает отчет и выдает ссылку
     * @param reportData отчет
     * @return ссылка
     */
    FileLink writeReport(ReportData reportData) throws IOException;
}
