/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithasposepdf.workingwithpages.splitpdffiletoindividualpages.java;

import com.aspose.pdf.*;

public class SplitPDFFiletoIndividualPages
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithasposepdf/workingwithpages/splitpdffiletoindividualpages/data/";

        //open first document
        com.aspose.pdf.Document pdfDocument1 = new com.aspose.pdf.Document(dataDir + "input.pdf");

        //loop through all the pages
        for (int pdfPage = 1; pdfPage<= pdfDocument1.getPages().size(); pdfPage++)
        {
            // create a new Document object
            com.aspose.pdf.Document newDocument = new com.aspose.pdf.Document();
            // get the page at particular index of Page Collection
            newDocument.getPages().add(pdfDocument1.getPages().get_Item(pdfPage));
            // save the newly generated PDF file
            newDocument.save(dataDir + "page_" + pdfPage + ".pdf");

        }

        System.out.println("Split process completed successfully!");
    }
}




