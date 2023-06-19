package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.apllication.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    private final ClimaClient climaClient;
    private final FilmeCategoriaRepository filmeCategoriaRepository;
//    private final FilmeClient filmeClient;

    @Override
    public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info("[start] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info("[localizacao] {}", localizacao);
        ClimaDTO clima = climaClient.buscaClima(localizacao);
        Optional<FilmeCategoria> categoria = filmeCategoriaRepository.buscaAtravesTemperatura(clima.getTemperatura());
        log.info("[categoria] {}",categoria);
//        List<FilmeResponse> filmes = filmeClient.buscaAtravesCategoria(categoria);
        log.info("[finish] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return null;
    }
}
