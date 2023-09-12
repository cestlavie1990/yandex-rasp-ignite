package ru.minakov.yandexraspignite.country.repository;

import lombok.*;
import ru.minakov.yandexraspignite.common.repository.CodeEmbedded;
import ru.minakov.yandexraspignite.common.repository.IEntity;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "country")
public class CountryEntity implements IEntity<UUID> {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private UUID id;
    @Embedded
    private CodeEmbedded code;
    @Column
    private String title;
    @Column(nullable = false)
    private OffsetDateTime createdAt;
    @Column(nullable = false)
    private OffsetDateTime updatedAt;
}
