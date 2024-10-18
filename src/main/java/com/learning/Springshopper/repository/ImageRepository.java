package com.learning.Springshopper.repository;

import com.learning.Springshopper.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
