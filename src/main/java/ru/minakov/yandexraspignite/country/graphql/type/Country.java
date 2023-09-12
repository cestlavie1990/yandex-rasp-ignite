package ru.minakov.yandexraspignite.country.graphql.type;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import ru.minakov.yandexraspignite.common.graphql.type.Code;

import java.util.UUID;

@Getter
@Builder
@ToString
public class Country {
    @NonNull
    private final UUID id;
    @NonNull
    private final Code code;
    @Nullable
    private final String title;
}
