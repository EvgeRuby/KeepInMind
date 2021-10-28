package com.github.evgeruby.keepinmind.repository;

import com.github.evgeruby.keepinmind.model.StudySet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudySetRepository extends JpaRepository<StudySet, Long> {
    Optional<Object> findByName(String name);
}
