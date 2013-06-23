package nl.finalist.esb.blueprint.jpa.impl;

import java.lang.reflect.ParameterizedType;

import nl.finalist.esb.blueprint.jpa.Repository;


public abstract class DomainClassRepository<T> implements Repository<T> {

    private final Class<T> domainClass;

    @SuppressWarnings("unchecked")
    protected DomainClassRepository() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.domainClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    protected final Class<T> getDomainClass() {
        return domainClass;
    }
}