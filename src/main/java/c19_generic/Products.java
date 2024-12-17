package c19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Products<T> {
    private String productName;
    private T productInfo;
}
