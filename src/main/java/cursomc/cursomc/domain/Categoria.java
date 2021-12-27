package cursomc.cursomc.domain;



import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;

}
