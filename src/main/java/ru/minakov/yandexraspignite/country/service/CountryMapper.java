package ru.minakov.yandexraspignite.country.service;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.minakov.yandexraspignite.common.service.IMapper;
import ru.minakov.yandexraspignite.country.graphql.type.Country;
import ru.minakov.yandexraspignite.country.repository.CountryEntity;

@Mapper
public interface CountryMapper extends IMapper<CountryEntity, Country> {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
}
