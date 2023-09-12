package ru.minakov.yandexraspignite.country.service;

import org.springframework.stereotype.Service;
import ru.minakov.yandexraspignite.common.service.AbstractService;
import ru.minakov.yandexraspignite.country.repository.CountryEntity;
import ru.minakov.yandexraspignite.country.repository.CountryRepository;

import java.util.UUID;

@Service
public class CountryService extends AbstractService<CountryEntity, UUID> {
    public CountryService(CountryRepository repository) {
        super(repository);
    }
}
