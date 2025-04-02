package com.hmsapp.Repository;

import com.hmsapp.Entity.Images;
import com.hmsapp.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImagesRepository extends JpaRepository<Images, Long> {
    List<Images> findByProperty(Property property);
}