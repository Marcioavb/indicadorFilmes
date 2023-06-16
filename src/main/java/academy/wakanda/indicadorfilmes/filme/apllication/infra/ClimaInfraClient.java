package academy.wakanda.indicadorfilmes.filme.apllication.infra;

import academy.wakanda.indicadorfilmes.filme.apllication.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.filme.apllication.service.ClimaClient;
import academy.wakanda.indicadorfilmes.filme.apllication.service.ClimaDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    private final ClimaFeignClient climaFeignClient;
    private String apiKey = "d84295d4cacf008b00d6ab3c95613bce";

    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.info("[start] ClimaInfraClient - buscaClima");
        log.info("[localizacao] {}", localizacao );
        ClimaDTO climaDTO = climaFeignClient.buscaClima(localizacao.getLatitude(), localizacao.getLongitude(), apiKey);
        log.info("[finish] ClimaInfraClient - buscaClima");
        return climaDTO;
    }
}
