package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.filme.apllication.api.LocalizacaoDTO;

import java.util.List;

public interface IndicadorFilmesService {
    List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
