package com.webapp.musicapp.MusicApp;

import com.webapp.musicapp.MusicApp.entities.Role;
import com.webapp.musicapp.MusicApp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ứng dụng được khởi động thành công");

        if(roleRepository.findByRoleName("USER").isEmpty()) {
            roleRepository.save(new Role("USER"));
        }
        if(roleRepository.findByRoleName("ADMIN").isEmpty()) {
            roleRepository.save(new Role("ADMIN"));
        }

    }
}
