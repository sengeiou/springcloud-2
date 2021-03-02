package com.example.msauserinformationandauthority.domain.repositories;


import com.example.msauserinformationandauthority.domain.models.UserBaseinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBaseinfoRepository extends JpaRepository<UserBaseinfo, String>, QuerydslPredicateExecutor<UserBaseinfo> {
}