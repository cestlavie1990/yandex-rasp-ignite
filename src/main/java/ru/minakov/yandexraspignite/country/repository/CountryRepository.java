package ru.minakov.yandexraspignite.country.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountryEntity, UUID> {
}
