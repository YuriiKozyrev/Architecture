package example.lesson7.repositories;

import example.lesson7.model.Document;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class DocumentsRepository {
    private List<Document> documents;

    @PostConstruct
    public void init(){
        this.documents = new ArrayList<>();
        this.documents.add(new Document(1L, "Bill", 1));
        this.documents.add(new Document(2L, "Invoice", 2));
    }

    public List<Document> findAll(){
        return Collections.unmodifiableList(documents);
    }
}
