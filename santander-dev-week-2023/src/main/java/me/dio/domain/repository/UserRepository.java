package me.dio.domain.repository;

import me.dio.domain.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Store, Long> {

}
