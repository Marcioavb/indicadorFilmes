package academy.wakanda.indicadorfilmes.filme.apllication.service;

import academy.wakanda.indicadorfilmes.filme.apllication.api.LocalizacaoDTO;

public interface ClimaClient {
    ClimaDTO buscaClima(LocalizacaoDTO localizacao);
}
