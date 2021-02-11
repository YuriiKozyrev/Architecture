package bridge.documents;


public class Invoice implements Document {

    private String documentType = "Счет-фактура";

    @Override
    public String getDocumentType() {
        return documentType;
    }
}
