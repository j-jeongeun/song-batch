package project.songbatch.song.service;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.songbatch.common.domain.Song;
import project.songbatch.song.repository.SongRepository;

@Service
@RequiredArgsConstructor
public class SongService {

    private final SongRepository songRepository;

    public Optional<Song> findBySongId(Song song) {
        return songRepository.findBySongId(song);
    }

    public int create(Song song) {
        return songRepository.create(song);
    }

}
