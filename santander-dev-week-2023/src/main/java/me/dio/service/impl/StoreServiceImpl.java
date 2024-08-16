package me.dio.service.impl;

import me.dio.domain.model.Store;
import me.dio.domain.repository.StoreRepository;
import me.dio.service.StoreService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store findById(Long id) {
        return storeRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Store create(Store storeToCreate) {
        if (storeToCreate.getId() != null && storeRepository.existsById(storeToCreate.getId())) {
            throw new IllegalArgumentException("This Store id is already in use");
        }
        return storeRepository.save(storeToCreate);
    }
}
