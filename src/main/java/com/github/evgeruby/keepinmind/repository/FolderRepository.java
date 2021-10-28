package com.github.evgeruby.keepinmind.repository;

import com.github.evgeruby.keepinmind.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    Optional<Object> findByName(String name);
}
