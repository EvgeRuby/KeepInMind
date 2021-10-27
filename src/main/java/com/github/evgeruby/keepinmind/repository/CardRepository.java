package com.github.evgeruby.keepinmind.repository;

import com.github.evgeruby.keepinmind.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {
    Optional<Object> findByName(String term);
}
