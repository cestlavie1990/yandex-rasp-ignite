package ru.minakov.yandexraspignite.common.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import ru.minakov.yandexraspignite.common.repository.IEntity;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class AbstractService<E extends IEntity<ID>, ID> implements IService<E, ID> {
    protected final CrudRepository<E, ID> repository;

    @Override
    public Optional<E> getOptionalById(ID id) {
        return repository.findById(id);
    }

    @Override
    public <R> Optional<R> getOptionalById(ID id, Function<E, R> mapper) {
        return getOptionalById(id).map(mapper);
    }

    @Override
    public E getById(ID id) {
        return getOptionalById(id).orElseThrow(notFoundException(id));
    }

    @Override
    public <R> R getById(ID id, Function<E, R> mapper) {
        return getOptionalById(id).map(mapper).orElseThrow(notFoundException(id));
    }

    @Override
    public List<E> getAll() {
        return (List<E>) repository.findAll();
    }

    @Override
    public <R> List<R> getAll(Function<E, R> mapper) {
        return getAll().stream().map(mapper).collect(Collectors.toList());
    }

    Supplier<EntityNotFoundException> notFoundException(final ID id) {
        return () -> new EntityNotFoundException("Entity not found by " + id);
    }
}
