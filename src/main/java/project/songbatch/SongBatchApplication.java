package project.songbatch;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.songbatch.common.enums.BrandType;
import project.songbatch.song.ExecuteSong;
import project.songbatch.song.service.SongService;

@SpringBootApplication
@RequiredArgsConstructor
public class SongBatchApplication {

	private final SongService songService;

	public static void main(String[] args) {
		SpringApplication.run(SongBatchApplication.class, args);
	}

	@PostConstruct
	public void executeSong() throws ParseException {
		ExecuteSong executeSong = new ExecuteSong(songService);
		executeSong.execute(BrandType.kumyoung);
		executeSong.execute(BrandType.tj);
	}

}
