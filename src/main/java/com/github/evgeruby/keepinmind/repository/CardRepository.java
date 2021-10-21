package com.github.evgeruby.keepinmind.repository;

import com.github.evgeruby.keepinmind.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
