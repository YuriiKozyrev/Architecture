package bridge.converters;

import bridge.documents.Document;

public class ConvertToPDF implements ConvertTo{

    protected Document document;
    private String conversionType= "Convert to PDF";


    public ConvertToPDF(Document doc){
        this.document = doc;
    }

    @Override
    public String getInfo() {
        String result = document.getDocumentType() + "-->" + conversionType;
        return result;
    }
}
