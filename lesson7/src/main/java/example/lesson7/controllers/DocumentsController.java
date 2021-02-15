package example.lesson7.controllers;

import example.lesson7.model.Document;
import example.lesson7.services.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/documents")
public class DocumentsController {
    private DocumentsService documentsSrvice;

    @Autowired
    public DocumentsController(DocumentsService documentsService) {
        this.documentsSrvice = documentsService;
    }

    @GetMapping
    public String showAllDocuments(Model model){
        List<Document> documents = documentsSrvice.getAllDocuments();
        model.addAttribute("documents", documents);
        return "all_documents";
    }
}
