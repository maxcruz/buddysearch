package com.buddysearch.android.data.repository;

import com.buddysearch.android.data.mapper.BaseEntityMapper;
import com.buddysearch.android.data.store.EntityStore;

public abstract class BaseDataRepository<ENTITY_STORE extends EntityStore, ENTITY_MAPPER extends BaseEntityMapper> {

    protected ENTITY_STORE dataStore;

    protected ENTITY_MAPPER entityMapper;

    public BaseDataRepository(ENTITY_STORE dataStore, ENTITY_MAPPER entityMapper) {
        this.dataStore = dataStore;
        this.entityMapper = entityMapper;
    }
}
