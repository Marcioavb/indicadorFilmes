package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.Optional;

public interface FilmeCategoriaRepository {
    FilmeCategoria buscaAtravesTemperatura(Double temperatura);
}

