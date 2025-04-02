package com.hmsapp.Repository;

import com.hmsapp.Entity.AppUser;
import com.hmsapp.Entity.Property;
import com.hmsapp.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ReviewRepository extends JpaRepository<Review, Long> {

  List<Review> findByAppUser(AppUser user);
  Optional<Review> findByAppUserAndProperty(AppUser appuser, Property property);
}