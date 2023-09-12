package ru.minakov.yandexraspignite.common.repository;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Builder
@ToString
@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CodeEmbedded {
    @Column
    private String esrCode;
    @Column
    private String yandexCode;
}
