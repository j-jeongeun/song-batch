package project.songbatch.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import project.songbatch.common.enums.BrandType;

public class Util {

    public static ResponseEntity<String> getSongListFromApi(BrandType brand) {
        return new RestTemplate().exchange(
            getSearchUrl(brand),
            HttpMethod.GET,
            null,
            String.class
        );
    }

    public static String getSearchUrl(BrandType brand) {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return "https://api.manana.kr/karaoke/release/"+now+"/"+brand+".json";
    }

}
