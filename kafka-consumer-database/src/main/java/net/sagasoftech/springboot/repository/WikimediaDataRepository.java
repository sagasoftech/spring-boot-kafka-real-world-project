package net.sagasoftech.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sagasoftech.springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
