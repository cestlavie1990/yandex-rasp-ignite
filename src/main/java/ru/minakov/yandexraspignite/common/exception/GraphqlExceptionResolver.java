package ru.minakov.yandexraspignite.common.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@Component
public class GraphqlExceptionResolver extends DataFetcherExceptionResolverAdapter {
    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        ex.printStackTrace();

        final var error = GraphqlErrorBuilder.newError(env)
                .message(ex.getMessage())
                .errorType(ErrorType.INTERNAL_ERROR)
                .path(env.getExecutionStepInfo().getPath())
                .location(env.getField().getSourceLocation());

        if (ex instanceof EntityNotFoundException) {
            error.errorType(ErrorType.NOT_FOUND);
        }

        return error.build();
    }
}
