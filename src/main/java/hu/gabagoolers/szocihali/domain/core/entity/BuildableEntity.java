package hu.gabagoolers.szocihali.domain.core.entity;

import java.util.function.Consumer;

/**
 * A generic entity interface that provides a builder-like pattern.
 * It allows fluent initialization or modification of the entity using a lambda expression.
 */
public interface BuildableEntity<T extends BuildableEntity<T>> {

    /**
     * Applies a modification to the entity and returns it.
     * 
     * @param builder the consumer function containing the setter calls
     * @return the entity instance itself
     */
    @SuppressWarnings("unchecked")
    default T with(Consumer<T> builder) {
        builder.accept((T) this);
        return (T) this;
    }
}
