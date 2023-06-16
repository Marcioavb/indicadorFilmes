package academy.wakanda.indicadorfilmes.filme.apllication.infra;

import academy.wakanda.indicadorfilmes.filme.apllication.service.ClimaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "climaClient", url = "https://api.openweathermap.org/data/2.5")
public interface ClimaFeignClient {

    @GetMapping("/weather")
    ClimaDTO buscaClima(@RequestParam("lat") String latitude,
                        @RequestParam("lon") String longitude,
                        @RequestParam("APPID") String apiKey);
}
