package org.example;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPatternContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("heeey");

        String name = new String("Jon Doe");
        String dateOfArrival = new String("February 4 2002");
        String dateOfDeparture = new String("February 8 2002");
        int days = 7;
        String lengthOfStay = new String(days + "days");
        int total = 1305;




        PDDocument egrafo = new PDDocument();
        PDPage xarti = new PDPage();
        egrafo.addPage(xarti);

        //logo addition
        //PDImageXObject logotipo = new PDImageXObject(egrafo);
        //logotipo.createFromFile("C:\\Users\\ath\\IdeaProjects\\invoince alogrithm\\src\\main\\resources\\logo\\hotelino2.png", egrafo);




        //single line addition

        //first page
        PDPage selida = egrafo.getPage(0);

        //initialisation of content stream
        PDPageContentStream cs = new PDPageContentStream(egrafo, selida);

        //cs.drawImage(logotipo, 25, 25, 1300, 350);




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
        cs.showText("Invoice");
        cs.endText();


        java.util.Date date = new java.util.Date();
        System.out.println(date);
        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(400, 675);
        cs.showText("" + date);
        cs.endText();



        //aristeri pleura keimenou / predetermined text
        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(100, 590);
        cs.showText("Name:");
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(100, 570);
        cs.showText("Date of arrival:");
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(100, 550);
        cs.showText("Date of departure:");
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(100, 530);
        cs.showText("Length of stay:");
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 20);
        cs.setNonStrokingColor(81,0, 252);
        cs.newLineAtOffset(100, 210);
        cs.showText("Total:");
        cs.setNonStrokingColor(0,0, 0);
        cs.endText();






        //dexia pleura keimenou / imported data


        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(250, 590);
        cs.showText(name);
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(250, 570);
        cs.showText(dateOfArrival);
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(250, 550);
        cs.showText(dateOfDeparture);
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 14);
        cs.newLineAtOffset(250, 530);
        cs.showText("" + days);
        cs.endText();

        cs.beginText();
        cs.setFont(PDType1Font.TIMES_ROMAN, 21);
        cs.setNonStrokingColor(81,0, 252);
        cs.newLineAtOffset(250, 210);
        cs.showText(total + "€");
        cs.setNonStrokingColor(0,0, 0);
        cs.endText();




        cs.close();



        //apothikeusi egrafou pdf
        egrafo.save("D:/javaProjects/fart.pdf");
    }



}
