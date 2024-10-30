package com.webapp.musicapp.MusicApp.repository;

import com.webapp.musicapp.MusicApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
