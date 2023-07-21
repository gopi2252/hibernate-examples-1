package com.example.jpainheritance.repo;

import com.example.jpainheritance.domain.singletable.ActiveEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveEmployeeRepo extends JpaRepository<ActiveEmployee,Integer> {
}
