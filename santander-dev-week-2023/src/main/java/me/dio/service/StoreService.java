package me.dio.service;

import me.dio.domain.model.Store;

public interface StoreService {
    Store findById(Long id);

    Store create(Store storeToCreate);
}
