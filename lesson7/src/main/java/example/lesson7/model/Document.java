package example.lesson7.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document {
    private Long id;
    private String type;
    private int quantity;
}
