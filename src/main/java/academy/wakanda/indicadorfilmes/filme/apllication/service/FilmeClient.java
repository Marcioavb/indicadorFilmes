package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria);
}
