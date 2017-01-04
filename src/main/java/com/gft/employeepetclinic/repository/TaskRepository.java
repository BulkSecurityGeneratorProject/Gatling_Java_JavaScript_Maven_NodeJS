package com.gft.employeepetclinic.repository;

import com.gft.employeepetclinic.domain.Task;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Task entity.
 */
@SuppressWarnings("unused")
public interface TaskRepository extends JpaRepository<Task,Long> {

}
