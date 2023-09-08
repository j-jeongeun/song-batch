package project.songbatch.common.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.songbatch.common.enums.BrandType;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Song {

    private Long id;
    private String title;
    private String singer;
    private long no;
    private BrandType brand;

    public Song(BrandType brand, long no, String title, String singer) {
        this.brand = brand;
        this.no = no;
        this.title = title;
        this.singer = singer;
    }
}
