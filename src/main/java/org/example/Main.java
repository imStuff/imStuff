package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPatternContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello world!");

        //metavliti gia na ypologisw poses selides xreiazomai
        int hmerominies = 912;


        //this is used to calculate how many paged need to be created and affects how content will be split
        int pageLimit = 36;


        int pageNumberInt = hmerominies/pageLimit;
        int arithmosSelidwn = 0;
        if (pageNumberInt%pageLimit == 0) {
            arithmosSelidwn = (hmerominies/pageLimit);
        } else {
            arithmosSelidwn = (hmerominies/pageLimit)+1;
        }



        PDDocument egrafo = new PDDocument();
        PDPage xarti = new PDPage();
        egrafo.addPage(xarti);

        //logo addition
        //PDImageXObject logotipo = new PDImageXObject(egrafo);
        //logotipo.createFromFile("C:\\Users\\ath\\IdeaProjects\\invoince alogrithm\\src\\main\\resources\\logo\\hotelino2.png", egrafo);



        int pageHeight = (int) xarti.getTrimBox().getHeight();
        int pageWidth = (int) xarti.getTrimBox().getWidth();



        //single line addition

        //first page
        PDPage selida = egrafo.getPage(0);

        //initialisation of content stream
        PDPageContentStream cs = new PDPageContentStream(egrafo, selida);





        //header
        cs.beginText();
        cs.setFont(PDType1Font.HELVETICA_BOLD, 40);
        cs.setNonStrokingColor(81,0, 252);
        cs.newLineAtOffset(75, 700);
        cs.showText("HOTELINO");
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 28);
        cs.setNonStrokingColor(0,0, 0);
        cs.newLineAtOffset(100, 675);
        cs.showText("Earnings");
        cs.endText();

        java.util.Date date = new java.util.Date();
        System.out.println(date);
        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(400, 675);
        cs.showText("" + date);
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 18);
        cs.newLineAtOffset(100, 628);
        cs.showText("Date");
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 18);
        cs.newLineAtOffset(250, 628);
        cs.showText("Earnings");
        cs.endText();




        //table part of code
        cs.setStrokingColor(Color.WHITE);
        cs.setLineWidth(1);

        int initX = 100;
        int initY = pageHeight-180;

        int cellHeight = 16;
        int cellWidth = 150;

        int colCount = 2;
        int rowCount = 36;







        for(int i=1; i<=rowCount; i++) {
            for(int j=1; j<=colCount; j++) {
                cs.addRect(initX, initY, cellWidth, -cellHeight);






            }

            cs.beginText();
            cs.newLineAtOffset(initX+2, initY-cellHeight+2);
            cs.setFont(PDType1Font.TIMES_ROMAN, 12);
            cs.showText("12-06-2004");
            cs.endText();


            cs.beginText();
            cs.newLineAtOffset(initX+2+cellWidth, initY-cellHeight+2);
            cs.setFont(PDType1Font.TIMES_ROMAN, 12);
            cs.showText("12-06-2005");
            cs.endText();

            initX = 100;
            initY -= cellHeight;
        }


        cs.stroke();


        cs.close();

        System.out.println(arithmosSelidwn);
        int counter = 0;
        for (int k = 1; k<=(arithmosSelidwn-1); k++) {
            PDPage xarti2 = new PDPage();
            egrafo.addPage(xarti2);
            PDPage selida2 = egrafo.getPage(k);

            int pageHeight2 = (int) xarti2.getTrimBox().getHeight();
            int pageWidth2 = (int) xarti2.getTrimBox().getWidth();



            //initialisation of content stream
            PDPageContentStream cs2 = new PDPageContentStream(egrafo, selida2);






            //table part of code
            cs2.setStrokingColor(Color.WHITE);
            cs2.setLineWidth(1);

            int initX2 = 100;
            int initY2 = pageHeight2-180;

            int cellHeight2 = 16;
            int cellWidth2 = 150;

            int colCount2 = 2;
            int rowCount2 = 36;







            for(int i=1; i<=rowCount2; i++) {
                for(int j=1; j<=colCount2; j++) {
                    cs2.addRect(initX2, initY2, cellWidth2, -cellHeight2);





                    System.out.println(counter);

                }


                cs2.beginText();
                cs2.newLineAtOffset(initX2+2, initY2-cellHeight2+2);
                cs2.setFont(PDType1Font.TIMES_ROMAN, 12);
                cs2.showText("" + counter);
                cs2.endText();

                cs2.beginText();
                cs2.newLineAtOffset(initX2+2+cellWidth2, initY2-cellHeight2+2);
                cs2.setFont(PDType1Font.TIMES_ROMAN, 12);
                cs2.showText("yah");
                cs2.endText();


                initX2 = 100;
                initY2 -= cellHeight2;

                counter++;
            }


            cs2.stroke();


            cs2.close();

        }



        PDPage xarti3 = new PDPage();
        egrafo.addPage(xarti3);

        //logo addition
        //PDImageXObject logotipo = new PDImageXObject(egrafo);
        //logotipo.createFromFile("C:\\Users\\ath\\IdeaProjects\\invoince alogrithm\\src\\main\\resources\\logo\\hotelino2.png", egrafo);





        int t = arithmosSelidwn;
        //first page
        PDPage selida3 = egrafo.getPage(t);

        //initialisation of content stream
        PDPageContentStream cs3 = new PDPageContentStream(egrafo, selida3);


        cs3.beginText();
        cs3.setFont(PDType1Font.TIMES_ROMAN, 28);
        cs3.setNonStrokingColor(0,0, 0);
        cs3.newLineAtOffset(100, 675);
        cs3.showText("Earnings");
        cs3.endText();


        cs3.close();


        //apothikeusi egrafou pdf
        egrafo.save("D:/javaProjects/fartyy.pdf");

    }
}