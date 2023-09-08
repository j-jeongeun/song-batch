package project.songbatch.song.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.songbatch.common.domain.Song;
import project.songbatch.song.repository.SongRepository;

@Service
@RequiredArgsConstructor
public class SongService {

    private final SongRepository songRepository;

    public void create(List<Song> songList) {
        for (Song song : songList) {
            if(songRepository.findBySongId(song).isEmpty()) {
                songRepository.create(song);
            }
        }
    }

}
