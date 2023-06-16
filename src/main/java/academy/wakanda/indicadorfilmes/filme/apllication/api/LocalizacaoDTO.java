package academy.wakanda.indicadorfilmes.filme.apllication.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class LocalizacaoDTO {
    private final String longitude;
    private final String latitude;
}
