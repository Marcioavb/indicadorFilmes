package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.filme.apllication.api.LocalizacaoDTO;

import java.util.List;

public interface IndicadorFilmesService {
    List<FilmeResponseData.FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
