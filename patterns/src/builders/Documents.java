package builders;

public class Documents {

    private boolean agreement;
    private boolean bill;
    private boolean certificate;
    private boolean consignment;
    private boolean invoice;
    private boolean price;
    private boolean protocol;

    public String info(){
        String info = "";
        info += "Bill:" + bill + "\n";
        info += "Invoice:" + invoice + "\n";
        info += "Consignment:" + consignment + "\n";
        info += "Protocol:" + protocol + "\n";
        info += "Agreement:" + agreement + "\n";
        info += "Price:" + price + "\n";
        info += "Certificate:" + certificate + "\n";

        return info;
    }

    public static class Builder {
        private boolean agreement;
        private boolean bill;
        private boolean certificate;
        private boolean consignment;
        private boolean invoice;
        private boolean price;
        private boolean protocol;

        public Builder(){
        }

        public Builder agreement(boolean value){
            agreement = value;
            return this;
        }

        public Builder bill(boolean value){
            bill = value;
            return this;
        }
        public Builder certificate(boolean value){
            certificate = value;
            return this;
        }

        public Builder consignment (boolean value){
            consignment = value;
            return this;
        }

        public Builder invoice (boolean value){
            invoice = value;
            return this;
        }

        public Builder price (boolean value){
            price = value;
            return this;
        }

        public Builder protocol (boolean value){
            protocol = value;
            return this;
        }

        public Documents build(){
            Documents doc = new Documents();
            doc.bill = bill;
            doc.certificate = certificate;
            doc.invoice = invoice;
            doc.price = price;
            doc.agreement = agreement;
            doc.consignment = consignment;
            doc.protocol = protocol;
            return doc;
        }

    }

}
