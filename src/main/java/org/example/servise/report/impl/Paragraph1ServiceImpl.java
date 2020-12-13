package org.example.servise.report.impl;

import org.example.object.reportdata.Paragraph1;
import org.example.object.reportdata.Paragraph1DataPart1;
import org.example.object.reportdata.Paragraph1DataPart2;
import org.example.repository.Paragraph1DataRepository;
import org.example.repository.impl.Paragraph1DataRepositoryImpl;
import org.example.repository.Paragraph2DataRepository;
import org.example.repository.impl.Paragraph2DataRepositoryImpl;
import org.example.servise.report.Paragraph1Service;

public class Paragraph1ServiceImpl implements Paragraph1Service {

    Paragraph1DataRepository repositoryData1 = new Paragraph1DataRepositoryImpl();
    Paragraph2DataRepository repositoryData2 = new Paragraph2DataRepositoryImpl();


    @Override
    public Paragraph1 getParagraph1() {
        Paragraph1DataPart1 dataPart1= repositoryData1.getParagraph1DataPart1();
        Paragraph1DataPart2 dataPart2 = repositoryData2.getParagraph1DataPart2();
        //тут мы что-то делаем с данными и создаем на их основе Paragraph1
        return new Paragraph1();
    }
}
