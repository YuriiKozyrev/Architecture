package bridge;

import bridge.converters.*;
import bridge.documents.Bill;
import bridge.documents.Document;
import bridge.documents.Invoice;

public class mainAppBridge {
    public static void main(String[] args) {

        Document bill = new Bill();
        Document invoice = new Invoice();

        ConvertTo convertToPDF = new ConvertToPDF(bill);
        ConvertTo convertToTXT = new ConvertToTXT(invoice);

        System.out.println(convertToPDF.getInfo());
        System.out.println(convertToTXT.getInfo());



    }

}
