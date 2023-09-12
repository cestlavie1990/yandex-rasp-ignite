package ru.minakov.yandexraspignite.common.service;

import ru.minakov.yandexraspignite.common.repository.IEntity;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;

public interface IService<E extends IEntity<ID>, ID> {

    Optional<E> getOptionalById(final ID id);

    <R> Optional<R> getOptionalById(final ID id, final Function<E, R> mapper);

    E getById(final ID id);

    <R> R getById(final ID id, final Function<E, R> mapper);

    Collection<E> getAll();

    <R> Collection<R> getAll(final Function<E, R> mapper);
}
