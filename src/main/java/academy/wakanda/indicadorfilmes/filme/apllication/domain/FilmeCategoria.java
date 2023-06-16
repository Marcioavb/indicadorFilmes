package academy.wakanda.indicadorfilmes.filme.apllication.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class FilmeCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idIntegrationLog", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private FilmeCategoriaEnum categoria;

    private Double temperaturaMinima;
    private Double temperaturaMaxima;
}
