package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.domain.FilmeCategoria;

public interface FilmeCategoriaRepository {
    FilmeCategoria buscaAtravesTemperatura(double temperatura);
}
