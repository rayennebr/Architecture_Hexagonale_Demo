package com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.repositories;

import com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity, UUID> {
}
