package org.example.object.reportdata;

import org.example.object.reportdata.Paragraph1;
import org.example.object.reportdata.Paragraph2;
import org.example.object.reportdata.Table1;
import org.example.object.reportdata.Table2;

public class ReportData {
    private final String archiveName;

    private final Paragraph1 paragraph1;
    private final Paragraph2 paragraph2;
    private final Table1 table1;
    private final Table2 table2;

    public ReportData(String archiveName, Paragraph1 paragraph1, Paragraph2 paragraph2, Table1 table1, Table2 table2) {
        this.archiveName = archiveName;
        this.paragraph1 = paragraph1;
        this.paragraph2 = paragraph2;
        this.table1 = table1;
        this.table2 = table2;
    }

    public Paragraph1 getParagraph1() {
        return paragraph1;
    }

    public Paragraph2 getParagraph2() {
        return paragraph2;
    }

    public Table1 getTable1() {
        return table1;
    }

    public Table2 getTable2() {
        return table2;
    }
}
