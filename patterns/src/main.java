import builders.Documents;

public class main {
    public static void main(String[] args) {

        Documents doc = new Documents.Builder()
                .price(true)
                .invoice(true)
                .build();

        System.out.println(doc.info());

        Documents doc2 = new Documents.Builder()
                .price(true)
                .build();
        System.out.println(doc2.info());
    }
}
