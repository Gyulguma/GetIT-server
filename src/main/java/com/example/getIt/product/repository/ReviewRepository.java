package com.example.getIt.product.repository;

import com.example.getIt.product.entity.ReviewEntity;
import com.example.getIt.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {
    List<ReviewEntity> findAllByUserIdx(UserEntity userEntity);
}
