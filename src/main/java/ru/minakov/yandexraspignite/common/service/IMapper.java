package ru.minakov.yandexraspignite.common.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface IMapper<S, T> {
    T map(final S source);

    default List<T> map(final Collection<S> source) {
        return source.stream().map(this::map).collect(Collectors.toList());
    }
}
