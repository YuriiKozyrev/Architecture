package bridge.converters;

import bridge.converters.ConvertTo;
import bridge.documents.Document;

public class ConvertToTXT implements ConvertTo {

    protected Document document;
    private String conversionType= "Convert to TXT";


    public ConvertToTXT(Document doc){
        this.document = doc;
    }

    @Override
    public String getInfo() {
        String result = document.getDocumentType() + "-->" + conversionType;
        return result;
    }
}
