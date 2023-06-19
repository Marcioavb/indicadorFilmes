package academy.wakanda.indicadorfilmes.filme.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
public class FilmeCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idIntegrationLog", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private FilmeCategoriaEnum categoria;

    private Double temperaturaMinima;
    private Double temperaturaMaxima;

    public FilmeCategoria(FilmeCategoriaEnum categoria, Double temperaturaMinima, Double temperaturaMaxima) {
        this.categoria = categoria;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }
}
