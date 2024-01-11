package org.example.kiemtrastring.repository;

import org.example.kiemtrastring.model.thanhPho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<thanhPho,Long> {
}