package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Poster {
    private int id;
    private int pictureId;
    private String filmName;
    private String filmGenre;
}
