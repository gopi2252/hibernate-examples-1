package com.example.jpainheritance.repo;

import com.example.jpainheritance.domain.singletable.RetiredEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetiredEmployeeRepo extends JpaRepository<RetiredEmployee,Integer> {
}
