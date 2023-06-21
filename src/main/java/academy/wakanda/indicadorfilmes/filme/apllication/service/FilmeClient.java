package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.filme.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponseData.FilmeResponse> buscaAtravesCategoria(FilmeCategoria categoria);
}
