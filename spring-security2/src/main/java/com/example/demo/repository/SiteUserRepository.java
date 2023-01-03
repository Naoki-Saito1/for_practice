package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SiteUser;

public interface SiteUserRepository extends JpaRepository<SiteUser,Long> {
	Optional<SiteUser> findByUsername(String username);//Stirng username;はNullの可能性があるもの
	boolean existsByUsername(String username);//条件に一致するレコードが存在するかをチェックして(true/false)を返却する
}

