package example.lesson7.services;

import example.lesson7.model.Document;
import example.lesson7.repositories.DocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentsService {
    private DocumentsRepository documentsRepository;

    @Autowired
    public void setDocumentsRepository(DocumentsRepository documentsRepository){
        this.documentsRepository = documentsRepository;
    }

    public List<Document> getAllDocuments(){
        return documentsRepository.findAll();
    }
}
