package academy.wakanda.indicadorfilmes.filme.apllication.api;

import academy.wakanda.indicadorfilmes.filme.apllication.api.FilmeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/indicadorfilme")
@Log4j2
public class IndicadorFilmesAPI {

    @GetMapping
    public List<FilmeResponse> indicaFilmes(@RequestParam String longitude, @RequestParam String latitude){
        log.info("[start] IndicadorFilmesAPI - indicarFilmes");
        log.info("[longitude] {} - [latitude] {}", longitude, latitude);
        log.info("[finish] IndicadorFilmesAPI - indicarFilmes");
        return  null;
    }
}
