package ru.minakov.yandexraspignite.common.graphql.type;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Code {
    private final String esrCode;
    private final String yandexCode;
}
