/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithasposepdf.workingwithannotations.addswffileasannotationtopdfdocument.java;

import com.aspose.pdf.Document;
import com.aspose.pdf.*;
import com.aspose.pdf.Rectangle;

public class AddSwfFileAsAnnotationToPDFDocument
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithasposepdf/workingwithannotations/addswffileasannotationtopdfdocument/data/";

        //Open the PDF document
        Document doc = new Document(dataDir + "input.pdf");

        // get reference of the page to which you need to add the annotation
        Page page = doc.getPages().get_Item(1);

        // create ScreenAnnotation object with .swf multimedia file as an argument
        ScreenAnnotation annotation = new ScreenAnnotation(page, new Rectangle(0, 400, 600, 700), dataDir + "input.swf");

        // add the annotation to annotations collection of page
        page.getAnnotations().add(annotation);

        // save the update PDF document with annotation
        doc.save(dataDir + "output.pdf");

        // Display result.
        System.out.println("Process completed Successfully!");
    }
}




