package academy.wakanda.indicadorfilmes.filme.infra;

import academy.wakanda.indicadorfilmes.filme.apllication.domain.FilmeCategoria;
import academy.wakanda.indicadorfilmes.filme.apllication.service.FilmeCategoriaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class FilmeCategoriaInfraRepository implements FilmeCategoriaRepository {
    @Override
    public FilmeCategoria buscaAtravesTemperatura(double temperatura) {
        log.info("[start] FilmeCategoriaInfraRepository - buscaAtravesTemperatura");

        log.info("[finish] FilmeCategoriaInfraRepository - buscaAtravesTemperatura");
        return null;
    }
}
