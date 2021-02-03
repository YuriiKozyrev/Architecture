package bridge.documents;


public class Bill implements Document {

    private String documentType = "Счет";

    @Override
    public String getDocumentType() {
        return documentType;
    }

}
