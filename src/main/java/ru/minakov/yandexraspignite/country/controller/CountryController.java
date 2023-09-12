package ru.minakov.yandexraspignite.country.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.minakov.yandexraspignite.country.graphql.type.Country;
import ru.minakov.yandexraspignite.country.service.CountryMapper;
import ru.minakov.yandexraspignite.country.service.CountryService;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class CountryController {
    private final CountryService service;

    @QueryMapping
    public Country country(@Argument final UUID id) {
        return service.getById(id, CountryMapper.INSTANCE::map);
    }

    @QueryMapping
    public List<Country> countries() {
        return service.getAll(CountryMapper.INSTANCE::map);
    }

    @MutationMapping
    public Integer refreshCountries() {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
